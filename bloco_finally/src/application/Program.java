package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main (String[] args) {
		
		// Bloco FINALLY
		
		/*
		 * É um bloco que contém código a ser executado independentemente de ter ocorrido ou não uma exceção
		 * 
		 * Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou outro recurso específico ao final do processamento
		 * */
		
		File file = new File("D:\\Downloads (HD)\\in.txt"); // Inicializamos uma variável do tipo File, na instanciação passamos seu caminho
		Scanner sc = null;
		try { // Vamos tentar instanciar esse Scanner apontando pra esse arquivo
			sc = new Scanner(file); // Scanner também serve para apontar para arquivos
			while (sc.hasNextLine()) { // Se o arquivo existir, vou percorrê-lo
				System.out.println(sc.nextLine()); // Mostramos na tela
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally { // Independente de ter dado certo ou não, temos de fechar o arquivo
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed");
		}
		
	}
}
