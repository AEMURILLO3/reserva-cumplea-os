package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Capa de Datos - Conexión a MySQL
public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/reservas";
    private static final String USER = "root";
    private static final String PASSWORD = "Aemo571988";

    public static Connection getConnection() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("✅ Conexión exitosa a MySQL");
        return conn;
    } catch (ClassNotFoundException e) {
        System.out.println("❌ Error: No se encontró el Driver de MySQL.");
        e.printStackTrace();
        return null;
    } catch (SQLException e) {
        System.out.println("❌ Error en la conexión a MySQL: " + e.getMessage());
        e.printStackTrace();
        return null;
    }
}

}