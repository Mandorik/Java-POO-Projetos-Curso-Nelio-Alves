package aula_entrada_de_dados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		//Para fazer entrada de dados, criaremos um objeto do tipo "Scanner" da seguinte forma:
		//Necessário primeiro importar o Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//PARA LER UM TEXTO
		
		String x;
		
		x = sc.next(); //Isso vai permitir que digitemos uma palavra e ela seja armazenada dentro da variável x
		
		System.out.printf("Você digitou o valor %s", x);
		
		sc.close(); //Quando não precisar mais do objeto - .close() vai desalocar o recurso que criamos
		*/
		//####################################################################################################
		
		//PARA LER UM NÚMERO INTEIRO!
		/*
		Scanner scInt = new Scanner(System.in);
		
		int y;
		
		y = scInt.nextInt();
		
		System.out.printf("Você digitou o número %d", y);
		
		scInt.close();
		*/
		//######################################################################################################
		
		//PARA LER UM NÚMERO DE PONTO FLUTUANTE!
		
		//O Local.setDefault ficaria aqui em cima
		/*Scanner scDouble = new Scanner(System.in);
		
		double w;
		
		w = scDouble.nextDouble(); //ele pega separador do sistema, então tem que usar o Locale qql coisa
		
		System.out.printf("Você digitou o número de ponto flutuante: %.2f", w);
		
		scDouble.close();
		*/
		
		//PARA LER UM CARACTER
		/*
		Scanner scChar = new Scanner(System.in);
		
		char z;
		
		z = scChar.next().charAt(0); //charAt(0) pega o caractér na posição 0, ou seja, o 1º da String
		
		System.out.println("O caractér digitado foi: " + z);
		
		scChar.close();
		*/
		
		//Para ler vários dados na mesma linha?!
		
		/*Scanner sc2 = new Scanner(System.in);
		
		String X;
		int Y;
		double Z;
		
		X = sc2.next();
		Y = sc2.nextInt();
		Z = sc2.nextDouble();
		
		System.out.printf("Você digitou o texto: %s\nVocê digitou o número inteiro: %d\nVocê digitou o número de ponto flutuante %.2f", X, Y, Z);
		
		sc2.close();
		*/
		
		//PARA LER UM TEXTO ATÉ A QUEBRA DE LINHA!
		
		Scanner sc3 = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = sc3.nextInt();
		sc3.nextLine();
		s1 = sc3.nextLine(); // ele pega a linha toda até você dar o próximo enter
		s2 = sc3.nextLine(); // e assim
		s3 = sc3.nextLine(); // sucessivamente

		System.out.println("Dados digitados:"); //Nesse caso o s1 ficou uma string vazia pois foi consumida ao dar enter depois de digitar o 'x' 
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc3.close();
		
		/*
		 * Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linha
		 * fica "pendente" na entrada padrão.
		 * 
		 * Se você então fizer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine()*/
		
		//SOLUÇÂO?
		//Fazer um nextLine() extra antes de fazer o nextLine() de seu interesse
		
	}

}
