package boxing_unboxing_wrapper;

public class Main {

	public static void main(String[] args) {
		// BOXING:
		
		// Processo de conversão de um objeto tipo valor para um objeto tipo referência compatível
		
		// int x = 20;
		// Object obj = x;
		
		// UNBOXING:
		
		// Processo de conversão de um objeto tipo referência para um objeto tipo valor compatível:
		
		// int x = 20;
		
		// Object obj = x;
		
		// int y = (int) obj;
		
		// System.out.println("Imprimindo o objeto 'obj': " + obj);
		// System.out.println("Imprimindo o int y: " + y);
		
		
		// WRAPPER:
		
		// São classes equivalentes aos tipos primitivos
		// Boxing e Unboxing são naturais na linguagem
		
		// Utilizando um wrapper não é necessário usar o casting:
		
		int x = 20;
		
		Integer obj = x; // São os tipos primitivos com letra maiúscula
		
		int y = obj;
		
		System.out.println("Imprimindo o 'obj' mas declarado com a classe wrapper Integer: " + obj);
		System.out.println("Imprimindo o y: " + y);
		
		// Também é utilizável, normalmente, em expressões aritméticas:
		
		System.out.println("Imprimindo 'obj' * 2: " + obj * 2);
		
		// Tem funcionalidade de tratar tipos primitivos como classes, só que forma transparente sem precisar de casting nem conversão
		
		// Uso comum: campos de entidades em sistemas de informação (IMPORTANTE!)
		// pois tipos referência (classes) aceitam valor null e usufruem dos recursos OO
		
		// Por exemplo, num cadastro a DOB é opcional, ou seja, é possível criar vazia. Um tipo primitivo não aceita vazio, por isso
		// Usaria wrapper class, assim aceitando nulo.
		
		
	}

}
