import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las horas trabajadas
        System.out.print("Ingresa el número de horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();

        // Tarifa para las horas ordinarias (primeras 40 horas)
        double tarifaHorasOrdinarias = 12.0;

        // Tarifa para las horas extras (a partir de la hora 41)
        double tarifaHorasExtras = 16.0;

        // Calcular el salario semanal
        double salarioSemanal;
        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas * tarifaHorasOrdinarias;
        } else {
            int horasOrdinarias = 40;
            int horasExtras = horasTrabajadas - 40;
            salarioSemanal = (horasOrdinarias * tarifaHorasOrdinarias) + (horasExtras * tarifaHorasExtras);
        }

        // Mostrar el salario semanal
        System.out.println("El salario semanal del trabajador es de " + salarioSemanal + " soles.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
