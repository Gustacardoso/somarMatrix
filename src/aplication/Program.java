package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int linhas;
		int colunas;
		System.out.println("informe  numero de linhas");
	     linhas = sc.nextInt();
	    System.out.println("informe  numero de colunas");
	     colunas = sc.nextInt();
	    int mat[][]= new  int[linhas][colunas];
		
		for(int i = 0;i < mat.length;i++) {
			  for (int j = 0; j < mat[i].length; j++) {
				  System.out.println("linha: "+i+ " coluna: "+j);
				 mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("informe  numero de linhas da matrix dois");
	     linhas = sc.nextInt();
	    System.out.println("informe  numero de colunas da matrix dois");
	     colunas = sc.nextInt();
	    int mat2[][]= new  int[linhas][colunas];
		
		for(int i = 0;i < mat2.length;i++) {
			  for (int j = 0; j < mat2[i].length; j++) {
				  System.out.println("linha: "+i+ " coluna: "+j);
				 mat2[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		//mostrar a matrix 1
		 for(int i=0; i<mat.length;i++) {//linha da matriz
			 for (int j = 0; j < mat[i].length; j++) {//coluna d matri
				  
				 System.out.print(mat[i][j]+ " ");
			}
			 System.out.println();
		 }
		 System.out.println();
		 //mostras a marix dois
		 for(int i=0; i<mat2.length;i++) {//linha da matriz
			 for (int j = 0; j < mat2[i].length; j++) {//coluna d matri
				  
				 System.out.print(mat2[i][j]+ " ");
			}
			 System.out.println();
		 }
		System.out.println();
		//somar as duas matrix
		 for(int i=0; i<mat.length;i++) {//linha da matriz
			 for (int j = 0; j < mat[i].length; j++) {//coluna d matri
				 mat[i][j] += mat2[i][j]; 
				 System.out.print(mat[i][j]+ " ");
			}
			 System.out.println();
		 }
	
				
				
	    sc.close();

	}

}
