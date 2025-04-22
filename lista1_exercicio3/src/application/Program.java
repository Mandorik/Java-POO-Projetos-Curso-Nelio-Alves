package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// Exercício 3
		
		/*
		 * Faça um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
		 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno
		 * no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
		 * para o aluno obter o mínimo para se aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver
		 * esse problema:
		 * 
		 * 
		 * Exemplos:
		 * Entrada:
		 * Alex Green
		 * 27.00
		 * 31.00
		 * 32.00
		 * 
		 * Saída:
		 * FINAL GRADE = 90.00
		 * PASS
		 * 
		 * Entrada:
		 * Alex Green
		 * 17.00
		 * 20.00
		 * 15.00
		 * 
		 * Saída:
		 * FINAL GRADE: 52.00
		 * FAILED
		 * MISSING 8.00 POINTS
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Student's Name?");
		student.name = sc.nextLine();
		System.out.println("Type in the student's grade during the first trimester");
		student.grade1 = sc.nextDouble();
		System.out.println("Type in the student's grade during the second trimester");
		student.grade2 = sc.nextDouble();
		System.out.println("Type in the student's grade during the third trimester");
		student.grade3 = sc.nextDouble();
		
		System.out.println("Final Grade: " + student.grading());
		
		if (student.grading() > 60) {
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
			System.out.printf("Missing %.2f points", student.passedOrFailed());
		}
		
		sc.close();
		

	}

}
