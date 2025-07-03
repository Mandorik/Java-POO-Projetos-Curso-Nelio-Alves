package application;

public class Program {

	public static void main (String[] args) {

		/*
		 * É uma interface que possui um único método abstrato. Suas implementações serão tratadas como
		 * expressões lambda.
		 * 
		 * Exemplo do MyComparator. 
		 * Havia uma classe chamada MyComparator que implementa a interface Comparator<T>
		 * e então implementamos um método da Interface, e depois nós pudemos passar o objeto da classe como argumento
		 * da função sort
		 * 
		 * EXEMPLO:
		 * 
		 * public class MyComparator implements Comparator<Product> {
		 * 		
		 * 		@Override
		 * 		public int compare(Product p1, Product p2) {
		 * 			return p1.getName().toUpperClass().compareTo(p2.getName().toUpperClass());
		 * 		}
		 * }
		 * 
		 * public static void main (String[] args){
		 * 		
		 * 		(...)
		 * 
		 * 		list.sort(new MyComparator());
		 * 
		 * }
		 * */
		
		/*
		 * Então, o que importa é entendermos que na linguagem Java a interface funcional tem um mapeamento direto com 
		 * expressão lambda. No fundo a expressão lambda é tratada como interface. No caso interface funcional, que só 
		 * tem um método abstrato.
		 * */
	}
}
