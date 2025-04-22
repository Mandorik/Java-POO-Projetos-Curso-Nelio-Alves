package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// FileWriter (stream de escrita de caracteres em arquivos)
		
		// Cria/Recria o arquivo: new FileWriter(path)
		// Acrescenta ao arquivo existente: new FileWriter(path, true)
		
		// O arquivo existente será aberto e tudo o que você escrever será escrito no final do arquivo
		
		// BufferedWriter (mais rápido)

		String[] lines = new String[] {
				"Good morning",
				"Good afternoon",
				"Good night"
		};
		
		String path = "D:\\Downloads (HD)\\gm-ga-gn.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line); // de padrão o write não tem quebra de linha
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
