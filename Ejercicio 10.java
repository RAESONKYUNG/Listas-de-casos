import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Gravedad (m/s^2)
        double g = 9.81;

        // Solicitar al usuario la altura desde la que caerá el objeto (en metros)
        System.out.print("Ingresa la altura desde la que caerá el objeto (en metros): ");
        double altura = scanner.nextDouble();

        // Calcular el tiempo de caída utilizando la fórmula t = sqrt((2h)/g)
        double tiempoCaida = Math.sqrt((2 * altura) / g);

        // Mostrar el tiempo de caída
        System.out.println("El tiempo que tardará en caer el objeto es de " + tiempoCaida + " segundos.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
