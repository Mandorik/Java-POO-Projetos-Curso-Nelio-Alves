package lista2_exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// EXERCÍCIO 4
		
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o jogo pode começar
		 * em um dia e terminar em outro, tendo duração mínima de 1 hora e máxima de 24 horas
		 * 
		 * Exemplos:
		 * 
		 * ENTRADA: 16 2
		 * SAÍDA: O JOGO DUROU 10 HORA(S)
		 * 
		 * ENTRADA: 0 0
		 * SAÍDA: O JOGO DUROU 24 HORA(S)
		 * 
		 * ENTRADA: 2 16
		 * SAÍDA: O JOGO DUROU 14 HORA(S)
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, duracao;
		
		System.out.println("Digite quando o jogo começou e quando o jogo terminou:");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (B>A) 
			duracao = (B-A);
		else
			duracao = 24 + B - A;
		
		
		if (duracao == 1)
			System.out.printf("O jogo durou %d hora", duracao);
		else
			System.out.printf("O jogo durou %d horas", duracao);
		
		sc.close();
		
		

	}

}
