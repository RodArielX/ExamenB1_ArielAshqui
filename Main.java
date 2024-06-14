public class Main {
    public static void main (String[] args){
        Ticket ticket1 = new Ticket("Ariel", "Asqui", 1751086628,
                1241244,21,20,"Quito - Guayaquil", 6.75);
        System.out.println("************************************");
        ticket1.calcularCosto();
        ticket1.mostrarInfo();

        Ticket ticket2 = new Ticket("Mateo", "Carvajal", 1213134,
                1312441,22,17.50,"Quito - Tulcan", 3.00);
        System.out.println("************************************");
        ticket2.calcularCosto();
        ticket2.mostrarInfo();

        Ticket ticket3 = new Ticket("Matias", "Pozo", 171731413,
                243553534,23,15,"Quito - Puyo", 6.75);
        System.out.println("************************************");
        ticket3.calcularCosto();
        ticket3.mostrarInfo();

        Ticket ticket4 = new Ticket("Gabriel", "Orve", 171231313,
                712461872,24,17.50,"Quito - Riobamba", 3.00);
        System.out.println("************************************");
        ticket4.calcularCosto();
        ticket4.mostrarInfo();
    }
}
