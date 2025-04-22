package lista3_exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// EXERCÍCIO 1
		
		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura
		 * de senha incorreta informada, escrever a mensagem "Senha inválida". Quando a senha for informada
		 * corretamente deve ser impressa a mensagem: "Acesso Permitido" e o algoritmo encerrado.
		 * 
		 * Considere a senha correta como 2002
		 * 
		 * Entrada: 2200 1020 2022 2002
		 * Saída: Senha Inválida, Senha Inválida, Senha Inválida, Acesso Permitido
		 * */

		int senhaCorreta = 2002;
		int senha;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua senha:");
		senha = sc.nextInt();
		
		while (senha != senhaCorreta) {
			System.out.printf("Senha inválida\n");
			System.out.println("Digite novamente sua senha");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();
		
	}

}
