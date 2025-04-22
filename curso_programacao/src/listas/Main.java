package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// LISTAS
		
		/*
		 * Lista é uma estrutura de dados:
		 * - Homogênea (dados do mesmo tipo)
		 * - Ordenada (elementos acessados por meio de posições)
		 * - Inicia vazia, e seus elementos são alocados sob demanda
		 * - Cada elemento ocupa um "nó" (ou nodo) da lista
		 * 
		 * Tipo (interface): List - interface é um tipo que define apenas a especificação das operações. Precisamos de uma classe que implementa essa interface
		 * Classes que implementam: ArrayList, LinkedList etc.
		 * 
		 * Vantagens:
		 * - Tamanho variável
		 * - Facilidade para se realizar inserções e deleções
		 * Desvantagens:
		 * - Acesso sequencial aos elementos *
		 * 
		 * O * é justamente pois dependendo da implementaçao da lista, essa navegação é otimizada.
		 * ArrayList é otimizado, uma mistura de vetor e lista. Otimizando o acesso, com comportamento parecido ao vetor
		 * */
		
		
		/*
		 * DEMO:
		 * 
		 * -Tamanho da lista: size()
		 * - Inserir elemento na lista: add(obj), add(int, obj)
		 * - Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
		 * - Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
		 * - Filtrar lista com base em predicado: 
		 * List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.loList());
		 * - Encontrar primeira ocorrência com base em predicado:
		 * Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
		 * */
		
		
		// Lembrando que a list não aceita tipos primitivos, por isso usamos o wrapper
		
		// O que foi posto dentro de <> é o generics, que é quando você parametriza a definição de um tipo informando um outro tipo específico
		List<String> list = new ArrayList<>(); // Em versões antigas é obrigatório pôr ArrayList<String>();
		// Por que escolhemos ArrayList? Pois essa implementação é muito otimizada, pega melhores características de vetor e lista
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		// Para inserir um item em uma posição específica, fazemos com essa sobrecarga:
		
		list.add(2, "Marco");
		
		// Para imprimir o tamanho da lista:
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		// Para remover um item da lista, a "Anna" por exemplo
		list.remove("Anna");
		
		// No caso, a lista tem capacidade de remover o item por comparação, já que o "Anna" do list.remove != list.add
		
		
		// Para remover por posição
		list.remove(1);
		
		// Possível remover itens que atendem a um predicado. Por exemplo, todo mundo que começa com a letra 'M'
		list.removeIf(x -> x.charAt(0) == 'M');
		
		// Predicado pois é uma função em lambda, que vai retornar verdadeiro ou falso
		
		System.out.println("-----------------------");
		System.out.println("Lista após remoções:");
		
		// Para percorrer a lista:
		for (String x : list) {
			System.out.println(x);
		}
		
		
		// Para encontrar a posição de um elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		// Se o elemento não existir?
		System.out.println("Index of Fulano: " + list.indexOf("Fulano"));
		
		System.out.println("-----------------------");

		
		list.add("Maria");
		list.add("Alex");
		list.add("Marco");
		list.add("Anna");
		
		// E se quisermos manter baseado em predicado?
		// É necessário declarar uma nova lista e então um comando pra pegar a lista original, filtrar o que é necessário e devolver uma nova lista com os elementos
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		// Stream é um tipo especial do Java 8 em diante que aceita operações com operações lambda
		// Mas ele não é compatível com String, então vamos ter de convertê-lo novamente 
		
		
		// Agora, como encontramos um elemento da lista que atenda a um certo predicado
		// Exemplo, queremos achar o primeiro elemento que comece com a letra 'A'
		
		System.out.println("-----------------------");

		// .findFirst retorna um Optional
		// .orElse é caso o .findFirst não ache nenhum elemento
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(name);
		
		String nameNull = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		
		System.out.println(nameNull);
		
		
	}

}
