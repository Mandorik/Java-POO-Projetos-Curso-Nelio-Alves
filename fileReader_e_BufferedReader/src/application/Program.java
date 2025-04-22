package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// FileReader (stream de leitura de caracteres a partir de arquivos)
		
		/*
		 * Lembrando que stream = sequência
		 * 
		 * Em outras palavras: quando instanciar um FileReader vou estabelecer uma sequência de leitura a partir de um arquivo.
		 * À medida que eu for precisando ler esse arquivo eu vou navegando aqui na stream
		 * */
		
		// BufferedReader (mais rápido)
		
		/*
		 * Vai ser instanciado a partir do FileReader e ele implementa algumas otimizações, utiliando buffer de memória. Por isso
		 * mais rápido.
		 * */
		
		// Muito melhor com streams do que ficar abrindo e fechando manualmente as streams
		
		// BLOCO TRY-WITH-RESOURCES
		
		// É um bloco try que declara um ou mais recursos, e garante que esses recursos serão fechados ao final do bloco

		
		String path = "D:\\Downloads (HD)\\gm-ga.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine(); // readLine vai ler uma linha do arquivo, se já tiver no final ele vai retornar nulo
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		}

	}

