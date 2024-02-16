package tarea_ejemplos;

public class tres_digitosejercios {

    public static void main(String[] args) {
        //nesecitamos mostrar un contenedor  de tres digitos (x-x-x) que muestre los numeros del
        // 0-0-0- al 9-9-9 con la psrticularidad que cad ves que aprezca un 3 se subtituta por una E

        //ejemplo
        // 0-0-0
        //0-0-1
        //0-0-2
        //0-0-E
        //0-0-4
        //0-1-2
        //O-1-E

        for (int  nuemero = 0; nuemero  <= 100 ;  nuemero++){
            int centenas = nuemero / 100 ;
            int docenas = (  nuemero/ 10 ) % 10 ;
            int unidades = nuemero %10 ;


            String Scentenas = Integer.toString(centenas);
             String Sdecenas = Integer.toString(docenas) ;
            String Sunidades = Integer.toString(unidades);


            if (centenas == 3){ Scentenas = "E" ; }
            if ( docenas == 3){ Sdecenas = "E" ; }
            if ( unidades == 3) { Sunidades = " E" ; }

            System.out.println( Scentenas +"" + Sdecenas + "" +  Sunidades); }






    }
}
