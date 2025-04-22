package entities;

public class Rectangle {

	public double width;
	public double height;
	
	public double Area() {
		
		return width * height;
		
	}
	
	public double Perimeter() {
		
		return 2 * (height + width);
				
	}
	
	public double Diagonal() {
		
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
				
	}
}


