import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la altura de la letra L
        System.out.print("Ingresa la altura de la letra L: ");
        int altura = scanner.nextInt();

        // Verificar que la altura sea mayor o igual a 2
        if (altura < 2) {
            System.out.println("La altura debe ser al menos 2.");
        } else {
            // Calcular la longitud del palo horizontal (mitad de la altura + 1)
            int longitudPaloHorizontal = altura / 2 + 1;

            // Dibujar la letra L
            for (int i = 1; i <= altura; i++) {
                if (i < altura) {
                    // Dibujar la parte vertical de la L (altura - longitud del palo horizontal)
                    System.out.println("*");
                } else {
                    // Dibujar la parte horizontal de la L
                    for (int j = 0; j < longitudPaloHorizontal; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}


