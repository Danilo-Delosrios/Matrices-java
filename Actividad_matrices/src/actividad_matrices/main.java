package actividad_matrices;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
       int matriz [][] = new int [3][3];
       Scanner entrada = new Scanner(System.in);
       
       for (int f=0;f<3;f++){
           for(int c=0;c<3;c++){
               System.out.print("Matriz [" + f + "][" + c + "]: ");
               matriz [f][c] = entrada.nextInt();
           }
       }
        System.out.println("La matriz es:");
        for (int f=0;f<3;f++){
           for(int c=0;c<3;c++){
               System.out.print(matriz[f][c]);
           }
            System.out.println("");
       }
        System.out.println("Primera diagonal:");
        for(int f=0;f<3;f++){
            System.out.println(matriz[f][f]);
        }
         System.out.println("Segunda diagonal:");
        for (int f = 0; f < 3; f++) {
            System.out.print(matriz[f][3 - 1 - f] );
        }
    }
    
}
