/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Exer06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m, op;
        
        
        System.out.print("Quantidade de linhas: ");
        n = sc.nextInt();
        
        System.out.print("Quantidade de colunas: ");
        m = sc.nextInt();
        
        int[][] mat = new int[n][m];
        
        for(int i = 0; i < mat.length; i++ ){
            for(int j = 0; j < mat[i].length; j++ ){
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Selecione um numero: ");
        op = sc.nextInt();
        
        
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
		if (mat[i][j] == op) {
                    System.out.println("Posicao " + i + "," + j + ":");
                    if (j > 0) {
			System.out.println("Esquerdo: " + mat[i][j-1]);
                    }
                    if (i > 0) {
			System.out.println("Acima: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
			System.out.println("Direita: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
			System.out.println("Abaixo: " + mat[i+1][j]);
                    }
		}
            }
        }
    }
    
}
