public class Main {
    public static void main(String[] args) {
        // Cantidad en euros que se quiere convertir
        double euros = 100.0;

        // Tasa de conversión de euros a pesetas
        double tasaConversion = 166.386; // 1 euro = 166.386 pesetas (valor aproximado)

        // Realizar la conversión
        double pesetas = euros * tasaConversion;

        // Mostrar el resultado
        System.out.println(euros + " euros equivalen a " + pesetas + " pesetas.");
    }
}
