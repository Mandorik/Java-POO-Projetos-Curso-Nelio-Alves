package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		// Métodos abstratos
		
		// São métodos que não possuem implementação
		
		// Métodos precisam ser abstratos quando a classe é genérica demais para conter sua implementação
		
		// Se uma classe possuir pelo menos um método abstrato, então essa classe também é abstrata
		
		// Exemplo. uma classe abstrata Forma, tem um método área... mas a área depende de cada forma, portanto ela precisa também ser abstrata
		// Ou seja, o método area precisa ser assim, pois a classe é genérica DEMAIS
		
		// Portanto criamos ele abstrato e implementamos nas subclasses
		
		// EXEMPLO
		
		// Faça um programa para ler os dados de N figuras (N fornecido pelo usuário) e, depois, mostrar as áreas destas figuras
		// na mesma ordem em que foram digitadas

		
		/*
		 * Enter the number of shapes: 2
		 * Shape #1 data:
		 * Rectangle or Circle (r/c)? r
		 * Color (BLACK/BLUE/RED): BLACK
		 * Width: 4.0
		 * Height: 5.0
		 * Shape #2 data:
		 * Rectangle or Circle (r/c)? c
		 * Color (BLACK/BLUE/RED): RED
		 * Radius: 3.0
		 * 
		 * SHAPE AREAS:
		 * 20.00
		 * 29.61
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the number of shapes: ");
		int N = sc.nextInt();
		List<Shape> list = new ArrayList<>();
		
		for(int i = 1; i<=N; i++) {
			System.out.printf("Shape #%d data: ", i);
			System.out.printf("Rectangle or Circle (r/c)? ");
			char whichShape = sc.next().charAt(0);
			System.out.printf("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if(whichShape == 'r') {
				System.out.printf("Width: ");
				double width = sc.nextDouble();
				System.out.printf("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			} else if(whichShape == 'c') {
				System.out.printf("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			} else {
				System.out.println("Shape not found!");
			}
			

			}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
		
	}

}
