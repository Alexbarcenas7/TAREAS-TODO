public class Main {   //Alejandro Barcenas 
    public static void main(String[] args) {
        
        String nombreCompleto = "García, Juan Carlos";
        
        int longitud = nombreCompleto.length();
        System.out.println("Longitud del nombre completo: " + longitud);

        String apellido = nombreCompleto.substring(0, nombreCompleto.indexOf(',')).trim();
        System.out.println("Apellido: " + apellido);

        String nombreSinApellido = nombreCompleto.substring(nombreCompleto.indexOf(',') + 1).trim();
        System.out.println("Nombre sin apellido: " + nombreSinApellido);

        String primerNombre = nombreSinApellido.split(" ")[0];
        System.out.println("Primer nombre: " + primerNombre);

        String apellidoMayusculas = apellido.toUpperCase();
        System.out.println("Apellido en mayúsculas: " + apellidoMayusculas);

        String nombreMinusculas = nombreCompleto.toLowerCase();
        System.out.println("Nombre completo en minúsculas: " + nombreMinusculas);

        char caracterPosicion5 = nombreCompleto.charAt(4); // índice 4 (posición 5)
        System.out.println("Carácter en la posición 5: " + caracterPosicion5);

        int primeraOcurrenciaA = nombreCompleto.indexOf('a') + 1; // Añadimos 1 para posición en lugar de índice
        System.out.println("Primera ocurrencia de 'a': " + primeraOcurrenciaA);

        int ultimaOcurrenciaA = nombreCompleto.lastIndexOf('a') + 1; // Añadimos 1 para posición en lugar de índice
        System.out.println("Última ocurrencia de 'a': " + ultimaOcurrenciaA);
    }
}
