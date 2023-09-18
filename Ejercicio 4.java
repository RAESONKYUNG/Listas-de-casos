public class Main {
    public static void main(String[] args) {
        // Cantidad en soles que se quiere convertir
        double soles = 500.0; // Puedes cambiar este valor

        // Tasa de conversión de soles a euros (valor aproximado)
        double tasaConversion = 0.11; // 1 sol = 0.11 euros

        // Realizar la conversión
        double euros = soles * tasaConversion;

        // Mostrar el resultado
        System.out.println(soles + " soles equivalen a " + euros + " euros.");
    }
}
