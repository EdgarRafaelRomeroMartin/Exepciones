import java.util.Scanner;
public class ManejoE {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introdusca su cadena: ");
        String lectTeclado = teclado.nextLine();

        try {
            System.out.println("\nCarácter encontrado: " + caracterEn(lectTeclado, 7));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static char caracterEn(String cadena, int num) throws Exception {

        if (num >= cadena.length())
            throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe;");
        else
            return cadena.charAt(num);
    }
}
