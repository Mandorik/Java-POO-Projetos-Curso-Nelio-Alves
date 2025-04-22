package membros_estaticos3;

import java.util.Scanner;

import util_membros_estaticos3.Calculator;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Calculator calc = new Calculator(); 
		// Não sendo mais necessário instanciá-la
		
		System.out.println("Enter the radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius); // Não mais estipula o objeto instanciado
		
		double v = Calculator.volume(radius); // Mas, sim, a classe
		
		System.out.printf("Circumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("Pi's value: %.2f", Calculator.PI); 
		
		/*
		 * Agora temos métodos estáticos (circumference e volume) e também constante estática (PI), podendo 
		 * ser utilizados independente de qualquer objeto, basta colocar o nome da classe . o que quer que seja chamado */

		sc.close();
	}

}
