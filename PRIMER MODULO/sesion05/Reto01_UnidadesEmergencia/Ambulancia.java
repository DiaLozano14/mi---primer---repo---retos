package sesion05.Reto01_UnidadesEmergencia;

public class Ambulancia extends UnidadEmergencia {
    private SistemaGPS gps = new SistemaGPS();
    private Sirena sirena = new Sirena();
    private Operador operador = new Operador("Juan");

    public Ambulancia() {
        super("Ambulancia");
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public void responder() {
        System.out.println("Ambulancia en camino al hospital más cercano.");
    }
}