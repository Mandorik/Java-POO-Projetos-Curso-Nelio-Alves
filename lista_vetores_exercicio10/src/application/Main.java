package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Problema "aprovados"
		
		/*
		 * Faça um programa para ler um conjunto de N nomes de alunos, bem como as nota que eles tiraram no 1º e 2º semestres.
		 * Cada uma dessas infromações deve ser amazenada em um vetor. Depois, imprima os nomes dos alunos aprovados, considerando
		 * aprovados aqueles cuja média seja maior ou igual a 6.0 (seis)
		 * 
		 * Exemplo:
		 * Quantos alunos serão digitados? 4
		 * Digite nome, primeira e segunda nota do 1o aluno:
		 * Joao Silva
		 * 7.0
		 * 8.5
		 * Digite nome, primeira e segunda nota do 2o aluno:
		 * Maria Teixeira
		 * 9.2
		 * 6.5
		 * Digite nome, primeira e segunda nota do 3o aluno:
		 * Carlos Carvalho
		 * 5.0
		 * 6.0
		 * Digite nome, primeira e segunda nota do 4o aluno:
		 * Teresa Pires
		 * 5.5
		 * 6.5
		 * 
		 * Alunos aprovados:
		 * Joao Silva
		 * Maria Teixeira
		 * Teresa Pires
		 * */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int N = sc.nextInt();
		String nomes[] = new String[N];
		double nota1[] = new double[N];
		double nota2[] = new double[N];
		double avgAluno = 0;
		
		
		for ( int i = 0; i < N; i++) {
			System.out.printf("Digite o nome, 1ª e 2ª notas do %dº aluno:", i + 1);
			System.out.println();
			sc.nextLine();
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("1ª Nota: ");
			nota1[i] = sc.nextDouble();
			System.out.print("2ª Nota: ");
			nota2[i] = sc.nextDouble();
			
		}
		
		System.out.println("Alunos aprovados:");
		
		for ( int i = 0; i < N; i++) {
			
			avgAluno = (nota1[i] + nota2[i]) / 2;
			
			if(avgAluno >= 6.0) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();

	}

}
