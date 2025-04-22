package exercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// EXERCÍCIO 6

		/**
		 * Fazer um programa que lê três valores com ponto flutuante de dupla precisão:
		 * A, B e C. Em seguinda, calcule e mostre: a) a área do triângulo retângulo que
		 * tem A por base e C por altura - (b*h)/2 b) a área do círculo de raio C. (pi =
		 * 3.14159) - (pi * r²) c) a área do trapézio que tem A e B por bases e C por
		 * altura - ((b + B)*h)/2 d) a área do quadrado que tem lado B - (l²) e) a área
		 * do retângulo que tem lados A e B - (l1 * l2)
		 * 
		 * Exemplos:
		 * 
		 * ENTRADA 3.0 4.0 5.2
		 * 
		 * SAÍDA TRIANGULO: 7.800 CIRCULO: 84.949 TRAPEZIO: 18.200 QUADRADO: 16.000
		 * RETANGULO: 12.000
		 * 
		 * ENTRADA 12.7 10.4 15.2
		 * 
		 * SAÍDA TRIANGULO: 96.520 CIRCULO: 725.833 TRAPEZIO: 175.560 QUADRADO: 108.160
		 * RETANGULO: 132.080
		 */

		Scanner sc = new Scanner(System.in);
		double A, B, C;
		double pi = 3.14159;

		System.out.println("Digite os três valores, sendo o 1º A, 2º B e o 3º C");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		double aTriangulo = (A * C) / 2;
		System.out.printf("A área do triângulo é de: %.3f\n", aTriangulo);
		double aCirculo = (pi * Math.pow(C, 2));
		System.out.printf("A área do círculo é de %.3f\n", aCirculo);
		double aTrapezio = ((A + B) * C) / 2;
		System.out.printf("A área do trapézio é de %.3f\n", aTrapezio);
		double aQuadrado = Math.pow(B, 2);
		System.out.printf("A área do quadrado é de %.3f\n", aQuadrado);
		double aRetangulo = A * B;
		System.out.printf("A área do retângulo é de %.3f\n", aRetangulo);

		sc.close();
	}

}
