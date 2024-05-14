package Conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {

    private static Connection con = null;

    public static Connection getConnection() {
        try {
            if (con == null) {
                String url = "jdbc:mysql://bcvbw1swuma9znau6vsb-mysql.services.clever-cloud.com:3306/bcvbw1swuma9znau6vsb?serverTimezone=UTC";
                String user = "umlzt1qr39qj9vkv";
                String passwd = "rqZNlL34t4bMcYIhXpqp";
                con = DriverManager.getConnection(url, user, passwd);
                System.out.println("Conexión creada satisfactoriamente!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }
}
