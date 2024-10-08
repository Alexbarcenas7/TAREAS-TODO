import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el número 1 (entero): ");
        int num1 = input.nextInt();

        System.out.print("Introduce el número 2 (entero): ");
        int num2 = input.nextInt();

        System.out.print("Introduce el número 3 (entero): ");
        int num3 = input.nextInt();

        System.out.print("Introduce el número 4 (decimal): ");
        double num4 = input.nextDouble();

        System.out.print("Introduce el número 5 (decimal): ");
        double num5 = input.nextDouble();

        double parte1 = (num1 / num4);
        double parte2 = ((num3 + num2) / num5);
        double operacion1 = (parte1 * parte2) / ((num2 + num3) * num4);

        double operacion2 = ((num5 / num1) + (num2 / num3) - num4 ) / (num1 + num2 + num3);
        double operacionFinal = operacion1 / operacion2;

        System.out.println("El resultado Final es: " + operacionFinal);

    }
}
