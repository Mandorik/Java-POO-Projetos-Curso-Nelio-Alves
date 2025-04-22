package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// Exercício 1
		
		/*
		 * Faça um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostre na tela o valor de sua área
		 * perímetro e diagonal. Usar uma classe como mostrado no projeto abaixo:
		 * 
		 * Rectangle
		 * - Width: double
		 * - Height: double
		 * 
		 * + Area() : double
		 * + Perimeter() : double
		 * + Diagonal () : double
		 * 
		 * Exemplo:
		 * Enter the rectangle width and height:
		 * 3.00
		 * 4.00
		 * AREA = 12.00
		 * PERIMETER = 14.00
		 * DIAGONAL = 5.00
		 * */

		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle(); 
		
		System.out.println("Enter the rectangle's width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("Area: " + rectangle.Area());
		System.out.println("Perimeter: " + rectangle.Perimeter());
		System.out.println("Diagonal: " + rectangle.Diagonal());
		
		sc.close();

		
	}

}
