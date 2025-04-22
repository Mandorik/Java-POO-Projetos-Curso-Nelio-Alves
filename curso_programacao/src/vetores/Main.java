package vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// VETORES
		
		/*
		 * Em progrmaçaão, "vetor" é o nome dado a arranjos unidimentions
		 * 
		 * Arranjo (array) é uma estrutura de dados:
		 * Homogênea (dados do mesmo tipo)
		 * Ordenada (elementos acessados por meio de posições)
		 * Alocada de uma vez só, em um bloco contíguo de memória
		 * 
		 * Vantagens:
		 * Acesso imediato aos elementos pela sua posição
		 * 
		 * Desvantagens:
		 * Tamanho fíxo
		 * Dificuldade para se realizar inserções e deleções
		 * 
		 * Exemplo:
		 * 
		 * myVect = 
		 * 
		 * posição 0 é 1.72
		 * posição 1 é 1.56
		 * posição 2 é 1.80
		 * */
		
		
		//Problema exemplo 1:
		
		/*
		 * Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor.
		 * Em seguida, mostrar a altura média dessas pessoas
		 * 
		 * EXEMPLO:
		 * 
		 * Entrada:
		 * 3
		 * 1.72
		 * 1.56
		 * 1.80
		 * 
		 * Saída:
		 * AVERAGE HEIGHT = 1.69
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alturas que serão digitadas: ");
		int N = sc.nextInt();
		double totalHeight = 0;
		
		// [] após o tipo de variável vai declarar que é um vector, e será instanciado com o tamanho dele, no caso N
		double[] vect = new double[N];
		
		for ( int i = 0; i < N; i++ ) {
			vect[i] = sc.nextDouble();
			totalHeight += vect[i];
		}
		
		double avgHeight = totalHeight/ N;
		
		System.out.printf("Altura média é de: %.2f", avgHeight);
		
		sc.close();
		

	}

}
