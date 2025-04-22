package demo_operador_ternario;

public class Main {

	public static void main(String[] args) {

		double preco1 = 34.5;
		double desconto1;
		
		if (preco1 < 20.0) {
			desconto1 = preco1 * 0.1;
		}
		else {
			desconto1 = preco1 * 0.5;
		}
		
		//É possível simplificar esse código por uma expressão condicional ternária:
		
		double preco2 = 34.5;
		double desconto2 = (preco2 < 20.0) ? preco2 * 0.1 : preco2 * 0.05; 
	}

}
