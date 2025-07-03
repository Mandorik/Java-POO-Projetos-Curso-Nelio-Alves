package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		// Exercício Proposto
		
		/*
		 * Em um portal de cursos online, cada usuário possui um código único, representado por um número inteiro.
		 * 
		 * Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode ser matricular em quantos cursos quiser.
		 * Assim, o número total de alunos de um instrutor não é simplesmente a soma dos alunos de todos os cursos que ele possui,
		 * pois pode haver alunos repetidos em mais de um curso.
		 * 
		 * O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
		 * 
		 * Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex,, depois mostrar a quantidade total
		 * de alunos dele, conforme exemplo 
		 * 
		 * EXEMPLO
		 * 
		 * How many students for course A? 3
		 * 21
		 * 35
		 * 22
		 * How many students for course B? 2
		 * 21
		 * 50
		 * How many students for course C? 3
		 * 42
		 * 35
		 * 13
		 * Total students: 6
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> aStudents = new HashSet<>();
		Set<Integer> bStudents = new HashSet<>();
		Set<Integer> cStudents = new HashSet<>();		
		
		System.out.printf("How many students for course A? ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			aStudents.add(sc.nextInt());
		}
		
		
		System.out.printf("How many students for course B? ");
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			bStudents.add(sc.nextInt());
		}
		
		System.out.printf("How many students for course C? ");
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			cStudents.add(sc.nextInt());
		}
		
		Set<Integer> totalStudents = new HashSet<>(aStudents);
		
		totalStudents.addAll(bStudents);
		totalStudents.addAll(cStudents);
		
		System.out.println("Total students: " + totalStudents.size());
		
		sc.close();
	}

}
