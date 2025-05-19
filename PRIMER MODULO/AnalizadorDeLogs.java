import java.io.*;
import java.nio.file.*;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        Path archivoLog = Paths.get("errores.log");
        int errores = 0;
        int advertencias = 0;
        int total = 0;

        try (BufferedReader lector = Files.newBufferedReader(archivoLog)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                total++;
                if (linea.contains("ERROR")) errores++;
                if (linea.contains("WARNING")) advertencias++;
            }

            System.out.println("Total de líneas leídas: " + total);
            System.out.println("Cantidad de errores: " + errores);
            System.out.println("Cantidad de advertencias: " + advertencias);

            double porcentaje = ((errores + advertencias) * 100.0) / total;
            System.out.printf("Porcentaje de líneas con errores/advertencias: %.2f%%\n", porcentaje);

        } catch (IOException e) {
            try {
                Files.writeString(Paths.get("registro_fallos.txt"), "Error al leer archivo: " + e.getMessage());
                System.out.println("Ocurrió un error y se registró en registro_fallos.txt");
            } catch (IOException ex) {
                System.out.println("No se pudo escribir el archivo de errores.");
            }
        }
    }
}
