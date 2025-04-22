package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		// DESAFIO SOBRE VETORES (PENSIONATO)
		
		/*
		 * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos 
		 * números 0 a 9.
		 * 
		 * Faça um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o número
		 * de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada 
		 * registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu (0 a 9). Suponha que
		 * seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de todas as ocupações do pensionato,
		 * por ordem de quarto, conforme exemplo:
		 * 
		 * Exemplo:
		 * 
		 * Rent 1#
		 * Name: Maria Green
		 * Email: maria@gmail.com
		 * Room: 5
		 * 
		 * Rent #2:
		 * Name: Marco Antonio
		 * Email: marco@gmail.com
		 * Room: 1
		 * 
		 * Rent #3:
		 * Name: Alex Brown
		 * Email: alex@gmail.com
		 * Room: 8
		 * 
		 * Busy rooms:
		 * 1: Marco Antonio, marco@gmail.com
		 * 5: Maria Green, maria@gmail.com
		 * 8: Alex Brown, alex@gmail.com
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();
		
		Rent[] rooms = new Rent[10]; 
		
		for ( int i = 1; i <= N; i++ ) {
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			sc.nextLine(); // Limpeza do buffer do nextInt
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int rentedRoom = sc.nextInt();
			Rent rent = new Rent(name, email); // Depois de lidos os dados, é possível instanciar o objeto
			rooms[rentedRoom] = rent; // Na posição equivalente ao input da variável rentedRooms é recebido os dados presentes no objeto Rent
			// Pode ser feito direto, também:
			// rooms[rentedRooms] = new Rent(name, email);
			// Assim, instancia um novo objeto e atribui a referência dele na posição roomNumber informado
			System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		
		for ( int i = 0; i < 10; i++ ) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}
		
		
		
		sc.close();

	}

}
