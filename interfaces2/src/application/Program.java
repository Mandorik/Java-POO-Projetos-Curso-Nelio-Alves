package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {

		// E se eu precisar implementar Shape como interface, porém também quiser
		// definir uma estrutura comum reutilizável para
		// todas as figuras?
		
		/*
		 * Com Shape como classe abstrata:
		 * 
		 * Shape s1 = new Circle(Color.BLACK, 2.0); Shape s2 = new
		 * Rectangle(Color.WHITE, 3.0, 4.0);
		 * 
		 * System.out.println("Circle color: " + s1.getColor());
		 * System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		 * System.out.println("Rectangle color: " + s2.getColor());
		 * System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
		 */
		
		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

		// Acusa-se erro no getColor, pois estava declarado como Shape ^
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));

	}

}
