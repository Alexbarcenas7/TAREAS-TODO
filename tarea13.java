
 public class Main {
    public static void main(String[] args) {
   
        String producto = "12345;Laptop HP Pavilion;1500.99;Electrónica";

        int longitudCadena = producto.length();
        System.out.println("Longitud de la cadena: " + longitudCadena);

        String idProducto = producto.substring(0, producto.indexOf(';'));
        System.out.println("ID del producto: " + idProducto);

        int primerPuntoYComa = producto.indexOf(';');
        int segundoPuntoYComa = producto.indexOf(';', primerPuntoYComa + 1);
        String nombreProducto = producto.substring(primerPuntoYComa + 1, segundoPuntoYComa);
        System.out.println("Nombre del producto: " + nombreProducto);

        String nombreMayus = nombreProducto.toUpperCase();
        System.out.println("Nombre del producto en mayúsculas: " + nombreMayus);

        int tercerPuntoYComa = producto.indexOf(';', segundoPuntoYComa + 1);
        String precioStr = producto.substring(segundoPuntoYComa + 1, tercerPuntoYComa);
        double precio = Double.parseDouble(precioStr);
        System.out.println("Precio del producto: " + precio);

        char caracterPos10 = nombreProducto.charAt(9); 
        System.out.println("Carácter en la posición 10 del nombre: " + caracterPos10);

        int primeraA = nombreProducto.indexOf('a');
        System.out.println("Primera ocurrencia de 'a' en el nombre: " + primeraA);
 
        int ultimaO = nombreProducto.lastIndexOf('o');
        System.out.println("Última ocurrencia de 'o' en el nombre: " + ultimaO);

        String categoria = producto.substring(tercerPuntoYComa + 1);
        String precioYCategoria = precioStr + " - " + categoria;
        System.out.println("Precio y categoría: " + precioYCategoria);

        String subcadenaDesde7 = nombreProducto.substring(6);
        System.out.println("Subcadena desde la posición 7 del nombre: " + subcadenaDesde7);

    }
}
