/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pildorasjava;

/**
 *
 * @author maros
 */
public class Video25MatricesIIIMatricesBidimencionales {
    public static void main(String[] args){
        int [][] matrix=new int[4][5];
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[0][2]=3;
        matrix[0][3]=4;
        matrix[0][4]=5;
        
        matrix[1][0]=6;
        matrix[1][1]=7;
        matrix[1][2]=8;
        matrix[1][3]=9;
        matrix[1][4]=10;
        
        matrix[2][0]=11;
        matrix[2][1]=12;        
        matrix[2][2]=13;
        matrix[2][3]=14;
        matrix[2][4]=15;
        
        matrix[3][0]=16;
        matrix[3][1]=17;
        matrix[3][2]=18;
        matrix[3][3]=19;
        matrix[3][4]=20;
////bucle típico
//        for(int f=0; f<4; f++){
//            for(int c=0; c<5; c++){
//                System.out.println("Número: "+matrix[f][c]);
//            }
//        }
//bucle merjorado
        for(int[] elemento:matrix){
            System.out.print(elemento);
        }
    }
}
