import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre = input.nextLine();

        System.out.println("Ingresa tu edad");
        int edad = input.nextInt();
        input.nextLine();

        System.out.println("Ingresa tu país");
        String pais = input.nextLine();

        System.out.println("Ingresa tu estado civil: (soltero / casado)");
        String estadoCivil = input.nextLine();

        System.out.println("Ingresa tus ingresos anuales:");
        double ingresos = input.nextDouble();
        input.nextLine();

        System.out.println("Ingresa ti tienes hijos o no (si / no)");
        String tieneHijos = input.nextLine();

        if (nombre.matches(".*\\d.*")) {
            System.out.println("Error. El usuario no debe de contener dígitos.");
        } else {
            if (edad < 25) {
                System.out.println("No eres elegible para beneficios.");
            } else {
                if (pais.equals("México") && estadoCivil.equals("casado")) {
                    if (ingresos < 300000) {
                        if (tieneHijos.equals("si")) {
                            double descuento = ingresos * .10;
                            double montoFinal = ingresos - descuento;
                            String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombre, descuento, montoFinal);
                            System.out.println(resultado);
                        } else {
                            double descuento = ingresos * .05;
                            double montoFinal = ingresos - descuento;
                            String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombre, descuento, montoFinal);
                            System.out.println(resultado);
                        }
                    }
                } else if (pais.equals("México") && estadoCivil.equals("soltero")) {
                    if (ingresos < 400000) {
                        double descuento = ingresos * .08;
                        double montoFinal = ingresos - descuento;
                        String resultado = String.format("Nombre: %s, descuento: %.2f, monto final: %.2f", nombre, descuento, montoFinal);
                        System.out.println(resultado);
                    } else {
                        System.out.println("No recibes beneficios");
                    }
                } else if (pais.equals("USA")) {
                    if (ingresos < 500000 && estadoCivil.equals("casado")) {
                        double descuento = ingresos * .12;
                        double montoFinal = ingresos - descuento;
                        String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombre, descuento, montoFinal);
                        System.out.println(resultado);
                    } else if (ingresos < 200000 && estadoCivil.equals("soltero")) {
                        double descuento = ingresos * .07;
                        double montoFinal = ingresos - descuento;
                        String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombre, descuento, montoFinal);
                        System.out.println(resultado);
                    } else if (tieneHijos.equals("si")) {
                        double descuento = ingresos * .03;
                        double montoFinal = ingresos - descuento;
                        String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombre, descuento, montoFinal);
                        System.out.println(resultado);
                    }
                } else {
                    double descuento;
                    double descuentoAdicional = 0;

                    if (estadoCivil.equals("casado")) {
                        System.out.println("Se aplica 5% de descuento");
                        descuento = ingresos * .05;
                    } else {
                        descuento = ingresos * .03;
                    }

                    if (ingresos < 200000) {
                        descuentoAdicional = ingresos * .02;
                    }

                    double montoFinal = ingresos - descuento - descuentoAdicional;

                    String resultado = String.format("Nombre: %s, descuento: %f, monto final: %f", nombre, descuento, montoFinal);
                    System.out.println(resultado);
                }
            }
        }

    }
}
