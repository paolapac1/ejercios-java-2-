package datostipos;

public class matrizejemplo {
    public static void main(String[] args) {

        //declarar un amtriz de enteros 3x4
        int [][] matriz = new  int [3] [4] ;
        int valor = 1; //el valor inicial que se asigna

        //asignar valor a la matriz utilizando bucles for

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                matriz[fila][columna] = valor;
                valor++; // incrementar el valor para la siguiente asignacion
            }
        }







    }






}
