public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int experiencia = 9;
        String nacionalidad = "mexicana";
        String tipoVisa = "visa de tranbajo";
        boolean visaTrabajo = true;

        if (experiencia < 5) {
            System.out.println("Experiencia insufuiciente");
        } else if (experiencia >= 5) {
            if (nacionalidad.equals("mexicana")) {
                System.out.println("Datos validos Bienvenido");
            } else {
                System.out.println("Nacionalidad invalida");
            }
        } else {
            if (visaTrabajo) {
                if (tipoVisa.equals("visa de trabajo")) {
                    System.out.println("Visa autorizada");
                } else {
                    System.out.println("Visa no invalida");
                }
            }

        }



    }
}
