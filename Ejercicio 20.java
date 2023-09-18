import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingresa un número entero: ");
        long numero = scanner.nextLong();

        // Variables para almacenar la suma y dígitos pares
        long sumaDigitosPares = 0;
        String digitosPares = "";

        // Convertir el número en positivo si es negativo
        numero = Math.abs(numero);

        // Convertir el número en una cadena para procesar dígitos
        String numeroComoCadena = String.valueOf(numero);

        // Recorrer cada dígito del número
        for (int i = 0; i < numeroComoCadena.length(); i++) {
            char digito = numeroComoCadena.charAt(i);

            // Convertir el dígito en un número entero
            int valorDigito = Character.getNumericValue(digito);

            // Verificar si el dígito es par
            if (valorDigito % 2 == 0) {
                sumaDigitosPares += valorDigito;
                digitosPares += digito + " ";
            }
        }

        // Mostrar los dígitos pares y su suma
        if (!digitosPares.isEmpty()) {
            System.out.println("Dígitos pares: " + digitosPares);
            System.out.println("Suma de los dígitos pares: " + sumaDigitosPares);
        } else {
            System.out.println("No se encontraron dígitos pares en el número ingresado.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

