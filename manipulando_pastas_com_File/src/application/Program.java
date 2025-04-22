package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath); // File pode ser tanto o caminho de um arquivo quanto um caminho de uma pasta
		
		
		// isDirectory especifica que é pra listar somente quem for Directory (pasta)
		// Essa chamada vai criar um vetor de pastas contendo cada um dos caminhos das pastas
		File[]	folders = path.listFiles(File::isDirectory);	
		
		System.out.println("FOLDERS: ");
		
		for (File folder: folders) {
			System.out.println(folder);
		}
		
		// Agora só com arquivos e não pastas
		
		File[] files = path.listFiles(File::isFile);
		
		System.out.println();
		System.out.println("FILES");
		
		for (File file: files) {
			System.out.println(file);
		}
		
		// Último teste é criar uma subpasta a partir da pasta
		
		boolean success = new File(strPath + "\\subpasta").mkdir(); // A função vai retornar um boolean indicando se deu certo ou não
		System.out.println("Directory created successfully: " + success);
		
		
		sc.close();
	}

}
