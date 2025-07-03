package services;

import java.util.List;

public class CalculationService {

	// Como temos um produto e não um inteiro, precisamos adaptar a lista para receber qualquer tipo
	public static <T extends Comparable<T>> T max(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("The list cannot be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
		
		//compareTo é o comparable. Ser maior que zero significa que ele é maior que o item a qual foi comparado
	}
}
