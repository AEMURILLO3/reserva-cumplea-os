package MAIN;

import AccesoDatos.Conexion;
import java.sql.Connection;

public class TestConexion {
    public static void main(String[] args) {
        Connection conn = Conexion.getConnection();
        if (conn != null) {
            System.out.println("✅ Conexión exitosa a la base de datos");
        } else {
            System.out.println("❌ Error en la conexión");
        }
    }
}

