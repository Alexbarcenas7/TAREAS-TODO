

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Alejandro Barcenas 
        System.out.println("Introduce tu dirección completa (Ejemplo: Av. Libertador, 1234, Ciudad de México, C.P. 06000):");
        String direccion = scanner.nextLine();

        System.out.println("La longitud de la dirección es: " + direccion.length());

        char primeraLetra = direccion.charAt(0);
        char ultimaLetra = direccion.charAt(direccion.length() - 1);
        System.out.println("La primera letra de la dirección es: " + primeraLetra);
        System.out.println("la ultima letra de la dirección es: " + ultimaLetra);

        String direccionMayuscula = direccion.toUpperCase();
        String direccionMinuscula = direccion.toLowerCase();
        System.out.println("Dirección en mayúsculas: " + direccionMayuscula);
        System.out.println("Dirección en minúsculas: " + direccionMinuscula);

        int posicionNumero = direccion.indexOf('1');
        System.out.println("La primera aparición de un número está en la posición: " + posicionNumero);

        String direccionSinComas = direccion.replace(",", "");
        System.out.println("Dirección sin comas: " + direccionSinComas);

        String direccionSinEspacios = direccion.trim();
        System.out.println("Dirección sin espacios extra: " + direccionSinEspacios);

        int indiceCP = direccion.indexOf("C.P.");
        (indiceCP != -1) {
            String versionAbreviada = direccion.substring(0, indiceCP).trim() + " " + direccion.substring(indiceCP);
            System.out.println("Versión abreviada de la dirección: " + versionAbreviada);
       
            System.out.println("No se encontró la frase 'C.P.' en la dirección.");
        }
    }
