package lista2_exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// EXERCÍCIO 5
		
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir,
		 * calcule e mostre o valor da conta a pagar
		 * 
		 * CODIGO	ESPECIFICAÇÃO 		PREÇO
		 * 1		Cachorro Quente		R$ 4.00
		 * 2		X-Salada			R$ 4.50
		 * 3		X-Bacon				R$ 5.00
		 * 4		Torrada simples		R$ 2.00
		 * 5		Refrigerante		R$ 1.50
		 * 
		 * 
		 * Exemplos:
		 * 
		 * ENTRADA: 3 2
		 * SAÍDA: Total: R$ 10.00
		 * 
		 * ENTRADA: 2 3
		 * SAÍDA: Total: R$ 13.50
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtd;
		double preco = 0, total;
		
		System.out.println("Digite o código do produto:");
		codigo = sc.nextInt();
		System.out.println("Quantas unidades?");
		qtd = sc.nextInt();
		
		switch(codigo) {
		case 1:
			preco = 4;
			break;
		case 2:
			preco = 4.5;
			break;
		case 3:
			preco = 5;
			break;
		case 4:
			preco = 2;
			break;
		case 5:
			preco = 1.5;
			break;
		default:
			System.out.println("Código inválido!");
		}
		
		total = preco * qtd;
		
		System.out.printf("O total foi de R$ %.2f", total);
		
		sc.close();
		
	}

}
