package matrizes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Checklist
		
		/*
		 * Revisão do conceito de matriz
		 * Declaração e instanciação
		 * Acesso aos elementos / como percorrer uma matriz
		 * Propriedade length
		 * 
		 * Em programação, "Matriz" é o nome dado a arranjos bidimensionais
		 * Atenção: "vetor de vetores"
		 * 
		 * Arranjo (array) é uma estrutura de dados:
		 * - Homogênea (dados de um mesmo tipo)
		 * - Ordenada (elementos acessados por meio de posições)
		 * - Alocada de uma vez só, em um bloco contíguo de memória
		 * 
		 * Vantagens:
		 * - Acesso imediato aos elementos pela sua posição
		 * 
		 * Desvantagens:
		 * - Tamanho fixo
		 * - Dificuldade para se realizar inserções e deleções
		 * */
		
		// Exercício
		
		/*
		 * Faça um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros. Em seguida,
		 * mostre a diagonal principal e a quantidade de valores negativos da matriz
		 * 
		 * ordem N = N linhas e N colunas
		 * 
		 * Exemplo:
		 * 
		 * ENTRADA:
		 * 3
		 *  5 -3 10
		 * 15  8  2
		 *  7  9 -4
		 * 
		 * SAÍDA:
		 * Main diagonal:
		 *  5  8 -4
		 * Negative numbers = 2
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a ordem da matriz: ");
		int N = sc.nextInt();
		sc.nextLine();
				
		// Os dois [] falam que é um arranjo bidimensional
		int[][] mat = new int[N][N]; // Matriz instanciada na memória
		
		
		// São dois for, um para cada dimensão. No caso, o i cuida das linhas e o j das colunas
		// Percorre as três colunas da 1a linha, aí passa pra 2a etc
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		/*
		 * [i0j0] [i0j1] [i0j2]
		 * [i1j0] [i1j1] [i1j2]
		 * [i2j0] [i2j1] [i2j2]
		 * */
		
		System.out.println("Main diagonal:");
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(i == j) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		
		System.out.println();
		
		int count = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Números negativos: " + count);
		
		// Ele também tem a propriedade length, portanto nos for o i<N poderia ser i<mat.length
		
		// Como ela é um vetor dos vetores, as linhas nada mais são do que vários vetores
		
		// Portanto a quantidade de colunas pode ser representada por mat[i].length
		
		sc.close();

	}

}
