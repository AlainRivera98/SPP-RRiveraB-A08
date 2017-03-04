//Nombre: Roberto Alain Rivera Bravo
//Matrícula: A01411516
//Carrera: IMT11
package spp.rriverab.a08;
import java.util.Scanner;

public class SPPRRiveraBA08 {

    public static void main(String[] args) {
        int sumaPar=0,cont=0, sumaNon=0, promedio;

        /*
        Este programa promedia el contenido de las posiciones pares y 
        suma el contenido de las posiciones nones de un arreglo
        */
        
        //declara el array matrix con valores iniciales
        int[][]matrix= {{10,30,89,48,56},
                        {32,23,84,20,10},
                        {72,108,71,402,8}};
        
        
        //i inicia en 0, el ciclo se ejecutra mientras i<tamaño del arreglo
        //j se incrementa en dos
        //Así, se desplazará en las posiciones pares de j
        //ciclo for que nos desplaza en las filas
        for (int i=0; i<matrix.length; i++){
            //ciclo for que aumenta en 2 a j iniciando en 0 y nos deplaza en las columnas
            for (int j=0; j<matrix[i].length; j+=2) {
                //se le va sumando cada valor en columna par de cada fila a la variable sumaPar
                sumaPar+=matrix[i][j];
                //cada que tenemos un dato se aumenta el contador para "contar" la cantidad de datos
                cont++;
            }    
        }
        //realiza el promedio de la suma de valores en columna impar de cada fila con la cantidad de datos
        promedio=(sumaPar/cont);
        //muestra en pantalla el promedio de la suma de pares
        System.out.println("El promedio de los valores en columnas pares de cada fila es: "+promedio);
         
               
        //i inicia en 1, el ciclo se ejecutra mientras i<tamaño del arreglo
        //j se incrementa en dos
        //Así, se desplazará en las posiciones impares de j
        //ciclo for que nos desplaza en las filas
        for (int i=0; i<matrix.length; i++){
            //ciclo for que aumenta en 2 a j iniciando en 1 y nos desplaza en las columnas
            for (int j=1; j<matrix[i].length; j+=2){
                //se le va sumando cada valor en columna impar de cada fila a la variable sumaNon
                sumaNon+=matrix[i][j];
            }    
        }
        //muestra en pantalla la suma de los valores en posición impar de columna de cada fila
        System.out.println("\nLa suma de los valores en columnas nones de cada fila es: "+sumaNon);
        
        
        System.out.println("\nLa matriz es: ");

        //Recorre las "i" columnas del array
        for(int i=0; i<matrix.length; i++){
            //Recorre las "j" filas del array
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
                /*Introduce un salto de línea cada que se rebase la cantidad de columnas del array
                para que se vea el arreglo en orden en pantalla*/
                if (j+2>matrix[i].length){
                    System.out.println("\t");
                }  
            }
        }
        

    }
    
    
    
}
