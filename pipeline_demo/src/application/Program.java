package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray())); // toArray é operação terminal
		
		int sum = list.stream().reduce(0, (x, y) -> x + y); // elemento inicial (neutro), função que recebe 2 argumentos e gera um resultado
		System.out.println("Sum: " + sum);
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0) // predicado, com base nele gera uma nova stream com apenas os elementos que satisfaçam a condição
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
	}

}
