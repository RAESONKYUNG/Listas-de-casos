import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el límite superior
        System.out.print("Ingresa el límite superior (número entero positivo): ");
        int limiteSuperior = scanner.nextInt();

        // Solicitar al usuario el número por el cual no deben ser divisibles
        System.out.print("Ingresa el número por el cual no deben ser divisibles (número entero positivo): ");
        int numeroNoDivisible = scanner.nextInt();

        // Verificar que los números ingresados sean positivos
        if (limiteSuperior <= 0 || numeroNoDivisible <= 0) {
            System.out.println("Por favor, ingresa números enteros positivos.");
        } else {
            // Mostrar los números enteros positivos menores al límite superior que no son divisibles por numeroNoDivisible
            System.out.println("Números enteros positivos menores a " + limiteSuperior + " que no son divisibles por " + numeroNoDivisible + ":");

            for (int i = 1; i < limiteSuperior; i++) {
                if (i % numeroNoDivisible != 0) {
                    System.out.println(i);
                }
            }
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}


