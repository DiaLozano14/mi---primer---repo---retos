package sesion05.Reto01_UnidadesEmergencia;

public class Operador {
    private String nombre;

    public Operador(String nombre) {
        this.nombre = nombre;
    }

    public void reportarse() {
        System.out.println("Operador " + nombre + " reportándose.");
    }
}