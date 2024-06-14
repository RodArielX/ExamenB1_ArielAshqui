class Ruta extends Ticket{
    double valorQuito_Guayaquil;
    double valorQuito_Tulcan;
    double valorQuito_Puyo;
    double valorQuito_Riobamba;

    public Ruta(String nombre, String apellido, int cedula, int telefono, int numero, double precio,
                String ruta, double servicio, double valorQuito_Guayaquil, double valorQuito_Tulcan, double valorQuito_Puyo,
                double valorQuito_Riobamba){
        super(nombre, apellido, cedula, telefono, numero, precio, ruta, servicio);
        this.valorQuito_Guayaquil = valorQuito_Guayaquil;
        this.valorQuito_Tulcan = valorQuito_Tulcan;
        this.valorQuito_Puyo = valorQuito_Puyo;
        this.valorQuito_Riobamba = valorQuito_Riobamba;
    }

}

