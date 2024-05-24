package modelos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductoDAO {

    Connection con = Conexion.Conexion.getConnection();

    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public List<Producto> listar() {
        String sql = "";
        List<Producto> productos = new ArrayList<>();

        try {
            sql = "SELECT * FROM producto";
            

            // Utilizar una consulta parametrizada para evitar SQL Injection
            ps = con.prepareStatement(sql);
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

            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return productos;
    }

    public void agregar(Producto producto) {
        String sql = "INSERT INTO producto(codigo_producto, nombre, gama, dimensiones, proveedor, descripcion, cantidad_en_stock, "
                + "precio_venta, precio_proveedor) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getCodigo_producto());
            ps.setString(2, producto.getNombre());
            ps.setString(3, producto.getGama());
            ps.setString(4, producto.getDimensiones());
            ps.setString(5, producto.getProveedor());
            ps.setString(6, producto.getDescripcion());
            ps.setInt(7, producto.getCantidad_en_stock());
            ps.setFloat(8, producto.getPrecio_venta());
            ps.setFloat(9, producto.getPrecio_proveedor());

            int resultado = ps.executeUpdate();
            if (resultado >0) {
                JOptionPane.showMessageDialog(null, "La inserción se realizó correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar el producto", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizar(Object[] o) {
        String sql = "UPDATE producto SET nombre=?, gama=?, dimensiones=?, proveedor=?, "
                + "descripcion=?, precio_venta=?, precio_proveedor=? WHERE codigo_producto=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[1]);
            ps.setObject(2, o[2]);
            ps.setObject(3, o[3]);
            ps.setObject(4, o[4]);
            ps.setObject(5, o[5]);
            ps.setObject(6, o[6]);
            ps.setObject(7, o[7]);
            ps.setObject(8, o[0]);

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
        String sql = "UPDATE producto SET cantidad_en_stock = ? WHERE codigo_producto LIKE ?";

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

    public void eliminar(String codigo_producto) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Historial_productos.txt", true))) {
            writer.write("Código del Producto: " + codigo_producto);
            writer.newLine();
            JOptionPane.showMessageDialog(null, "El producto " + codigo_producto + " se eliminó correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Producto> mostrarHistorial() {
        List<Producto> lista = new ArrayList<>();
        String parametroConsulta = "";
        List<String> codigosHistorial = buscarHistorial();
        String sql = "SELECT * FROM producto WHERE lower(codigo_producto) LIKE IN (?)";

        if (!codigosHistorial.isEmpty()) {
            for (int i = 0; i < codigosHistorial.size(); i++) {
                parametroConsulta += codigosHistorial.get(i);
                if (i < codigosHistorial.size() - 1) {
                    parametroConsulta += ",";
                }
            }

            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, parametroConsulta.toLowerCase());
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
                JOptionPane.showMessageDialog(null, "Error: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return lista;
    }

    public List<String> buscarHistorial() {
        List<String> codigosHistorial = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("Historial_productos.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] partes = line.split(": ");
                String codigo = partes[1];
                codigosHistorial.add(codigo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return codigosHistorial;
    }
}
