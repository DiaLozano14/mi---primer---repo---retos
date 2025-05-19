import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;

class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        return titulo + " (Prioridad: " + prioridad + ")";
    }
}

public class PlaneacionTemas {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        System.out.println("Temas ordenados alfabéticamente:");
        List<Tema> copia = new CopyOnWriteArrayList<>(temas);
        Collections.sort(copia);
        for (Tema t : copia) {
            System.out.println("- " + t);
        }

        System.out.println("\nTemas ordenados por prioridad:");
        Collections.sort(copia, Comparator.comparingInt(t -> t.prioridad));
        for (Tema t : copia) {
            System.out.println("- " + t);
        }

        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");

        System.out.println("\nRepositorio de recursos:");
        for (String key : recursos.keySet()) {
            System.out.println(key + " → " + recursos.get(key));
        }
    }
}
