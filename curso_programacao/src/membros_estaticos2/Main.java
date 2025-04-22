package membros_estaticos2;

import java.util.Scanner;

import util_membros_estaticos2.Calculator;

public class Main {

	public static void main(String[] args) {
		
		// Agora, como os membros da classe não são static, somos obrigados a instancear o objeto
		
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator(); // Objeto instanciado
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("Pi's value: %.2f\n", calc.PI);
		
		sc.close();

	}

}
