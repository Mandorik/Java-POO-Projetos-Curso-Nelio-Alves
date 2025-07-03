package application;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import models.entities.Contract;
import models.entities.Installment;
import models.services.ContractService;
import models.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		/* Uma empresa deseja automatizar o processamento de seus contratos. O processamento de um contrato consiste em
		 * gerar as parcelas a serem pagas para aquele contrato, com base no número de meses desejado.
		 * 
		 * A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas. Os serviços de pagamento
		 * online tipicamente cobram um juro mensal, bem como uma taxa por pagamento. Por enquanto o serviço contratado pela empresa
		 * é o do Paypal, que aplica juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
		 * 
		 * Faça um programa para ler os dados de um contrato (número do contrato, data do contrato, e valor total do contrato).
		 * Em seguida, o programa deve ler o número de meses para parcelamento do contrato, e daí gerar os registros de parcelas 
		 * a serem pagas (data e valor), sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela
		 * dois meses após o contrato assim por diante. Mostre os dados das parcelas na tela.
		 * 
		 * Exemplo:
		 * 
		 * Enter contract data:
		 * Number: 8028
		 * Date (dd/MM/yyyy): 25/06/2018
		 * Contract Total Value: 600.00
		 * Enter the amount of installments: 3
		 * Installments:
		 * 25/07/2018 - 206.04
		 * 25/08/2018 - 208.08
		 * 25/09/2018 - 210.12
		 * 
		 * Cálculos (1% juro simples mensal + 2% taxa de pagamento):
		 * Parcela #1
		 * 200 + 1% * 1 = 202
		 * 202 + 2% = 206.04
		 * 
		 * Parcela #2
		 * 200 + 1% * 2 = 204
		 * 204 + 2% = 208.08
		 * 
		 * Parcela #3
		 * 200 + 1% * 3 = 206
		 * 206 + 2% = 210.12
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter contract data:");
		System.out.printf("Number: ");
		int number = sc.nextInt();
		System.out.printf("Date (dd/MM/yyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.printf("Contract Total Value: ");
		double totalValue = sc.nextDouble();
		
		Contract obj = new Contract(number, date, totalValue);

		System.out.print("Enter the amount of installments: ");
		int N = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(obj, N);
		
		System.out.println("Parcelas: ");
		
		for (Installment installment : obj.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();

	}

}
