import java.util.Scanner;
public class Error {
    public static void main(String[] args) {
        int num;
        int numL;
        String cadena;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introdusca su cadena: ");
        cadena = teclado.nextLine();
        System.out.print("Introduzca su numero del campo elegido: ");
        num = teclado.nextInt();
        numL=cadena.length();
        try {
            System.out.println("\nCarácter encontrado: " + caracterEn(cadena,num,numL));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static char caracterEn(String cadena, int num,int numL) throws Exception {

        if (num >= numL)
            throw new Exception("Error, el caracter no fue encontrado en esa pocicion");
        else
            return cadena.charAt(num-1);
    }
}
