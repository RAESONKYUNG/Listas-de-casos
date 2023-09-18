import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la hora (solo se ingresará la hora, sin minutos)
        System.out.print("Ingresa la hora (solo la hora en formato 24 horas): ");
        int hora = scanner.nextInt();

        // Determinar el saludo según la hora ingresada
        String saludo;
        if (hora >= 6 && hora < 12) {
            saludo = "Buenos días";
        } else if (hora >= 12 && hora < 21) {
            saludo = "Buenas tardes";
        } else {
            saludo = "Buenas noches";
        }

        // Mostrar el saludo correspondiente
        System.out.println(saludo);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
