import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Combinación de la caja fuerte (número de 4 cifras)
        int combinacion = 1234;

        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Intentos disponibles
        int intentos = 4;

        // Bucle para controlar los intentos
        while (intentos > 0) {
            // Solicitar al usuario que ingrese la combinación
            System.out.print("Ingresa la combinación (4 cifras): ");
            int intento = scanner.nextInt();

            // Verificar si la combinación es correcta
            if (intento == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break; // Salir del bucle si la combinación es correcta
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
                intentos--; // Restar un intento
                if (intentos > 0) {
                    System.out.println("Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Te has quedado sin intentos. La caja fuerte permanece cerrada.");
                }
            }
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
