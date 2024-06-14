public class Pasajeros {
    String nombre;
    String apellido;
    int cedula;
    int telefono;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public int getTelefono() {
        return telefono;
    }
    public Pasajeros(String nombre, String apellido, int cedula, int telefono ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public void mostrarInfo(){
        System.out.println("Informacion del cliente");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Telefono: " + getTelefono());
    }
}

