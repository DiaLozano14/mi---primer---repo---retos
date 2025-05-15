package sesion05.Reto01_UnidadesEmergencia;

public class CentralEmergencias {
    public static void main(String[] args) {
        new Ambulancia().iniciarOperacion();
        System.out.println();
        new Patrulla().iniciarOperacion();
        System.out.println();
        new UnidadBomberos().iniciarOperacion();
    }
}