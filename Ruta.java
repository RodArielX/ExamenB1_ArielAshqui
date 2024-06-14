public class Ruta {
    private String origen;
    private String destino;
    private double precioBase;

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getPrecioBase() {
        return precioBase;
    }
    public Ruta(String origen, String destino, double precioBase){
        this.origen = origen;
        this.destino = destino;
        this.precioBase = precioBase;
    }
}
