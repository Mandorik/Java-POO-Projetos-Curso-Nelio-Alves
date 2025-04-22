package lista3_exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// EXERCÍCIO 2

		/*
		 * Escreva um programa para ler as coordenadas (X, Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma).
		 * 
		 * Entrada:
		 * 2 2
		 * 3 -2
		 * -8 -1
		 * -7 1
		 * 0 2
		 * 
		 * Saída:
		 * primeiro
		 * quarto
		 * terceiro
		 * segundo
		 */

		int X, Y;
		Scanner sc = new Scanner(System.in);
		String quadrante = "";
		
		
		System.out.println("Digite as coordenadas:");
		X = sc.nextInt();
		Y = sc.nextInt();
		
		while (X != 0 && Y != 0) {	
			
			if (X > 0 && Y > 0) {
				quadrante = "primeiro";
			} else if (X < 0 && Y > 0) {
				quadrante = "segundo";
			} else if (X < 0 && Y < 0) {
				quadrante = "terceiro";
			} else {
				quadrante = "quarto";
			}
			
			System.out.printf("Quadrante: %s\n", quadrante);
			System.out.println("Digite novamente as coordenadas:");
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		
		System.out.println("Sistema encerrado");
		
		sc.close();

		
	}

}
