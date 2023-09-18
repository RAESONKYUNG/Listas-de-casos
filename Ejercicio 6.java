import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el valor en Megabytes (MB)
        System.out.print("Ingresa el valor en Megabytes (MB): ");
        double megabytes = scanner.nextDouble();

        // Realizar la conversión de MB a KB (1 MB = 1024 KB)
        double kilobytes = megabytes * 1024;

        // Mostrar el resultado de la conversión
        System.out.println(megabytes + " Megabytes equivalen a " + kilobytes + " Kilobytes.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
