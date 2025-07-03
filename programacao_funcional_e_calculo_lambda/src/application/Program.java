package application;

public class Program {

	public static void main(String[] args) {

		/*
		 * Paradigmas de programação
		 * 
		 * Imperativo (C, Pascal, Foltran, Cobol)
		 * 
		 * Orientado a Objetos (C++, Object Pascal, Java (< 8), C#(< 3)
		 * 
		 * Funcional (Haskell, Closure, Clean, Erlang)
		 * 
		 * Lógico (Prolog)
		 * 
		 * Multiparadigma (JavaScript, Java (8+), C# (3+), Ruby, Python, Go)
		 * */
		
		/*
		 * Baseado no formalismo matemático Cálculo Lambda (Church 1930)
		 * Programação Imperativa: comandos ("como" - imperativa)
		 * Programação Funcional: expressões ("o quê" - declarativa
		 * 
		 * Como se descreve algo a ser computado (*)
		 * Programação Imperativa: fraco
		 * Programação Funcional: forte
		 * 
		 * Funções possuem transparência referencial (ausência de efeitos colaterai)
		 * Programação Imperativa: raro
		 * Programação Funcional: comum
		 * 
		 * Objetos imutáveis (*)
		 * Programação Imperativa: raro
		 * Programação Funcional: comum
		 * 
		 * Funções são objetos de primeira ordem
		 * Programação Imperativa: não
		 * Programação Funcional: sim
		 * 
		 * Expressividade / código conciso
		 * Programação Imperativa: baixa
		 * Programação Funcional: alta
		 * 
		 * Tipagem dinâmica / interferência de tipos
		 * Programação Imperativa: raro
		 * Programação Funcional: comum
		 * */
		
		/*
		 * Transparência referencial:
		 * 
		 * Uma função possui transparência referencial se seu resultado for sempre o mesmo para os mesmos dados de entrada.
		 * Benefícios simplicidade e previsibilidade:
		 * 
		 * EXEMPLO:
		 * 
		 * public static int globalValue = 3;
		 * 
		 * public static void main (String[] args) {
		 * 
		 * 		int[] vect = new int[] { 3, 4, 5};
		 * 		changeOddValues(vect);
		 * 		System.out.println(Arrays.toString(vect));
		 * 
		 * }
		 * 
		 * public static void changeOddValues(int[] numbers) {
		 * 		for (int i=0; i < numbers.length; i++) {
		 * 			if (numbers[i] % 2 != 0) {
		 * 				numbers[i] += globalValue;
		 * 			}
		 * 		}
		 * 	}
		 * 
		 * Se o globalValue mudar, o resultado changeOddValues também, mudará. Ou seja, a transparência referencial é quando o resultado
		 * da função depende exclusivamente dos valores de entrada e não de um valor externo (globalValue).
		 * Assim terá o mesmo resultado para os mesmos valores de entrada
		 * */
		
		/*
		 * Funções como objetos de primeira ordem:
		 * 
		 * Isso significa que funções podem, por exemplo, serem passadas como parâmetros de métodos, bem como retornadas
		 * como resultado de métodos.
		 * 
		 * EXEMPLO:
		 * 
		 * public static int compareProducts(Product p1, Product p2) {
		 * 		return p1.getPrice().compareTo(p2.getPrice());
		 * }
		 * 
		 * public static void main(String[] args) {
		 * 
		 * 		List<Product> list = new ArrayList<>();
		 * 
		 * 		list.add(new Product("TV", 900.00));
		 * 		list.add(new Product("Notebook", 1200.00));
		 * 		list.add(new Product("Tablet", 450.00));
		 * 
		 * 		list.sort(Program : : compareProducts); // Uma função pode ser passado como argumento e ser retornado por uma função
		 * 
		 * 		list.forEach(System.out : : println);
		 * }
		 * */
		
		/*
		 * O que são "expressões lambda"?
		 * 
		 * Em programação funcional, expressão lambda corresponde a uma função anônima [não tem nome] de primeira classe [pode ser 
		 * argumento para outras funções] 
		 * 
		 * EXEMPLO:
		 * 
		 * public static int compareProducts(Product p1, Product p2){
		 * 		return p1.getPrice().compareTo(p2.getPrice());
		 * }
		 * 
		 * 	(...)
		 * 	
		 * 	list.sort(Program: :compareProducts);
		 * 	
		 * 	list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
		 * 
		 * 	(...)
		 * 
		 * */
		
		
	}

}
