class Ticket extends Pasajeros {
    int numero;
    double precio;
    String ruta;
    double servicio;

    public double getServicio() {
        return servicio;
    }

    public Ticket(String nombre, String apellido, int cedula, int telefono, int numero, double precio,
                  String ruta, double servicio) {
        super(nombre, apellido, cedula, telefono);
        this.numero = numero;
        this.precio = precio;
        this.ruta = ruta;
        this.servicio = servicio;
    }

    public double calcularCosto(){
        double totalCosto = precio + servicio;
        return totalCosto;
    }
    public void imprimirDatos() {
        System.out.println("Informacion Ticket");
        System.out.println("Número de Ticket: " + numero);
        System.out.println("Precio del Pasaje:" + precio);
        System.out.println("Ruta: " + ruta);
        System.out.println("Total costo: " + calcularCosto());
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Informacion Ticket");
        System.out.println("Número de Ticket: " + numero);
        System.out.println("Precio del Pasaje:" + precio);
        System.out.println("Ruta: " + ruta);
        System.out.println("Total costo: " + calcularCosto());
    }
}
