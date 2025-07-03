package model.entities;

// import model.enums.Color;

public interface Shape {

	/*
	 * private Color color;
	 * 
	 * public Shape(Color color) { this.color = color; }
	 * 
	 * public Color getColor() { return color; }
	 * 
	 * public void setColor(Color color) { this.color = color; }
	 */
	
	// public abstract double area();
	
	double area(); // sem 'public' e 'abstract' pois na interface já são presumidos
}
