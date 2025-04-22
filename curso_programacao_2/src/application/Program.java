package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// Problema exemplo
		
		/*
		 * Faça um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas). Em seguida, mostrar
		 * o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.
		 * 
		 * A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a seguinte (fórmula de Heron)
		 * 
		 * area = sqrt(p(p-a)(p-b)(p-c) onde p = (a + b + c) / 2
		 * 
		 * EXEMPLO:
		 * Enter the measures of triangle X:
		 * 3.00
		 * 4.00
		 * 5.00
		 * 
		 * Enter the measures of triangle Y:
		 * 7.50
		 * 4.50
		 * 4.02
		 * 
		 * Triangle X's area: 6.0000
		 * Triangle Y's area: 7.5638
		 * Larger area: Y
		 * */
		
		
		// Tudo isso sem orientação a objetos
		/*
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measurements of triangle X");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Enter the measurements of triangle Y");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		double pX = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		
		double pY = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
		
		System.out.printf("Triangle X's area: %.4f\n", areaX);
		System.out.printf("Triangle Y's area: %.4f\n", areaY);
		
		if ( areaX > areaY)
			System.out.println("Larger Area: X");
		else 
			System.out.println("Larger Area: Y");
		
		sc.close();
		*/
		
		// Agora, com programação orientada a objetos
		
		Scanner sc = new Scanner(System.in);

		Triangle x, y;

		// Instanciando-os:
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measurements of triangle X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measurements of triangle Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		//double pX = (x.a + x.b + x.c) / 2;
		//double areaX = Math.sqrt(pX * (pX - x.a) * (pX - x.b) * (pX - x.c));
		
		/*
		 * A lógica de calcular a área de um triângulo não deve estar no Main, mas, sim, na classe triângulo,
		 * que deveria ser a classe responsável, portanto irá para a classe Triangulo*/

		//double pY = (y.a + y.b + y.c) / 2;
		//double areaY = Math.sqrt(pY * (pY - y.a) * (pY - y.b) * (pY - y.c));

		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X's area: %.4f\n", areaX);
		System.out.printf("Triangle Y's area: %.4f\n", areaY);

		if (areaX > areaY)
			System.out.println("Larger Area: X");
		else
			System.out.println("Larger Area: Y");

		sc.close();

	}

}
