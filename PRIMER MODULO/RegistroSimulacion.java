import java.io.IOException;
import java.nio.file.*;

public class RegistroSimulacion {
    public static void main(String[] args) {
        Path carpeta = Paths.get("config");
        Path archivo = carpeta.resolve("parametros.txt");

        try {
            if (!Files.exists(carpeta)) {
                Files.createDirectory(carpeta);
            }

            String contenido = "Tiempo de ciclo: 55.8 segundos\n"
                             + "Velocidad de línea: 1.2 m/s\n"
                             + "Número de estaciones: 8";

            Files.write(archivo, contenido.getBytes());
            System.out.println("Archivo creado exitosamente: " + archivo);

            if (Files.exists(archivo)) {
                String leido = Files.readString(archivo);
                System.out.println("\nContenido del archivo:");
                System.out.println(leido);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
