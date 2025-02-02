package AccesoDatos;

import LogicaNegocio.Reserva;
import java.sql.*;

public class ReservaDAO {
    public boolean agregarReserva(Reserva reserva) {
        String sql = "INSERT INTO reservas (nombre_cliente, fecha, sitio) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, reserva.getNombreCliente());
            stmt.setString(2, reserva.getFecha());
            stmt.setString(3, reserva.getSitio());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
    }
}