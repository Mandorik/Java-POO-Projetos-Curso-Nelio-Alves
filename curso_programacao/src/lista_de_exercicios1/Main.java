package lista_de_exercicios1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler as medidas da largura e comprimento de um terreno
		 * retangular com uma casa decimal, bem como o valor do metro quadrado do
		 * terreno com duas casas decimais. Em seguida, o programa deve mostrar o valor
		 * da área do terreno, bem como o valor do preço do terreno, ambos com duas
		 * casas decimais, conforme o exemplo.
		 * 
		 * Exemplo:
		 * 
		 * Entrada: 10.0 30.0 200.00
		 * 
		 * Saída AREA = 300.00 PRECO = 60000.00
		 */

		double largura, comprimento, valorM2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a largura do terreno:");
		largura = sc.nextDouble();
		System.out.println("Digite o comprimento do terreno:");
		comprimento = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado na região:");
		valorM2 = sc.nextDouble();
		sc.close();

		double area = largura * comprimento;
		double preco = area * valorM2;

		System.out.printf("A área do terreno é de %.2fm²\n", area);
		System.out.printf("O preço do terreno é de R$ %.2f \n", preco);

	}

}
