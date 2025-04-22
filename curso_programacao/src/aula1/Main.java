package aula1;

public class Main {

	//Define o entry point da nossa aplicação, onde a execução do programa vai começar
	public static void main(String[] args) {

		System.out.println("Olá, mundo!"); //O que estiver entre () vai aparecer na tela
		System.out.println("Bom dia!");
		
		int y = 32;
		System.out.println(y);
		
		double x = 10.35784;
		System.out.println("Para mostrar a variável por inteiro: " + x); //f é abreviação de Formatado
		System.out.printf("Para mostrar apenas duas casas decimais: " + "%.2f%n", x); //%n é quebra de linha - também \n
		System.out.printf("Para mostrar quatro casas decimais: " + "%.4f\n", x); //%.nf é a n casas decimais mostradas
		
		
		System.out.printf("Resultado: " + "%.2f" + "m\n", x);
		System.out.printf("Resultado: %.2fm\n" , x); //funciona dos dois jeitos
		
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
		//%f = ponto flutuante (floats)
		//%d = inteiros (int)
		//%s = texto (String)
		
		
		//EXERCÍCIO DE FIXAÇÃO:
		//Em um novo programa, inicie as seguintes variáveis:
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		//Em seguida, usando os valores das variáveis, produza a seguinte saída na tela do console:
		
		System.out.println("Products:");
		System.out.printf("%s, whose price is $ %.2f\n", product1, price1);
		System.out.printf("%s, whose price is $ %.2f\n", product2, price2);
		System.out.println();
		System.out.printf("%s years old, code %d and gender: %s", age, code, gender);
		System.out.println();
		System.out.printf("Measure with eight decimal places: %.8f\n", measure);
		System.out.printf("Rounded (three decimal places): %.3f\n", measure);
		System.out.printf("US decimal point: %.3f" , measure);
	}

}
