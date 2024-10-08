public class main {
    public static void main(String[] args) {
        String palabra = "supercalifragilisticoespialidoso";

        // longitud de la cadena
        System.out.println("Longitud: " + palabra.length());

        // posición 10
        System.out.println("Carácter en posición 10: " + palabra.charAt(9));

        //mayúsculas
        System.out.println("En mayúsculas: " + palabra.toUpperCase());

        // 4. Obtener la subcadena desde la posición 5 hasta la 15
        System.out.println("Subcadena (5–15): " + palabra.substring(4, 15));

        // 5. Mostrar la primera ocurrencia de la letra 'i'
        System.out.println("Primera ocurrencia de 'i': " + palabra.indexOf('i'));

        // 6. Mostrar la última ocurrencia de la letra 'o'
        System.out.println("Última ocurrencia de 'o': " + palabra.lastIndexOf('o'));

        // 7. Convertir a minúsculas
        System.out.println("En minúsculas: " + palabra.toLowerCase());

        // 8. Obtener la subcadena desde la posición 7 hasta el final
        System.out.println("Subcadena desde la posición 7: " + palabra.substring(6));

        // 9. Mostrar la última ocurrencia de la frase "li"
        System.out.println("Última ocurrencia de 'li': " + palabra.lastIndexOf("li"));
    }
}
