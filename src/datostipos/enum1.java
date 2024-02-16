package datostipos;
enum DiaDeLaSemana { LUNES, MARTES, MIERCOLES, JUVES, VIERNES, SABADO,DOMINGO}
public class enum1 {
    public static void main(String[] args) {

        // dece de laracion  y asignaciones se una variable de tipo enmu

        DiaDeLaSemana dia = DiaDeLaSemana.LUNES ;

        //utilizacion de variables enum es una introducion swich
       switch (dia) {
           case LUNES:
               System.out.println(" hoy es lunes ");
               break;
           case MARTES:
               System.out.println("hoy es martes");
               break;
           //.... caso para otro dia de semana ..
           default:
               System.out.println("hoy no es un dia valido");




        }


    }


}

