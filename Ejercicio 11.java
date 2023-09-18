import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la hora (0-23) y los minutos (0-59)
        System.out.print("Ingresa la hora (0-23): ");
        int horas = scanner.nextInt();
        System.out.print("Ingresa los minutos (0-59): ");
        int minutos = scanner.nextInt();

        // Calcular los segundos que faltan para llegar a la medianoche
        int segundosHastaMedianoche = (23 - horas) * 3600 + (59 - minutos) * 60;

        // Mostrar los segundos calculados
        System.out.println("Faltan " + segundosHastaMedianoche + " segundos para llegar a la medianoche.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
