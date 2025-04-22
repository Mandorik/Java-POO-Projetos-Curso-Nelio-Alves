package exercicio_case;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia de
		 * semana (sendo 1 = domingod, 2 = segunda etc). Escrever na tela o dia da
		 * semana correpondente, conforme exemplos:
		 * 
		 * ENTRADA: 1 SAÍDA: Dia da semana: Domingo
		 * 
		 * ENTRADA: 4 SAÍDA: Dia de semana: Quarta
		 * 
		 * ENTRADA: 9 SAÍDA: Dia de semana: valor inválido
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int inputUsuario;

		System.out.println("Digite o dia da semana:");
		inputUsuario = sc.nextInt();

		switch (inputUsuario) {
		case 1:
			System.out.println("Dia da semana: Domingo");
			break;
		case 2:
			System.out.println("Dia da semana: Segunda-feira");
			break;
		case 3:
			System.out.println("Dia da semana: Terça-feira");
			break;
		case 4:
			System.out.println("Dia da semana: Quarta-feira");
			break;
		case 5:
			System.out.println("Dia da semana: Quinta-feira");
			break;
		case 6:
			System.out.println("Dia da semana: Sexta-feira");
			break;
		case 7:
			System.out.println("Dia da semana: Sábado");
			break;
		default:
			System.out.println("Valor inválido!");
			break;
		}

		sc.close();

	}

}
