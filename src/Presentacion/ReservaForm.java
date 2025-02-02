package Presentacion;

import AccesoDatos.ReservaDAO;
import LogicaNegocio.Reserva;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class ReservaForm extends JFrame {
    private JTextField txtNombre;
    private JTextField txtFecha;
    private JTextField txtSitio;
    private final JButton btnReservar;
    
    public ReservaForm() {
        setTitle("Reserva de Sitios");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(10, 10, 100, 20);
        add(lblNombre);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(120, 10, 150, 20);
        add(txtNombre);
        
        JLabel lblFecha = new JLabel("Fecha:");
        lblFecha.setBounds(10, 40, 100, 20);
        add(lblFecha);
        
        txtFecha = new JTextField();
        txtFecha.setBounds(120, 40, 150, 20);
        add(txtFecha);
        
        JLabel lblSitio = new JLabel("Sitio:");
        lblSitio.setBounds(10, 70, 100, 20);
        add(lblSitio);
        
        txtSitio = new JTextField();
        txtSitio.setBounds(120, 70, 150, 20);
        add(txtSitio);
        
        btnReservar = new JButton("Reservar");
        btnReservar.setBounds(100, 110, 100, 30);
        add(btnReservar);
        
        btnReservar.addActionListener((ActionEvent e) -> {
            String nombre = txtNombre.getText();
            String fecha = txtFecha.getText();
            String sitio = txtSitio.getText();
            Reserva reserva = new Reserva(nombre, fecha, sitio);
            ReservaDAO dao = new ReservaDAO();
            if (dao.agregarReserva(reserva)) {
                JOptionPane.showMessageDialog(null, "Reserva registrada exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar la reserva");
            }
        });
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ReservaForm().setVisible(true));
    }
}
