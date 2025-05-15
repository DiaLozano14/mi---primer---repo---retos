package sesion05.Reto02_SistemaPagos;

public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
            new PagoEfectivo(150.0),
            new PagoTarjeta(320.0),
            new PagoTransferencia(800.0)
        };

        for (MetodoPago pago : pagos) {
            Autenticable a = (Autenticable) pago;
            if (a.autenticar()) {
                System.out.println("Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válida.");
            }
            System.out.println();
        }
    }
}