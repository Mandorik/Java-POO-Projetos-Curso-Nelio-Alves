package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {

		// Problema 1
		
		/*açamos um método para retornar a soma das áreas de uma lista de figuras.
		 * 
		 * Nota 1: Soluções impróprias:
		 * 1) public double totalArea(List<Shape> list)
		 * 2) public double totalArea(List<?> list)
		 * 
		 * Nota 2: não conseguiremos adicionar elementos na lista do método
		 * */
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total Area: " + totalArea(myShapes));
		// Como o totalArea é para List<Shape> não funciona para Circles, pois não é supertipo
		System.out.println("Total Area for Circles: " + totalArea(myCircles));
	}
	
	// Se trocar para List<?> o compliador reclama no for (Shape s : list) pois não necessariamente serão do tipo Shape
	
	// Para termos uma função que receba lista de Shapes que possa ser subtipo de Shape:
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
