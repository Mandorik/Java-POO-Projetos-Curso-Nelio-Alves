package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Suponha que quiséramos acessar somente o nome do arquivo e não o caminho completo
		
		System.out.println("getName: " + path.getName());
		
		// Agora, só o caminho sem o nome
		
		System.out.println("getParent: " + path.getParent());
		
		// Todo o caminho
		
		System.out.println("getPath: " + path.getPath());

		sc.close();
	}

}
