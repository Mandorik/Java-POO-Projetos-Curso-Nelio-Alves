package util_membros_estaticos3;

public class Calculator {

	/*
	 * Sobre o problema dos triângulos:
	 * Cada triângulo possui sua área
	 * 
	 * Area() é uma operação concernente ao objeto: cada triângulo possui sua área
	 * 
	 * Exemplo:
	 * x.A = 3.0
	 * x.B = 4.0
	 * x.C = 5.0
	 * 
	 * x.area() = 6.0
	 * 
	 * y.A = 7.5
	 * y.B = 4.5
	 * y.C = 4.02
	 * 
	 * y.area() = 7.5638
	 * 
	 * Já no caso da calculadora, os valores dos cálculos não mudam para calculadoras diferentes, ou seja, são 
	 * cálculos estáticos. O valor de pi também é estático
	 * 
	 * Exemplo:
	 * 
	 * calc1.PI = 3.14
	 * calc1.circumference(3.0) = 18.85
	 * 
	 * calc2.PI = 3.14
	 * calc2.circumference(3.0) = 18.85
	 * 
	 * Ou seja, a circumferência para um dado valor sempre vai dar o mesmo resultado independente do objeto, ela também é uma 
	 * operação estática, bem como o volume de um certo raio.
	 * 
	 * O que faremos?
	 * 
	 * Transformaremos o PI e os métodos em estáticos, pois não precisam de objeto para serem chamados
	 * 
	 * */
	
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) { // Static pois pode ser calculada independente do objeto
		
		return 2.0 * PI * radius;
		
	}
	
	public static double volume(double radius) { // Static pois pode ser calculada independente do objeto
		
		return 4.0 * PI * radius * radius * radius / 3.0;
		
	}
	
}
