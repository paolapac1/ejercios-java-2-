package tarea_ejemplos;

import java.util.Scanner;

public class notas_profesor {
    public static void main(String[] args) {
   /*Los profesores de un curso nesecitan llevar un registro de loa notas adqueridas por sus alumnos
   para luego obtener una cantidad de aprobados y desaprobados .Durante el peridos de cursado  cada
   alumno obtiene 4 notas , 2 por trabajos practicos evaluativos y dos parciales .La ponderacion  de
   cada nota son :

   Primer trabajo practico evaluativo : 10 %
   segunda trabajo practico  evaluativo : 15%
   primer integrador  : 25%
   segundo integrador : 50%
   una vez cargadas las notas , se calcula el promedio y se guarda en el arreglo , al final de programa
   ,los profesores  nesecitan obtener por pantalla la cantidad de aprobados y desaprobados , teniendo
   en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de su nota de curso
    */


        Scanner SC = new Scanner(System.in) ;

        int totalAlumnos = 10;
        Double [ ] promedio = new Double[totalAlumnos];
        int aprobados = 0 ;
        int desaprobados = 0 ;

        for ( int i = 0 ;  i < totalAlumnos; i++) {
            System.out.println( " ingresar las notas para el Alumno " + (i + 1)) ;


               double  notaprimertp = SC.nextDouble();
               double notasegundotp = SC.nextDouble();
               double notaprimerintegrador = SC.nextDouble();
               double notasegundointefrdor = SC.nextDouble();

               //calcular el promedio pondenaro

         //   double promedio = calcularpromedioponderado(notaprimertp, notasegundotp , notaprimerintegrador,
          //          notasegundointegrador,
           //         //almacena el promedio en el arreglo
           //         promedios [i] = promedio ;
           // if (promedio <= 7 . 0 ) { aprobados++;


            }




        }


    }
//
