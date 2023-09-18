import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Declarar variables para contar los números positivos y negativos
        int positivos = 0;
        int negativos = 0;

        // Leer diez números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            int numero = scanner.nextInt();

            // Verificar si el número es positivo o negativo
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }

        // Mostrar la cantidad de números positivos y negativos
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
