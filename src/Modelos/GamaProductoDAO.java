package modelos;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GamaProductoDAO {

    Connection con = Conexion.Conexion.getConnection();

    PreparedStatement ps;
    ResultSet rs;

    public List<GamaProducto> listar() {
        List<GamaProducto> lista = new ArrayList<>();
        String sql = "SELECT * FROM gama_producto";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                GamaProducto gamaProducto = new GamaProducto(
                        rs.getString("gama"),
                        rs.getString("descripcion_texto"),
                        rs.getString("descripcion_html"),
                        rs.getString("imagen")
                );
                lista.add(gamaProducto);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }

        return lista;
    }

    public void agregar(Object[] o) {
        String sql = "INSERT INTO gama_producto(gama, descripcion_texto, descripcion_html, imagen) VALUES (?, ?, ?, ?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);

            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "La inserción se realizó correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar la gamaProducto", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizar(Object[] o) {
        String sql = "UPDATE gama_producto SET descripcion_texto=?, descripcion_html=?, imagen=? WHERE gama=?";

        try {

            ps = con.prepareStatement(sql);
            ps.setObject(1, o[1]);
            ps.setObject(2, o[2]);
            ps.setObject(3, o[3]);
            ps.setObject(4, o[0]);

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

    public void eliminar(String codigoProducto) {
        int r = 0;
        String sql = "DELETE FROM gama_producto WHERE gama=?";

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
}
