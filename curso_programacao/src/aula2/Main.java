package aula2;

public class Main {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
		//Agora o w será do tipo double e não int
		
		int z = 5;
		double w = 2 * z;
		
		System.out.println(z);
		System.out.println(w); //agora aparece a casa decimal com 0
		System.out.println();
		
		/*
		 * Suponhamos que temos um trapézio com base menor = 6, base maior = 8 e altura de 5:
		 * Sabendo que a área de um trapézio é a soma das bases, divididas por dois e multiplicadas pela altura, qual sua área?*/
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = ((b+B)/2)*h;
		
		System.out.printf("A área do trapézio é de %.1fm\n\n", area);
		
		
		//EXEMPLO 4:
		
		int c, d;
		double resultado, resultado2;
		c = 5;
		d = 2;
		
		resultado = c / d;
		
		System.out.println(resultado); //2;0
		//Isso ocorre pois 'c' e 'd' são inteiros, isto é, não têm casas decimais
		
		//Para que não trunque as casas decimais, coloque (double) antes da expressão:
		System.out.println();
		resultado2 = (double) c / d;
		//Isso se chama "casting" conversão explícita dos valores
		System.out.println(resultado2);
		
		
		//Exemplo 5
		
		double j;
		int k;
		
		j = 5.0;
		k = (int) j; //Eclipse acusa que não pode converter de double pra int
		//Ao fazer o casting pra int você avisa que não se importa com possível perda de informação (no caso casas decimais)
		System.out.println();
		System.out.println(k);

	}

}
