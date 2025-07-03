package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty!");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
	
	/*
	 * Type safety
	 * 
	 * É possível trocar os parâmetros para object. 
	 * Será necessário realizar um casting para Integer no first() quando invocado no Program, mas será impresso na tela
	 * Contudo, não há uma segurança de tipo, pois caso seja adicionado uma String à lista na posição 0, ele não mostrará objeção
	 * e dará um erro na hora da execução
	 * 
	 * */
	
	
	/*
	 * Sendo assim, o generics é a melhor solução. Implementaremos um PrintService que será parametrizado com um tipo T
	 * esse Tipo T pode ser qualquer tipo: String, Inteiro, Produto, CLiente, mas ele vai garantir o reuso e também garante o type safety.
	 * Se instanciar com String, só aceita String, se instanciar como int só aceita int etc
	 * */
}
