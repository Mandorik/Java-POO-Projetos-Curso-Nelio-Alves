package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		/*
		 * Faça um programa para ler o caminho de um arquivo .csv contendo os dados de itens vendidos. Cada item
		 * possui um nome, preço unitário e quantidade, separados por vírgula. Você deve gerar um novo arquivo chamado
		 * "summary.csv", localizado em uma subpasta chamada "out" a partir da pasta origianl do arquivo de origem, contendo
		 * apenas o nome o valor para aquele item (preço unitário multiplicado pela quantidade), conforme exemplo
		 * 
		 * Source File
		 * TV LED,1290.99,1
		 * Video Game Chair,350.50,3
		 * Iphone X,900.0,2
		 * Samsung Galaxy 9,850.00,2
		 * 
		 * Output file (out/summary.csv)
		 * TV LED,1290.99
		 * Video Game Chair,1051.50
		 * Iphone X,1800.0
		 * Samsung Galaxy 9,1700.00
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter the file's path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		// Lembrando que essa operação retorna um boolean, se conseguiu criar ou não o folder
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			String itemCsv = br.readLine();
			while (itemCsv != null) {
				String[] fields = itemCsv.split(","); // Quebramos pelo ,
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, quantity)); // Adicionamos os itens à lista
				
				itemCsv = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				
				for(Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
				System.out.println(targetFileStr + "CREATED");
				
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
