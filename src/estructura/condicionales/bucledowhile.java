package estructura.condicionales;

import java.util.Scanner;

public class bucledowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        int numero ;
        String mensaje = "ingrese un numero mayor a 10 " ;

        do {
            System.out.print(" ingrese un numero mayor a 10 ");

            numero = scanner.nextInt();

        } while (numero <=10);
        System.out.println(" Gracias has ingresado un numero valido " + numero); scanner.close ();






    }
}
