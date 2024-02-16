import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class tarea1 {
    public static void main(String[] args) {
        out.println("Hola paola hoy tareas de operadores unitarios ");

        int numero= 8;
        int resultado= numero  ;

        System.out.println(resultado);
        //se cambio su signo  y almacena el resultado en otra variable

        out.println( "operadores de incremento y descremento" );

        int numeros = 10 + 12 ;
        int resultados= numeros  ;


        System.out.println(resultados);

        int numeross = 8 ;
        int resultadoss = ++numeross;
        System.out.println(resultadoss);

        out.println( "operadores aritmeticos" );
        int a = 5 ;
        int b = -3 ;
        int suma = a + b ;
        System.out.println(suma);


        out.println( "opradodes relacionales" );

        int c = 6 ;
        int d = -4 ;

        boolean igualdad = ( c == d );
        boolean noligual = ( c != d);
        boolean mayorque = ( c > c);
        boolean menorque = ( c < d );
        boolean mayorigual = ( c >= d);
        boolean menorigual = ( c <= d);


        System.out.println(igualdad);
        System.out.println(noligual);
        System.out.println(mayorque);
        System.out.println(menorque);
        System.out.println(mayorigual);
        System.out.println(menorigual);


        out.println( "opradodes condicionales" );

        Boolean condicion1 = true ;
        boolean condicion2 = false ;

        boolean andLogico = condicion1 && condicion2 ;

        boolean orLogico = condicion1 || condicion2 ;

        boolean notLogico = !condicion1 ;
        System.out.println(condicion1 && condicion2);
        System.out.println(condicion1 || condicion2);
        System.out.println(!condicion1);

        int h = 5;
        int j = -3 ;

































    }







}
