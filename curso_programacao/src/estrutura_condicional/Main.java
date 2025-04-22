package estrutura_condicional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// V executa o bloco de comandos
		// F pula o bloco de comandos
		
		// Estrutura condicional simples
		// apenas o if (condição){ lorem ipsum }
		
		// Estrutura condicional composta
		// if e else
		// if F pula pro else
		
		int hora;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		
		/*if (hora >= 6 && hora <= 12) {
			System.out.println("Bom dia");
		}else {
			System.out.println("Boa tarde");
		}*/
		
		// Estrutura condicional encadeada, caso tenha mais de duas possibilidades:
		
		if (hora > 6 && hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora >= 12 && hora < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}
		

		// Se tiver apenas um comando dentro, é possível remover os {}
		
		sc.close();

	}

}
