import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        calcularPromedio(scanner);
        contarParesImpares(scanner);
        serieFibonacci(scanner);
        verificarNumeroPrimo(scanner);
        mostrarDivisores(scanner);
        adivinaElNumero(scanner);

        scanner.close();
    }

    public static void calcularPromedio(Scanner scanner) {
        System.out.print("Ingresa la cantidad de números: ");
        int cantidad = scanner.nextInt();
        double suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa un número: ");
            suma += scanner.nextDouble();
        }

        double promedio = suma / cantidad;
        System.out.println("Promedio: " + promedio);

        if (promedio > 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }

    public static void contarParesImpares(Scanner scanner) {
        System.out.print("Ingresa la cantidad de números: ");
        int n = scanner.nextInt();
        int pares = 0, impares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa un número: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }

    public static void serieFibonacci(Scanner scanner) {
        System.out.print("Ingresa el número límite para la serie Fibonacci: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;

        System.out.print("Serie Fibonacci: ");
        while (a <= n) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }

    public static void verificarNumeroPrimo(Scanner scanner) {
        System.out.print("Ingresa un número: ");
        int n = scanner.nextInt();
        boolean esPrimo = true;

        if (n < 2) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " no es primo");
        }
    }

    public static void mostrarDivisores(Scanner scanner) {
        System.out.print("Ingresa un número: ");
        int n = scanner.nextInt();

        System.out.print("Divisores de " + n + ": ");
        boolean tieneDivisores = false;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                tieneDivisores = true;
            }
        }
        System.out.println();

        if (!tieneDivisores) {
            System.out.println("El número no tiene divisores aparte de 1 y él mismo.");
        }
    }

    public static void adivinaElNumero(Scanner scanner) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;

        System.out.println("Adivina el número entre 1 y 100:");

        do {
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número.");
            }
        } while (intento != numeroSecreto);





    }
}
