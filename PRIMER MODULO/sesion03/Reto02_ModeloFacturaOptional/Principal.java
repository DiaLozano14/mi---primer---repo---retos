package sesion03.Reto02_ModeloFacturaOptional;

public class Principal {
    public static void main(String[] args) {
        Factura f1 = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");
        Factura f2 = new Factura(1800.0, "Reparación de equipo", null);

        System.out.println("Factura generada:\n" + f1.getResumen() + "\n");
        System.out.println("Factura generada:\n" + f2.getResumen());
    }
}