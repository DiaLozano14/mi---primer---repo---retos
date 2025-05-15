package sesion03.Reto01_ReservaVuelos;

public class Vuelo {
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado;

    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
    }

    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        }
        return false;
    }

    public boolean reservarAsiento(String nombre, String pasaporte) {
        return reservarAsiento(new Pasajero(nombre, pasaporte));
    }

    public void cancelarReserva() {
        asientoReservado = null;
    }

    public String obtenerItinerario() {
        return "Código: " + codigoVuelo + "\nDestino: " + destino + "\nSalida: " + horaSalida + "\nPasajero: " +
               (asientoReservado != null ? asientoReservado.getNombre() : "[Sin reserva]");
    }
}