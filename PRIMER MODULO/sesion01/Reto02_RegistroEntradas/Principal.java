package sesion01.Reto02_RegistroEntradas;

public class Principal {
    public static void main(String[] args) {
        Entrada e1 = new Entrada("Obra de Teatro", 450.0);
        Entrada e2 = new Entrada("Concierto", 600.0);

        e1.mostrarInformacion();
        e2.mostrarInformacion();
    }
}