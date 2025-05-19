import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {
        // Paso 1: ArrayList para registrar todas las especies en orden
        ArrayList<String> muestras = new ArrayList<>();
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");

        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> idInvestigador = new HashMap<>();
        idInvestigador.put("M-001", "Dra. López");
        idInvestigador.put("M-002", "Dr. Hernández");
        idInvestigador.put("M-003", "Mtra. García");

        // Paso 4: Mostrar resultados
        System.out.println("Lista completa de muestras:");
        for (String muestra : muestras) {
            System.out.println("- " + muestra);
        }

        System.out.println("\nEspecies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        System.out.println("\nRelación ID de muestra → Investigador:");
        for (Map.Entry<String, String> entry : idInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Búsqueda por ID
        String busquedaID = "M-002";
        System.out.println("\nBúsqueda de investigador por ID " + busquedaID + ": " + idInvestigador.get(busquedaID));
    }
}
