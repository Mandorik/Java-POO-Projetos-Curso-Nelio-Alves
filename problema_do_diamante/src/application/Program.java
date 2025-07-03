package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * A herança múltipla pode gerar o problema do diamante: uma ambiguidade causada
		 * pela existência do mesmo método em mais de uma superclasse
		 * 
		 * Herança múltipla não é permitida na maioria das linguagens
		 */

		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		/*
		 * Não é possível extends para mais de uma classe, portanto a herança múltipla
		 * não é possível. Para contornar isso criamos 2 interfaces e então a classe
		 * ComboDevice implements as duas.
		 * 
		 * ATENÇÃO
		 * 
		 * Isso NÃO é herança múltipla, pois NÃO HÁ REUSO na relação entre ComboDevice e
		 * as interfaces Scanner e Printer
		 * 
		 * ComboDevice não herda, mas sim implementa as interfaces (cumpre o contrato)
		 */
		
		System.out.println();
		ComboDevice c = new ComboDevice("2018");
		c.processDoc("My Dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
		
	}

}
