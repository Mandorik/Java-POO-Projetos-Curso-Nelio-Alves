package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		/*
		 * Set<T>
		 * 
		 * Representa um conjunto de elementos (similar ao da Álgegra)
		 * 1) Não admite repetições
		 * 2) Elementos não possuem posição (podem ou não possuir ordem)
		 * 3) Acesso, inseção e remoção de elementos são rápidos
		 * 4) Oferece operações eficiente de conjunto: interseção, união, diferença
		 * Principais implementações:
		 * i) HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
		 * ii) TreeSet - mais lento (operações O(log((n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
		 * iii) LinkedHashset - velocidade intermediária e elementos na ordem em que são adicionados
		 * */
		
		/*
		 * Alguns métodos importantes
		 * 
		 * add(obj), remove(obj), contains(obj)
		 * i) Baseado em equals e hashCode
		 * ii) Se equals e hashCode não existirem, é usada comparação de ponteiros
		 * 
		 * clear() - esvazia o conjunto
		 * size() - retorna o tamanho (qnt de elementos)
		 * removeIf(predicate) - remova todo mundo que atender ao predicado
		 * 
		 * addAll(other) - união: adiciona no conjunto os elementos do conjunto other, sem repetição
		 * retainAll(other) - interseção: remove do conjunto os elementos não contidos em other
		 * removeAll(other) - diferença: remove do conjunto os elementos contidos em other
		 * */
		
		// Demo 1
		
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		// System.out.println(set.contains("Notebook"));
		
		// set.remove("Tablet");
		
		// set.removeIf(x -> x.length()>= 3);
		
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for  (String p : set) {
			System.out.println(p);
		}
		
		// Demo 2
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		// Union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		// Intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// Difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
		
		// Como as coleções Hash testam igualdade?
		
		/*
		 * Se hashCode e equals estiverem implementados:
		 * Primeiro hashCode. Se der igual, usa equals para confirmar
		 * Lembre-se: String, Integer, Double etc já possuem equals e hashCode
		 * 
		 * Se hashCode e equals NÃO estiverem implementados:
		 * Compare as referências (ponteiros) dos objetos.
		 * */
		
		Set<Product> setProd = new HashSet<>();
		
		setProd.add(new Product("TV", 900.0));
		setProd.add(new Product("Notebook", 1200.0));
		setProd.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		System.out.println(setProd.contains(prod)); // havia dado false pq Product não tem hashCode e Equals, assim usou ref de ponteiros
		// Uma vez implementados dá true pois agora compara por conteúdo, e não referência de ponteiro do objeto
		
		// Como TreeSet compara elementos de um conjunto?
		
		Set<Product> setProd2 = new TreeSet<>();
		
		setProd2.add(new Product("TV", 900.0));
		setProd2.add(new Product("Notebook", 1200.0));
		setProd2.add(new Product("Tablet", 400.0));
		
		for (Product p : setProd2) {
			System.out.println(p);
		}
		
		// Deu uma Exception "Product cannot be cast to class java.lang.Comparable"
		// Pois não implementamos a interface Comparable na nossa entity Product
		
		// Ou seja, usando TreeSet a classe do conjunto tem que ser implementação do comparable, para que seja possível
		// para o TreeSet ordenar seus objetos
		
	}

}
