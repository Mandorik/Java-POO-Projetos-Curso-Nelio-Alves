package debugging_aprendizagem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Aprendendo a usar o debugging:

		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble(); //Marcar como um breakpoint

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("Area = %.2f\n", area);
		System.out.printf("Preço = %.2f\n", preco);

		sc.close();

		
		/*
		 * Para marcar uma linha de breakpoint:
		 * Run -> Toggle Breakpoint
		 * 
		 * Para inciar o debug:
		 * Botão direito na classe -> Debug as -> Java Application
		 * 
		 * Para executar uma linha:
		 * F6 ou botão "Step Over"
		 * 
		 * Para interromper o debug:
		 * Botão "Terminate"
		 * */
	}

}
