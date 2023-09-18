import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Días de la semana como referencia
        String[] diasSemana = {"lunes", "martes", "miércoles", "jueves", "viernes"};

        // Solicitar al usuario que ingrese un día de la semana (de lunes a viernes)
        System.out.print("Ingresa un día de la semana (lunes a viernes): ");
        String diaSemana = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para ser insensible a mayúsculas

        // Solicitar al usuario que ingrese la hora (0-23)
        System.out.print("Ingresa la hora (0-23): ");
        int hora = scanner.nextInt();

        // Solicitar al usuario que ingrese los minutos (0-59)
        System.out.print("Ingresa los minutos (0-59): ");
        int minutos = scanner.nextInt();

        // Calcular minutos hasta el fin de semana
        int minutosHastaFinDeSemana = 0;

        switch (diaSemana) {
            case "lunes":
                minutosHastaFinDeSemana = ((4 - hora) * 60 + (60 - minutos)) + (3 * 60 + 60); // 3 días completos más viernes hasta las 15:00h
                break;
            case "martes":
                minutosHastaFinDeSemana = ((3 - hora) * 60 + (60 - minutos)) + (2 * 24 * 60 + 60); // 2 días completos más viernes hasta las 15:00h
                break;
            case "miércoles":
                minutosHastaFinDeSemana = ((2 - hora) * 60 + (60 - minutos)) + (24 * 60 + 60); // 1 día completo más viernes hasta las 15:00h
                break;
            case "jueves":
                minutosHastaFinDeSemana = ((1 - hora) * 60 + (60 - minutos)) + (15 * 60); // Viernes hasta las 15:00h
                break;
            case "viernes":
                minutosHastaFinDeSemana = (15 - hora) * 60 + (60 - minutos); // Viernes hasta las 15:00h
                break;
            default:
                System.out.println("Día de la semana no válido.");
                return; // Terminar el programa si el día de la semana no es válido
        }

        // Mostrar minutos hasta el fin de semana
        System.out.println("Faltan " + minutosHastaFinDeSemana + " minutos para el fin de semana.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
