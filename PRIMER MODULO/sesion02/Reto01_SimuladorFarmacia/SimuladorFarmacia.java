package sesion02.Reto01_SimuladorFarmacia;

import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del medicamento: ");
        String nombre = scanner.nextLine();
        System.out.print("Precio unitario: ");
        double precio = scanner.nextDouble();
        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        var total = precio * cantidad;
        boolean aplicaDescuento = total > 500;
        var descuento = aplicaDescuento ? total * 0.15 : 0;
        var totalFinal = total - descuento;

        System.out.println("Medicamento: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Total sin descuento: $" + total);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}