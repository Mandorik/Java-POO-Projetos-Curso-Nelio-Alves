package entities;

// Pacote da classe

public class Triangle { // Nome da classe

	public double a; // Public indica que o atributo ou método pode ser usado em outros arquivos
	public double b;
	public double c;
	
	// Método para calcular a área
	// Dentro dos () os parâmetros que essa função recebe para fazer o que tem que fazer.
	// Como 'a', 'b' e 'c' já estão na classe, não precisam ser parametrizados
	public double area() {
		double p = (a + b + c)/ 2.0;
		return Math.sqrt(p * (p - a) * (p -b) * (p-c));
	}
}

// Double é o tipo de dado que o método retorna (se não retornar nada: usar void)
