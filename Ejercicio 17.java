import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Variables para contar y calcular
        int cantidadNumeros = 0;
        int sumaImpares = 0;
        int mayorPar = Integer.MIN_VALUE; // Inicializar con el valor mínimo de un entero

        // Bucle para solicitar números y realizar cálculos
        while (true) {
            System.out.print("Ingresa un número (negativo para terminar): ");
            int numero = scanner.nextInt();

            // Verificar si el número es negativo (condición de salida)
            if (numero < 0) {
                break; // Salir del bucle si se ingresa un número negativo
            }

            // Contar números
            cantidadNumeros++;

            // Calcular media de impares y encontrar el mayor par
            if (numero % 2 != 0) { // Es impar
                sumaImpares += numero;
            } else { // Es par
                if (numero > mayorPar) {
                    mayorPar = numero;
                }
            }
        }

        // Calcular la media de los números impares (si se ingresaron impares)
        double mediaImpares = cantidadNumeros > 0 ? (double) sumaImpares / cantidadNumeros : 0;

        // Mostrar resultados
        System.out.println("Se han introducido " + cantidadNumeros + " números.");
        System.out.println("La media de los números impares es: " + mediaImpares);
        System.out.println("El mayor de los números pares es: " + (mayorPar != Integer.MIN_VALUE ? mayorPar : "N/A"));

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

