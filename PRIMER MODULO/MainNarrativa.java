interface TransicionHistoria {
    void siguienteEscena();
}

interface GestorDialogo {
    void mostrarDialogo(String dialogo);
}

interface LogicaDecision {
    boolean tomarDecision(String opcion);
}

class TransicionSimple implements TransicionHistoria {
    public void siguienteEscena() {
        System.out.println("Transición simple a la siguiente escena...");
    }
}

class DialogoTexto implements GestorDialogo {
    public void mostrarDialogo(String dialogo) {
        System.out.println("Diálogo: " + dialogo);
    }
}

class DecisionBinaria implements LogicaDecision {
    public boolean tomarDecision(String opcion) {
        return "A".equalsIgnoreCase(opcion);
    }
}

public class MainNarrativa {
    public static void main(String[] args) {
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        String eleccion = "A"; // Simulando decisión del jugador

        if (decision.tomarDecision(eleccion)) {
            dialogo.mostrarDialogo("Has elegido ayudar al aldeano.");
        } else {
            dialogo.mostrarDialogo("Has decidido ignorar la petición.");
        }

        transicion.siguienteEscena();
    }
}
