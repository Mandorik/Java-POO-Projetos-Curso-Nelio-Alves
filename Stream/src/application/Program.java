package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		/*
		 * Stream
		 * 
		 * É uma sequência de elementos advinda de uma fonte de dados que oferece suporte a "operações agregadas".
		 * 
		 * Fonte de dados = coleção, array, função de iteração, recurso de E/S
		 * */
		
		/*
		 * Características:
		 * 
		 * Stream é uma solução para processar sequências de dados de forma:
		 * 1) Declarativa (iteração interna: escondida do programador) [escreve o que fazer, mas não vê processando]
		 * 2) Parallel-friendly (imutável -> thread safe) [ela é imutável, pode ser paralelizável de forma segura]
		 * 3) Sem efeitos colaterais
		 * 4) Sob demanda (lazy evaluation) [os dados são consumidos à medida que forem necessários]
		 * 
		 * Acesso sequencial (não há índices) [não dá pra pular elementos]
		 * 
		 * Single-use: só pode ser "usada" uma vez [consome ela não pode ser usada denovo, dá exceção]
		 * 
		 * Pipeline: operações em streams retornam novas streams. Então é possível criar uma cadeia de 
		 * operações (fluxo de processamento). 
		 * */
		
		/*
		 * Operações intermediárias e terminais
		 * 
		 * O pipeline é composto por zero ou mais operações intermediárias e uma terminal.
		 * 
		 * Operação intermediária:
		 * 1) Produz novas streams (encadeamento)
		 * 2) Só executa quando uma operação terminal é invocada (lazy evaluation)
		 * 
		 * Operação terminal:
		 * 1) Produz um objeto não-stream (coleção ou outro)
		 * 2) Determina o fim do processamento stream
		 * */
		
		/*
		 * Operações intermediárias:
		 * filter
		 * map
		 * flatmap
		 * peek
		 * distinct
		 * sorted
		 * skip
		 * limit (*)
		 * * short-circuit [você limita uma quantia de elementos, se não souber tamanho da stream]
		 * */
		
		/*
		 * Operações terminais:
		 * forEach
		 * forEachOrdered
		 * toArray
		 * reduce
		 * collect
		 * min
		 * max
		 * count
		 * anyMatch (*) [quando processamento encontrar o 1o elemento que satisfazer a condição ele para]
		 * allMatch (*) 
		 * noneMatch (*)
		 * findFirst (*) [quando encontrar a 1a ocorrência do elemento o processamento para]
		 * findAny (*)
		 * * short-circuit [cessa processamento ao satisfazer a condição]
		 * */
		
		/*
		 * Criar uma stream:
		 * 
		 * Basta chamar o método stream() ou parallelStream() a partir de qualquer objeto Collection.
		 * 
		 * [parallelStream quando processado automaticamente a máquina virtual do Java vai distribuir essa stream nos núcleos de processamento da sua máquina]
		 * 
		 * Outras formas de se criar uma stream incluem:
		 * 1) Stream.of
		 * 2) Stream.ofNullable
		 * 3) Stream.iterate
		 * */
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream(); // Cria stream a partir da lista
		
		// Agoara para imprimir o Stream:
		// existe essa operação terminal que converte o stream para um Vetor
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<Integer> st2 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<String> st3 = Stream.of("Maria", "Alex", "Bob"); // permite adicionar elementos diretamente entre parênteses
		System.out.println(Arrays.toString(st3.toArray()));
		
		Stream<Integer> st4 = Stream.iterate(0, x -> x + 2); // Ela é potencialmente infinita
		System.out.println(Arrays.toString(st4.limit(10).toArray())); // limit() é intermediária, então chamamos outra operação
		
		// Vamos gerar uma stream que seja a sequência de Fibonacci
		
		Stream<Long> st5 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]); // Java não tem tupla então fazemos esse macete
		System.out.println(Arrays.toString(st5.limit(30).toArray()));
	}

}
