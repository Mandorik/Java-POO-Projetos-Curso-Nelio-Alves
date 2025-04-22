package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas
		 * contendo números inteiros, podendo haver repetições. Em seguida, leia um número inteiro X que pertence à matriz.
		 * Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver, conforme
		 * exemplo:
		 * 
		 * EXEMPLO:
		 * 3 4
		 * 10 8 15 12
		 * 21 11 23 8
		 * 14 5 13 19
		 * 8
		 * 
		 * Position 0,1:
		 * Left: 10
		 * Right: 15
		 * Down: 11
		 * 
		 * Position 1,3:
		 * Left: 23
		 * Up:12
		 * Down: 19
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantia de linhas da matriz: ");
		int M = sc.nextInt();
		System.out.print("Digite a quantia de colunas da matriz: ");
		int N = sc.nextInt();
		
		int[][] matrix = new int[M][N];
		
		System.out.println("Digite os elementos da matriz:");
		
		for(int i =0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite o número pertencente à matrix sobre o qual você quer saber mais: ");
		int X = sc.nextInt();
		
		for(int i =0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if(matrix[i][j] == X) {
					System.out.println("Position: " + i + ", " + j);
					if(j != 0 ) {
						System.out.println("Left: " + matrix[i][j-1]);
					} 
					if(j != N-1) {
						System.out.println("Right: " + matrix[i][j+1]);
					}
					if(i != 0) {
						System.out.println("Up: " + matrix[i-1][j]);
					}
					if(i != N-1) {
						System.out.println("Down: " + matrix[i+1][j]);
					}

				}
			}
		}
		
		sc.close();
	}
}
