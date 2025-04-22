package lista_de_exercicios2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone. Cada minuto 
		 * que exceder a franquia de 100 minutos custo R$ 2.00. Faça um programa para ler a quantidade de minutos que uma pessoa consumiu,
		 * daí mostrar o valor a ser pago
		 * 
		 * Entrada: 22
		 * Saída: Valor a pagar: 50.00
		 * 
		 * Entrada: 103
		 * Saída:
		 * Valor a pagar: R$ 56.00
		 * */
		
		Scanner sc = new Scanner(System.in);
		int qtdGasta, qtdExtrapolada = 0;
		double total;
		
		System.out.println("Digite quantos minutos foram gastos:");
		qtdGasta = sc.nextInt();
		
		if (qtdGasta <= 100)
			total = 50.00;
		else
			qtdExtrapolada = qtdGasta - 100;
			total = 50.00 + (qtdExtrapolada * 2.00);
		
		System.out.printf("O total é de R$ %.2f", total);

		sc.close();
	}

}
