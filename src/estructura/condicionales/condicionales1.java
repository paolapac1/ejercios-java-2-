package estructura.condicionales;

public class condicionales1 {
    public static void main(String[] args) {

        /*estructuras condicionales  if*/


        //  boolean boolean1 = true;
        //  boolean boolean2  = false ;


        // if(  boolean1 || boolean2){

        //     System.out.println("la sentincia tiene una condicion verdadera");
        //  }


        //      if ( boolean1 || boolean2){
        //         System.out.printf("entraste al if");
        //       }else {
        //           System.out.printf("entraste al else");
        //      }
        //
        //     int edad = 15 ;
        //   if (edad >= 18 ){ System.out.printf("es mayor de edad puede ingresar");} else
        //     if (edad <18 && edad  >15){
        //        System.out.printf("no es mayor de edad");
        //     }else {
        //        System.out.printf("no puede ingresar nisiquiera acompañado");

        int sueldobase = 1000;
        String posicion = " bueno";
        boolean bono = true;


        if (posicion == "administracion") {

            if (bono) {
                sueldobase = sueldobase + 1000;
                sueldobase = sueldobase + 1000;
            } else if (posicion == "bueno") {
            }
            System.out.printf("el suldo que le corresponde es de " + sueldobase);


        }


    }
}

































































