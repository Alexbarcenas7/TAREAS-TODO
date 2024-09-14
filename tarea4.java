public class Main {
    public static void main(String[] args) {
        // Fórmula 1
        double resultado1 = ((12 + 8) * (5 - 3) - (6.0 / 2)) / ((3 * 4) + (8.0 / 2));

        // Fórmula 2
        double parte1 = ((9 * 5) - (15 + 3) + (8 * 2));
        double parte2 = (((12.0 / 4) * (7 + 2)) - ((6 * 3) / 2.0)) / (2 + ((8 + 2.0) / (5 + 1.0)));
        double numerador = parte1 - parte2;
        double denominadorParte1 = ((15 - 3) / (2.0 + 1)) + ((3 * 2) - (5 + 1)) * (6.0 / 2);
        double denominadorParte2 = (3 + (8 + 1.0) / (3 + 4.0));
        double resultado2 = numerador / denominadorParte1 / denominadorParte2;

        // Fórmula 3
        double resultado3 = (((6 + 4) * 3) - (18.0 / 2)) / ((8 - 5) + (3 * 2));

        // Mostrar los resultados con formato
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|                Resultados                   |");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("| Fórmula 1: ((12 + 8) * (5 - 3) - (6/2)) / ((3 * 4) + (8/2))");
        System.out.printf("| Resultado: %.4f\n", resultado1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("| Fórmula 2: (((9 * 5) - (15 + 3) + (8 * 2)) - ((12/4 * (7+2) - ((6 * 3)/2)) / (2 + (8+2)/(5+1))))");
        System.out.printf("| Resultado: %.4f\n", resultado2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("| Fórmula 3: ((6 + 4) * 3 - (18/2)) / ((8 - 5) + (3 * 2))");
        System.out.printf("| Resultado: %.4f\n", resultado3);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
