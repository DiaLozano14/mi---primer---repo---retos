package sesion05.Reto02_SistemaPagos;

public class PagoTransferencia extends MetodoPago implements Autenticable {
    public PagoTransferencia(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        return false; // Simulación de falla en validación bancaria
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando transferencia bancaria por $" + monto);
    }
}