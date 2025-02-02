package LogicaNegocio;

public class Reserva {
    private final String nombreCliente;
    private final String fecha;
    private final String sitio;
    
    public Reserva(String nombreCliente, String fecha, String sitio) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.sitio = sitio;
    }
    
    public String getNombreCliente() { return nombreCliente; }
    public String getFecha() { return fecha; }
    public String getSitio() { return sitio; }
}