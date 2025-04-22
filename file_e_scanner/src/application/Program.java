package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Lendo um arquivo texto com classes File e Scanner
		
		// File - representação abstrata de um arquivo e seu caminho
		
		// Scanner - Leitor de texto
		
		// IOException (Exception) - exceção padrão de entrada e saída quando se mexe com arquivos
		
		File file = new File("D:\\Downloads (HD)\\gm-ga.txt"); // Pomos duas \ pois \ é prefixo de caracteres especiais - exemplo \n - então se poe \\
		// Esse objeto file vai encapsular todo o processo de acessar o arquivo e também o caminho do arquivo. A partir do file tem-se várias operações
		Scanner sc = null;
		// Instanciar o Scanner a partir do arquivo - nisso o programa tenta abrir o arquivo e uma exceção pode ser gerada. Nisso somos obrigados a por isso num bloco try
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Error_" + e.getMessage());
		}
		finally { // Posto em finally pois, se puséssemos no try, caso falhasse não seria fechado, no catch, se não falhasse não seria fechado.
			if(sc != null) { // Se não entrar no try, o sc fica nulo, e aí se fecharmos dá um exception tbm, por isso o if
				sc.close();
			}
		}
		
	}

}
