import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class ConsumoCriticoException extends Exception {
    public ConsumoCriticoException(String mensaje) {
        super(mensaje);
    }
}

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> consumos = new HashSet<>();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Ingresa el consumo de CPU (%): ");
                String entrada = scanner.nextLine();

                int valor = Integer.parseInt(entrada);

                if (valor < 0 || valor > 100) {
                    throw new IllegalArgumentException("Valor fuera de rango (0-100).");
                }

                if (!consumos.add(valor)) {
                    System.out.println("Valor duplicado, no se agregará.");
                    continue;
                }

                if (valor > 95) {
                    throw new ConsumoCriticoException("¡Consumo crítico detectado: " + valor + "%!");
                }

                System.out.println("Registro aceptado.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no numérica.");
        } catch (IllegalArgumentException | ConsumoCriticoException e) {
            System.out.println("Advertencia: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Monitoreo finalizado.");
        }
    }
}
