package funcoes_interessantes_String;

public class Main {

	public static void main(String[] args) {
		// Checklist
		
		/*
		 * Formatar: toLowerCase(), toUpperCase(), trim()
		 * Recortar: substring(inicio), substring(inicio, fim)
		 * Substituir: Replace(char, char), Replace(string,string)
		 * Buscar: IndexOf, LastIndexOf
		 * str.Split("")*/
		

		//toUpperCase() = transformar tudo para maiúsculo
		//trim() = remover espaços
		
		//str.Split("") = recortar a string com base no separador informado
		
		
		String original = "abcde FGHIJ ABC abc DEFG      ";
		
		String s01 = original.toLowerCase(); // Deixa tudo minúsculo
		String s02 = original.toUpperCase(); // Deixa tudo maiúsculo
		String s03 = original.trim(); // Eliminar espaços nos cantos da string [seja antes, bem como depois]
		String s04 = original.substring(2); // Monta uma nova String a partir da posição passada
		String s05 = original.substring(2, 9); // Monta uma nova String a partir da posição 1 até a posição 2
		String s06 = original.replace('a', 'x'); // Troca posição1 por posição2
		String s07 = original.replace("abc", "xy"); // Também funciona com substrings
		int i = original.indexOf("bc"); // Retornar qual a posição da String "bc", no caso valerá [1] pois se encontra na posição 1
		int j = original.lastIndexOf("bc"); // Retorna qual a última ocorrência
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace(a, x) -" + s06 + "-"); // Todo 'a' foi trocado por um 'x'
		System.out.println("replace('abc', 'xy') -" + s07 + "-");
		System.out.println("indexOf('bc') [" + i + "]");
		System.out.println("lastIndexOf('bc') [" + j + "]");
		
		
		//Operação Split
		
		/*
		 * O que ela faz? Supohamos que queremos pegar o potato, o apple e o lemon e jogarmos cada qual em uma variável o que o split faz? 
		 * ele recebe um separador entre () e gera um vetor com as partes do string recortadas conforme o separador informado*/
		
		String s = "potato apple lemon"; //se tivesse mais " orange"
		
		String[] vect = s.split(" "); // Corta tudo baseado no separador e guarda tudo em um vetor
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		//o vect teria mais uma posição, podendo ser acessada por vect[3]
		
		//O resultado disso é jogado numa variável vect que é vetor de Strings
		
		// String word1 = vect[0];
		// String word2 = vect[1];
		// String word3 = vect[2];
		


	}

}
