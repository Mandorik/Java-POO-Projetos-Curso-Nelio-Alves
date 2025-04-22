package for_each;

public class Main {

	public static void main(String[] args) {
		// Laço "for each"
		
		// Sintaxe opcional e simplificada para percorrer coleções
		
		// Sintaxe:
		
		/*
		 * for (Tipo apelido : coleção) {
		 * 		<comando 1>
		 * 		<comando 2>
		 * 	}
		 * */
		
		// Por padrão percorrerá a coleção inteira chamando cada elemento pelo apelido que lhe foi dado

		// Instancio o vector com alguns valores, assim vect tem 3 posições e estes valores:
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for ( int i = 0; i < vect.length; i++ ) {
			System.out.println(vect[i]);
		}
		
		// Fazendo o mesmo com o laço for each
		
		System.out.println("------------------------");
		for (String obj : vect) {
			System.out.println(obj); // Como é apelido, chamar o 'obj' é o mesmo que chamar o vect[i]
		}
		
	}
		
}
