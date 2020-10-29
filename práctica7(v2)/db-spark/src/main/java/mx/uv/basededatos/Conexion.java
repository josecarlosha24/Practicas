package mx.uv.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static String url = "jdbc:mysql://127.0.0.1:3306/ejemplo_simple?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String user = "root";
    private static String password = "";
    private static Connection connection = null;

    public static Connection getConnection(){
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Success connection!");
        } catch (Exception e) {
            System.out.println("Failed to create the database connection!");
        }
        return connection;
    }
}
