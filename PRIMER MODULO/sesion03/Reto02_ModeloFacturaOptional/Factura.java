package sesion03.Reto02_ModeloFacturaOptional;

import java.util.Optional;

public class Factura {
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    public String getResumen() {
        return "Descripción: " + descripcion + "\nMonto: $" + monto + "\nRFC: " +
                rfc.orElse("[No proporcionado]");
    }
}