package sesion03.Reto01_ReservaVuelos;

public class Principal {
    public static void main(String[] args) {
        Pasajero pasajero = new Pasajero("Ana Martínez", "P123456");
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        vuelo.reservarAsiento(pasajero);
        System.out.println(vuelo.obtenerItinerario());

        vuelo.cancelarReserva();
        System.out.println("\nCancelando reserva...\n" + vuelo.obtenerItinerario());

        vuelo.reservarAsiento("Mario Gonzalez", "P654321");
        System.out.println("\n" + vuelo.obtenerItinerario());
    }
}