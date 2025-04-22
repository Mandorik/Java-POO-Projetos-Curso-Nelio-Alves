package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
	
	// Exceções
	
	// Uma exceção é qualquer condição de erro ou comportamento inesperado encontrado por um
	// programa em execução
	
	// Em Java, uma exceção é um objeto herdado da classe:
	// java.lang.Exception - o compilador obriga a tratar ou propagar
	// java.lang.RuntimeException - o compilador não obriga a tratar ou propagar
	
	// Quando lançada, uma exceção é propragada na pilha de chamadas de métodos em execução,
	// até que seja capturada (tratada) ou o programa seja encerrado
	
	// Por que exceções?
	
	// O modelo de tratamento de exceções permite que erros tratados de forma consistente
	// e flexível, usando boas práticas
	
	// Vantagens:
	
	// Delega a lógica do erro para a classe responsável por conhecer as regras que podem 
	// ocasionar o erro
	
	// Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes
	
	// A exceção pode carregar dados quaisquer
	
	// Estrutura try-catch
	
	// Bloco try
	// Contém o código que representa a execução normal do trecho de código que PODE acarretar
	// em uma exceção
	
	// Bloco catch
	// Contém o código a ser executado caso uma exceção ocorra
	// Deve ser especificado o tipo de exceção a ser tratada (upcasting permitido)
	
	// Scanner sc = new Scanner(System.in);
	
	// Vou ler vários dados numa linha, separados por espaço em branco, e cada um deles será um elemento do vetor
	// String[] vect = sc.nextLine().split(" ");
	// Depois mostrar o vector na posição informada
	// int position = sc.nextInt();
	// System.out.println(vect[position]);
	
	// Se ocorrer uma exceção sem tratar, essa mensagem nem é impressa
	// System.out.println("End of program");
	
	// Agora vamos querer capturar essa exceção, dar uma mensagem de aviso e continuar a execução do programa, com o try-catch
	
	/*
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * try { String[] vect = sc.nextLine().split(" "); int position = sc.nextInt();
	 * System.out.println(vect[position]); } catch (ArrayIndexOutOfBoundsException
	 * e) { System.out.println("Invalid position!"); } catch (InputMismatchException
	 * e) { System.out.println("Input error"); }
	 * 
	 * System.out.println("End of program!");
	 * 
	 * sc.close();
	 */
		
		method1();
		
		System.out.println("End of program!");

	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");


	}

	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace(); // Imprime na tela o rastreamento do stack
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		sc.close();
		System.out.println("***METHOD2 END***");		

	}
	
}
