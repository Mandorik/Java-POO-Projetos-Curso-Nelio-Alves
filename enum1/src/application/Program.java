package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// Enumerações e composição:
		
		// Enumerações = servem pra representar vários tipos que possuem um conjunto de constantes relacionadas, por exemplo
		// Um ciclo de vida de pedido tem: aguardando pagamento, processando, enviado, entregue. Esses estados podem ser represetandos
		// por uma enumeração, ou, tipo enumerado.
		
		
		// Além disso, aprenderemos a composição de objetos, vamos aprender como podemos compor objetos para compor um modelo mais complexo
		// Neste capítulo em especial, trabalharemos com a composição de entidades de negócio para compor um modelo de domínio
		
		// ENUMERAÇÕES:
		
		// É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas
		
		// Palavra chave em Java: enum
		
		// Vantagem: melhor semântica, código mais legível e auxiliado pelo compilador
		
		// EXEMPLO:
		
		// Ciclo de vida de um pedido:
		
		// PendingPayment (billing) -> Processing (dispatch) -> Shipped (deliver) -> Delivered
		
		// Para representar esses estados de forma semanticamente boa e que fique fácil de trabalharmos, a gente pode usar o tipo enumerado
		// ou enumeração:
		
		/*
		 * package entities.enums;
		 * 
		 * public enum OrderStatus {
		 * 		PENDING_PAYMENT,
		 * 		PROCESSING,
		 * 		SHIPPED,
		 * 		DELIVERED;
		 * }
		 * */
		
		// Dentro das chaves, definimos os valores possíveis para o status de pedido.
		
		// De posse desse tipo enumerado aqui, você pode então criar uma classe pedido e dentro dessa classe por exemplo, pode declarar um
		// atributo status do tipo OrderStatus (a enumeração que foi definida antes)
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		// No caso ele vai, por padrão, transformar o enum para String do mesmo nome que tá no enum
		
		// Por isso, precisamos converter de String para enum corretamente. Uma aplicação que vai usar o enum, eventualmente 
		// Vai pedir para o usuário entrar com algum valor pra esse enum. E o usuário vai, fatalmente, entrar isso como String.
		// Pra pegar essa String entrada pelo usuário e converto para instância do meu tipo enumerado? Basta usar o método valueOf
		// Só passar o nome do valor igual ao definido no tipo enum que esse tipo será instanciado normalmente 
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
		// COMPOSIÇÃO
		
		// É um tipo de associação que permite que um objeto contenha outro
		
		// Relação "tem-um" ou "tem-vários"
		
		/*
		 * Vantagens:
		 * - Organização: divisão de responsabilidades
		 * - Coesão (cada objeto é responsável por uma única coisa, responsabilidade simples e bem definida)
		 * - Flexibilidade
		 * - Reuso
		 * */
		
		// Nota: embora o símbolo UML para composição (todo0parte) seja o diamante preto, neste contexto estamos chamando a composição
		// qualquer associação tipo "tem-um" e "tem-vários"
		
		
	}

}
