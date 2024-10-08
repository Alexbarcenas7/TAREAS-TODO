
class CalculadoraProductos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nombres = new String[3];
        int[] cantidades = new int[3];
        double[] preciosUnitarios = new double[3];
        double[] porcentajesDescuento = new double[3];
        double[] porcentajesImpuesto = new double[3];

        double[] preciosSinDescuento = new double[3];
        double[] descuentos = new double[3];
        double[] preciosConDescuento = new double[3];
        double[] impuestosAplicados = new double[3];
        double[] totales = new double[3];
        double totalAcumulado = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa el nombre del producto " + (i + 1) + ": ");
            nombres[i] = input.nextLine();

            System.out.println("Ingresa la cantidad de productos: ");
            cantidades[i] = input.nextInt();

            System.out.println("Ingresa el precio unitario del producto: ");
            preciosUnitarios[i] = input.nextDouble();

            System.out.println("Ingresa el porcentaje de descuento: ");
            porcentajesDescuento[i] = input.nextDouble();

            System.out.println("Ingresa los impuestos aplicables en porcentaje: ");
            porcentajesImpuesto[i] = input.nextDouble();

            input.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            preciosSinDescuento[i] = cantidades[i] * preciosUnitarios[i];
            descuentos[i] = preciosSinDescuento[i] * (porcentajesDescuento[i] / 100);
            preciosConDescuento[i] = preciosSinDescuento[i] - descuentos[i];
            impuestosAplicados[i] = preciosConDescuento[i] * (porcentajesImpuesto[i] / 100);
            totales[i] = preciosConDescuento[i] + impuestosAplicados[i];
            totalAcumulado += totales[i];
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nProducto " + (i + 1) + ": " + nombres[i]);
            System.out.println("Cantidad: " + cantidades[i]);
            System.out.printf("Precio total sin descuento: $", preciosSinDescuento[i]);
            System.out.printf("Descuento aplicado: $", descuentos[i]);
            System.out.printf("Precio con descuento: $", preciosConDescuento[i]);
            System.out.printf("Impuestos aplicados: $", impuestosAplicados[i]);
            System.out.printf("Total a pagar: $", totales[i]);
        }

        System.out.printf("\nTotal acumulado a pagar: $", totalAcumulado);

      
    }
}
