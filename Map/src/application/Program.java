package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		/*
		 * Map<K,V>
		 * 
		 * É uma coleção de pares chave / valor
		 * 1) Não admite repetições do objeto chave
		 * 2) Os elementos são indexados pelo objeto chave (não possuem posição)
		 * 3) Acesso, inserção e remoção de elementos são rápidos
		 * 
		 * Uso comum: cookies, local storage, qualquer modelo chave-valor
		 * 
		 * Principais implementações:
		 * 1) HashMap - mais rápido (operações O(1) em tabela hash) e não ordenado)
		 * 2) TreeMap - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
		 * 3) LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados
		 * */
		
		/*
		 * Alguns métodos importantes:
		 * 
		 * put(key, value), remove(key, value), containsKey(key), get(key)
		 * 1) Baseado em equals e hashCode
		 * 2) Se equals e hashCode não existirem, é usada comparação de ponteiros
		 * 
		 * clear()
		 * size()
		 * 
		 * keySet() - retorna um Set<K> (set com chaves contidas no Map)
		 * values() - retorna um Collection<V> (retorna Collection com Valor)
		 * */
		
		// DEMO 1
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria"); // Operação para inserir elemento no Map
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email"); // Exclui o valor cuja chave é o valor informado
		
		cookies.put("phone", "99771133"); // Mesma key, valor diferente
		// Como não admite repetições, sobreescreveu o valor anterior
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES: ");
		
		// keySet() retorna um Set com as chaves. Assim percorremos esse conjunto chamando cada elemento pelo apelido de 'key'
		for (String key : cookies.keySet()) { 
			System.out.println(key + ": " + cookies.get(key));	
		}
		
		
		// DEMO 2
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0); // Qtd no estoque dos produtos
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product ps = new Product("Tv", 900.0); // Igual ao produto p1
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		
		// 1ªmente deu false, pois não tem equals e hashCode implementados, usando então comparação entre ponteiros de p1 com ps
		
		// Agora, com equals e hashCode deu true. Por mais que sejam instâncias diferentes (ps e p1) ele pôde comparar e ver que existe
		
	}

}
