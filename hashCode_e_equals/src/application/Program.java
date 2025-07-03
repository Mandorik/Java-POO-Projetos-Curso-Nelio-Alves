package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * São operações da classe Object utilizadas para comparar se um objeto é igual a outro
		 * 
		 * 1) equals: lento, resposta 100%
		 * 2) hashCode: rápido, porém resposta positiva não é 100%
		 * 
		 * Tipos comuns (String, Date, Integer, Double etc) já possuem implementação para essas operações.
		 * Classes personalizadas precisam sobrepô-las
		 * */
		
		/*
		 * Equals
		 * 
		 * Método que compara se o objeto é igual a outro, retornando true ou false.
		 * 
		 * String a = "Maria";
		 * String b = "Alex";
		 * 
		 * System.out.println(a.equals(b)); // false
		 * */
		
		/*
		 * HashCode
		 * 
		 * Método que retorna um número inteiro representando um código gerado a partir das informações do objeto
		 * 
		 * String a = "Maria";
		 * String b = "Alex";
		 * String c = "Maria";
		 * 
		 * System.out.println(a.hashCode()); // 74113750
		 * System.out.println(b.hashCode()); // 2043454 
		 * System.out.println(c.hashCode()); // 74113750
		 * 
		 * Para dados com o mesmo conteúdo, o código gerado deve ser o mesmo. Só que para dados diferentes,
		 * muito provavelmente serão gerados códigos diferentes. Porém, como o número inteiro é limitado a 32 bits,
		 * esse hashCode gerado pode dar colisões. Podem ter objetos diferentes que coincidentemente geraram o mesmo hashcode.
		 * Mas é mera coincidência e muito difícil de acontecer, já que em 32bits cabem 4bi de possibilidades
		 * */
		
		/*
		 * Regra de ouro do HashCode
		 * 
		 * Se o hashCode de dois objetos for diferente, então os dois objetos são diferentes
		 * Se o código de dois objetos for igual, muito provavelmente os objetos são iguais (pode haver colisão)
		 * */
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); // false
		
		/*
		 * Deu false pois o == com exceção de tipos que têm tratamento especial (como String) ele vai comparar não o conteúdo,
		 * mas as referências de memória. Como são dois objetos diferentes, foram alocados no heap dois objetos diferentes. 
		 * Têm posições de memória diferente.
		 * Embora tenham mesmo conteúdo estão em posições diferentes.
		 * */
		
		
		String s1 = "Teste";
		String s2 = "Teste";
		
		System.out.println(s1 == s2); // true
		
		// Isso ocorre por contra do tratamento especial oara literais,
		
		// O que não acontece se você forçar a criação de um novo Objeto da forma comum
		
		String s3 = new String("Teste");
		String s4 = new String("Teste");
		
		System.out.println(s3 == s4); // false
	}

}
