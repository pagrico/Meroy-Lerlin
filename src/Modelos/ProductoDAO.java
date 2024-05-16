package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductoDAO {

    Connection con = Conexion.Conexion.getConnection();
    
    PreparedStatement ps;
    ResultSet rs;

    public List<Producto> listar() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM Producto";

        try {
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Producto Producto = new Producto(
                        rs.getString("codigo_producto"),
                        rs.getString("nombre"),
                        rs.getString("gama"),
                        rs.getString("dimensiones"),
                        rs.getString("proveedor"),
                        rs.getString("descripcion"),
                        rs.getInt("cantidad_en_stock"),
                        rs.getFloat("precio_venta"),
                        rs.getFloat("precio_proveedor")
                );
                lista.add(Producto);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }

        return lista;
    }

    public void agregar(Object[] o) {
        String sql = "INSERT INTO Producto(codigo_producto, nombre, gama, dimensiones, proveedor, descripcion, cantidad_en_stock, "
                + "precio_venta, precio_proveedor) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[7]);
            ps.setObject(9, o[8]);

            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "La inserción se realizó correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar el producto", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizar(Object[] o) {
        String sql = "UPDATE Producto SET nombre LIKE TRIM(?), gama LIKE TRIM(?), dimensiones=?, proveedor LIKE TRIM(?), descripcion like ?, cantidad_en_stock=?, "
                + "precio_venta=?, precio_proveedor=? WHERE codigo_producto LIKE TRIM(?)";

        try {
            
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[1]);
            ps.setObject(2, o[2]);
            ps.setObject(3, o[3]);
            ps.setObject(4, o[4]);
            ps.setObject(5, o[5]);
            ps.setObject(6, o[6]);
            ps.setObject(7, o[7]);
            ps.setObject(8, o[8]);
            ps.setObject(9, o[0]);

            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "El producto " + o[0] + " se modificó correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar el producto " + o[0], "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizarStock(String codigoProducto, int cantidad) {
        String sql = "UPDATE Producto SET cantidad_en_stock = ? WHERE codigo_producto LIKE TRIM(?)";

        try {
           
            ps = con.prepareStatement(sql);
            ps.setInt(1, cantidad);
            ps.setString(2, codigoProducto);

            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se agregó " + cantidad + " unidades al stock del producto " + codigoProducto);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar stock al producto " + codigoProducto, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminar(String codigoProducto) {
        int r = 0;
        String sql = "DELETE FROM Producto WHERE codigo_producto=?";

        try {
           
            ps = con.prepareStatement(sql);
            ps.setString(1, codigoProducto);
            ps.executeUpdate();

            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "El producto " + codigoProducto + " se eliminó correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el producto " + codigoProducto, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }

    public List<Producto> buscarProducto(int tipo, String parametro) {
        String sql = "";
        List<Producto> productos = new ArrayList<>();

        switch (tipo) {
            case 1:
                sql = "SELECT * FROM Producto WHERE codigo_producto LIKE TRIM(?)";
                break;
            case 2:
                sql = "SELECT * FROM Producto WHERE nombre LIKE TRIM(?)";
                break;
            case 3:
                sql = "SELECT * FROM Producto WHERE gama LIKE TRIM(?)";
                break;
            case 4:
                sql = "SELECT * FROM Producto WHERE proveedor LIKE TRIM(?)";
                break;
        }

        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, parametro);
            rs = ps.executeQuery();

            while (rs.next()) {
                Producto producto = new Producto(
                        rs.getString("codigo_producto"),
                        rs.getString("nombre"),
                        rs.getString("gama"),
                        rs.getString("dimensiones"),
                        rs.getString("proveedor"),
                        rs.getString("descripcion"),
                        rs.getInt("cantidad_en_stock"),
                        rs.getFloat("precio_venta"),
                        rs.getFloat("precio_proveedor")
                );
                productos.add(producto);
            }

            if (productos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontraron productos para el parámetro: " + parametro, "Sin resultados", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return productos;
    }
    
}
