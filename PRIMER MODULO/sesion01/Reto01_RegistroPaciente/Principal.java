package sesion01.Reto01_RegistroPaciente;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paciente paciente = new Paciente();

        System.out.print("Nombre del paciente: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad del paciente: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // consumir salto de línea
        System.out.print("Número de expediente: ");
        String expediente = scanner.nextLine();

        paciente.setDatos(nombre, edad, expediente);
        paciente.mostrarInformacion();
    }
}