import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingresa un número entero (positivo o negativo, máximo 5 dígitos): ");
        int numero = scanner.nextInt();

        // Convertir el número a su valor absoluto para contar dígitos
        int numeroAbsoluto = Math.abs(numero);

        // Contar los dígitos del número
        int contadorDigitos = 0;
        int numeroTemporal = numeroAbsoluto;

        while (numeroTemporal > 0) {
            numeroTemporal /= 10;
            contadorDigitos++;
        }

        // Mostrar la cantidad de dígitos
        System.out.println("El número " + numero + " tiene " + contadorDigitos + " dígitos.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
