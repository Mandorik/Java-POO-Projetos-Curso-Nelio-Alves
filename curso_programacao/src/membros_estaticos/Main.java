package membros_estaticos;

import java.util.Scanner;

public class Main {

	public static final double PI = 3.14159; // final é pra falar que o valor é constante. Sempre declarar com só letras maíusculas
	
	public static void main(String[] args) {
		// MEMBROS ESTÁTICOS:
		
		/*
		 * Também chamados membros de classe:
		 * Em oposição a membros de instância
		 * 
		 * São membros que fazem sentido independentemente de objetos. Não precisam de objeto para serem chamados. São chamados
		 * a partir do próprio nome da classe.
		 * 
		 * Aplicações comuns:
		 * - Classes utilitárias (Por exemplo: Math.sqrt(double))
		 * - Declaração de constantes
		 * 
		 * Uma classe que possui somente membros estáticos pode ser uma classe estática também. Esta classe não poderá ser
		 * instanciada*/

		
		// PROBLEMA EXEMPLO:
		
		/*
		 * Faça um programa para ler um valor numérico qualquer e daí mostrar quanto seria ovalor de uma circunferência
		 * e do volude uma esfera para um raio daquele valor. Informar também o valor de Pi com duas casas decimais
		 * 
		 * Exemplo:
		 * Enter radius: 3.0
		 * Circumference: 18.84
		 * Volume: 113.04
		 * Pi value: 3.14
		 * */
		
		/*
		 * Haverão 3 versões de correção: 
		 * 
		 * 1 - Métodos na própria classe do programa
		 * NOTA: dentro de um método estático você não pode chamar membros de instância da mesma classe
		 * 
		 * 2 - Classe Calculator com membros de instância [Package membros_estaticos2]
		 * 
		 * 3 - Classe Calculator com método estático [Package membros_estaticos3]
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
				
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("Pi value: %.2f\n", PI);
		
		sc.close();
	}
	

	public static double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	// Não remover o static das outras funções, senão não roda, acusa o erro:
	// Não é possível fazer uma referência static a um método não-static
	// Ou seja, usar um método não static dentro de um static
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
