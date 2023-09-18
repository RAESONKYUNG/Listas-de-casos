import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        // Verificar si el número es par
        boolean esPar = numero % 2 == 0;

        // Verificar si el número es divisible entre 5
        boolean esDivisibleEntre5 = numero % 5 == 0;

        // Mostrar los resultados
        if (esPar) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número no es par.");
        }

        if (esDivisibleEntre5) {
            System.out.println("El número es divisible entre 5.");
        } else {
            System.out.println("El número no es divisible entre 5.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
