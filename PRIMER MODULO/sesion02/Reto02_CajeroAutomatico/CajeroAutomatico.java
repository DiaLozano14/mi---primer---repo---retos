package sesion02.Reto02_CajeroAutomatico;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var saldo = 1000.0;
        int opcion;

        do {
            System.out.println("Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Saldo actual: $" + saldo);
                case 2 -> {
                    System.out.print("Ingrese monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                }
                case 3 -> {
                    System.out.print("Ingrese monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente.");
                        continue;
                    }
                    saldo -= retiro;
                }
                case 4 -> System.out.println("Gracias por usar el cajero.");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }
}