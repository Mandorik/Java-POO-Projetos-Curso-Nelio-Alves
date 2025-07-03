package model.entities;

import model.enums.Color;

public abstract class AbstractShape implements Shape {

	// Por implementar Shape, é necessário cumprir o contrato: implementar o método dele
	// Como não é essa classe que implementa a área, contorna-se declarando-na como abstract
	
	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
