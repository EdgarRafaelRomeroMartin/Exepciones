import static java.lang.Math.sqrt;
import java.util.Scanner;
public class Raiz {public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int num;
    System.out.print("Introduzca su numero: ");
    num = teclado.nextInt();

    try {
        System.out.print("Numero: "+NumeroNegativoExcepcion(num));



    } catch (Exception ex) {


        System.out.println(ex.getMessage());


    }



}
    public static char NumeroNegativoExcepcion(int num) throws Exception {
        if(num>0){
            throw new Exception("La raiz cuadrada de su numero es: "+sqrt(num));
        }
        if(num<0){
            throw new Exception("No es posible sacarle raiz");
        }
        return 0;
    }
}
