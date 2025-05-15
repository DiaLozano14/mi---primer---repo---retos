package sesion05.Reto02_SistemaPagos;

public class PagoTarjeta extends MetodoPago implements Autenticable {
    private double fondosDisponibles = 500.0;

    public PagoTarjeta(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        return monto <= fondosDisponibles;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta por $" + monto);
    }
}