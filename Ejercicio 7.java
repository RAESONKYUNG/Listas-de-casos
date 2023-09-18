import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la nota del primer examen
        System.out.print("Ingresa la nota del primer examen (40%): ");
        double notaPrimerExamen = scanner.nextDouble();

        // Solicitar al usuario la media deseada
        System.out.print("Ingresa la media deseada: ");
        double mediaDeseada = scanner.nextDouble();

        // Calcular la nota necesaria en el segundo examen
        // Fórmula: (Media Deseada - (Nota Primer Examen * 0.4)) / 0.6
        double notaSegundoExamen = (mediaDeseada - (notaPrimerExamen * 0.4)) / 0.6;

        // Mostrar la nota necesaria en el segundo examen
        System.out.println("Para obtener una media de " + mediaDeseada +
                " necesitas sacar " + notaSegundoExamen + " en el segundo examen.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
