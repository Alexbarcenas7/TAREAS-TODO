import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecciona un ejercicio:");
        System.out.println("1. Promedio y Calificaciones");
        System.out.println("2. Número Mayor y Menor");
        System.out.println("3. Frecuencia de Elementos");
        System.out.println("4. Reversa de Arreglo");
        System.out.println("5. Arreglo Palíndromo");
        System.out.println("6. Suma de Filas y Columnas");

        int opcion = sc.nextInt();

        if (opcion == 1) {
            // Ejercicio 1: Promedio y Calificaciones
            double[] calificaciones = new double[10];
            double suma = 0;

            System.out.println("Introduce las calificaciones de 10 estudiantes:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Calificación " + (i + 1) + ": ");
                calificaciones[i] = sc.nextDouble();
                suma += calificaciones[i];
            }

            double promedio = suma / 10;
            int porEncima = 0, porDebajo = 0;

            for (double cal : calificaciones) {
                if (cal > promedio) porEncima++;
                else if (cal < promedio) porDebajo++;
            }

            System.out.println("Promedio: " + promedio);
            System.out.println("Estudiantes por encima del promedio: " + porEncima);
            System.out.println("Estudiantes por debajo del promedio: " + porDebajo);

        } else if (opcion == 2) {
            // Ejercicio 2: Número Mayor y Menor
            int[] numeros = new int[15];
            System.out.println("Introduce 15 números enteros:");
            for (int i = 0; i < 15; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }

            int mayor = numeros[0], menor = numeros[0], posMayor = 0, posMenor = 0;
            for (int i = 1; i < 15; i++) {
                if (numeros[i] > mayor) {
                    mayor = numeros[i];
                    posMayor = i;
                }
                if (numeros[i] < menor) {
                    menor = numeros[i];
                    posMenor = i;
                }
            }

            System.out.println("Mayor: " + mayor + " en posición " + posMayor);
            System.out.println("Menor: " + menor + " en posición " + posMenor);

        } else if (opcion == 3) {
            // Ejercicio 3: Frecuencia de Elementos
            System.out.print("¿Cuántos números tendrá el arreglo? ");
            int n = sc.nextInt();
            int[] numeros = new int[n];
            System.out.println("Introduce los números:");
            for (int i = 0; i < n; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }

            System.out.println("Frecuencia de los números:");
            for (int i = 0; i < n; i++) {
                int cuenta = 0;
                for (int j = 0; j < n; j++) {
                    if (numeros[i] == numeros[j]) cuenta++;
                }
                boolean yaMostrado = false;
                for (int k = 0; k < i; k++) {
                    if (numeros[i] == numeros[k]) {
                        yaMostrado = true;
                        break;
                    }
                }
                if (!yaMostrado) System.out.println(numeros[i] + " aparece " + cuenta + " veces.");
            }

        } else if (opcion == 4) {
            // Ejercicio 4: Reversa de Arreglo
            int[] numeros = new int[10];
            System.out.println("Introduce 10 números:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }

            System.out.println("Arreglo en orden inverso:");
            for (int i = 9; i >= 0; i--) {
                System.out.print(numeros[i] + " ");
            }
            System.out.println();

        } else if (opcion == 5) {
            // Ejercicio 5: Arreglo Palíndromo
            System.out.print("Introduce una cadena: ");
            sc.nextLine(); 
            String cadena = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

            char[] caracteres = cadena.toCharArray();
            boolean esPalindromo = true;

            for (int i = 0; i < caracteres.length / 2; i++) {
                if (caracteres[i] != caracteres[caracteres.length - 1 - i]) {
                    esPalindromo = false;
                    break;
                }
            }

            if (esPalindromo) {
                System.out.println("La cadena es un palíndromo.");
            } else {
                System.out.println("La cadena NO es un palíndromo.");
            }

        } else if (opcion == 6) {
            // Ejercicio 6: Suma de Filas y Columnas
            System.out.print("Introduce el número de filas: ");
            int n = sc.nextInt();
            System.out.print("Introduce el número de columnas: ");
            int m = sc.nextInt();

            int[][] matriz = new int[n][m];
            System.out.println("Introduce los elementos de la matriz:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = sc.nextInt();
                }
            }

            System.out.println("Suma de filas:");
            for (int i = 0; i < n; i++) {
                int sumaFila = 0;
                for (int j = 0; j < m; j++) {
                    sumaFila += matriz[i][j];
                }
                System.out.println("Fila " + i + ": " + sumaFila);
            }

            System.out.println("Suma de columnas:");
            for (int j = 0; j < m; j++) {
                int sumaColumna = 0;
                for (int i = 0; i < n; i++) {
                    sumaColumna += matriz[i][j];
                }
                System.out.println("Columna " + j + ": " + sumaColumna);
            }

        } else {
            System.out.println("Opción no válida.");
        }
    }
}
