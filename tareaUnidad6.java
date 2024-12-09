public class {

    public static void main(String[] args) {
        
        System.out.println("Ejercicio 1: Convertir Celsius a Fahrenheit");
        double celsius = 25.0; 
        double fahrenheit = celsius * 9 / 5 + 32; 
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        
        System.out.println("\nEjercicio 2: Calcular la media de un arreglo");
        int[] numeros = {10, 20, 30, 40, 50}; 
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        double media = (double) suma / numeros.length;
        System.out.println("La media es: " + media);

        
        System.out.println("\nEjercicio 3: Imprimir números positivos");
        int[] numerosMixtos = {-10, 15, -20, 30, 0, 45}; 
        System.out.println("Números positivos:");
        for (int numero : numerosMixtos) {
            if (numero > 0) {
                System.out.println(numero);
            }
        }
    }
}
