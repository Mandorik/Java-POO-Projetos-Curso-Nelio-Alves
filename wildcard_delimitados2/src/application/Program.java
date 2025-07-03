package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		/*
		 * Problema 2 (princípio get/put)
		 * 
		 * Façamos um método que copia os elementos de uma lista para outra lista que pode ser mais genérica que a primeira
		 * 
		 * List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		 * List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		 * List<Object> myOBjs = new ArrayList<Object>();
		 * 
		 * copy(myInts, myObjs);
		 * 
		 * copy(,yDoubles, myObjs);
		 * */
		
		
		 List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		 List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		 List<Object> myObjs = new ArrayList<Object>();
		 
		 copy(myInts, myObjs);
		 printList(myObjs);
		 copy(myDoubles, myObjs);
		 printList(myObjs);
		
		/*
		 * Princípio get/put - covariância
		 * 
		 * List<Integer> intList = new ArrayList<Integer>();
		 * intList.add(10);
		 * intList.add(5);
		 * 
		 * List<? extends Number> list = intList;
		 * 
		 * Number x = list.get(0);
		 * 
		 * list.add(20); // erro de compilação
		 * 
		 * 
		 * Covariância é quando get - OK mas put - ERROR
		 * */

		/*
		 * Princípio get/put - contravariância
		 * List<Objects> myObjs = new ArrayList<Object>();
		 * myObjs.add("Maria");
		 * myObjs.add("Alex");
		 * 
		 * List<? super Number> myNums = myObjs; // super Number pode ser Number ou Object
		 * 
		 * myNums.add(10);
		 * myNums.add(3.14);
		 * 
		 * Number x = myNums.get(0); // erro de compilação [já que um item da lista pode ser um Object]
		 * 
		 * Contravariância é quando get - ERROR mas put - OK
		 * */
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destination) {
		for (Number number : source) { // Source é covariância
			destination.add(number); // Destination é contravariância
		}
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

}
