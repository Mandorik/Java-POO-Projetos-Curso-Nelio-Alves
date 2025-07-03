package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Generics permitem que classes, interfaces e métodos possam ser parametrizados por tipo. 
		 * Seus benefícios são:
		 * 1) Reuso
		 * 2) Type safety
		 * 3) Performance
		 * 
		 * Uso comum: coleções
		 * 
		 * List<string> list = new ArrayList<>();
		 * list.add("Maria");
		 * String name = list.get(0);
		 * */
		
		/*
		 * Problema motivador 1 (reuso)
		 * 
		 * Faça um programa que leia uma quantidade N, e depois N números inteiros. Ao final, imprima esses números
		 * de forma organizada conforme exemplo. Em seguida, informe qual o primeiro valor informado
		 * 
		 * Example:
		 * 
		 * How many values? 3
		 * 10
		 * 8
		 * 23
		 * [10, 8, 23]
		 * First: 10
		 * */

		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.printf("How many values? ");
		int N = sc.nextInt();
		
		// Agora dará erro tentar adicionar uma String por conta do Type Safety
		// ps.addValue("Maria");
		
		for (int i = 0; i < N; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
		
		/*
		 * Caso fóssemos usar o PrintService para Strings e não Integers, do jeito que está, teríamos de trocar
		 * todas a lógica que utiliza Integer por Strings - ou criando um Service específico para Strings. Isso
		 * acaba impedindo a reutilização do Service para outros tipos.
		 * */
	}

}
