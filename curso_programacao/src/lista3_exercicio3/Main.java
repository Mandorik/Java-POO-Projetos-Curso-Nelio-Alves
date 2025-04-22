package lista3_exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// EXERCÍCIO 3

		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
		 * Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
		 * 1 - Álcool, 2 - Gasolina, 3 - Diesel 4 - Fim. 
		 * Caso o usuário informe um código inválido (fora da faixa 1-4) deve ser solicitado um novo código
		 * (até que seja válido). O programa deve ser encerrado quando o código informado for o número 4
		 * Deve ser escrito a mensagem "MUITO OBIGADO" e a quantidade de clientes que abasteceram cada tipo
		 * de combustível conforme exemplo:
		 * 
		 * ENTRADA:
		 * 8 1 7 2 2 4
		 * SAÍDA:
		 * MUITO OBRIGADO
		 * ALCOOL: 1
		 * GASOLINA: 2
		 * DIESEL: 0
		 * */
		
		Scanner sc = new Scanner(System.in);
		int qtdAlcool = 0;
		int qtdGasolina = 0;
		int qtdDiesel = 0;
		int inputUsuario = 0;
		
		while(inputUsuario != 4) {
			
			System.out.println("Digite o código do produto: ");
			inputUsuario = sc.nextInt();
			switch(inputUsuario) {
			case 1:
				qtdAlcool += 1;
				break;
			case 2:
				qtdGasolina += 1;
				break;
			case 3:
				qtdDiesel += 1;
				break;
			case 4:
				System.out.println("Muito Obrigado!");
				break;
			default:
				System.out.println("Código inválido");
			}
		}
		
		System.out.println("Álcool: " + qtdAlcool);
		System.out.println("Gasolina: " + qtdGasolina);
		System.out.println("Diesel: " + qtdDiesel); 
		
		sc.close();
			
			
	}

}
