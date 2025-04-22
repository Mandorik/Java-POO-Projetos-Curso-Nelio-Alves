package date_time_java;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		// Operações Importantes com data-hora:
		
		// INSTANCIAÇÃO
		/*(agora) - Data-hora
		 * Texto ISO 8601 -> Data-hora
		 * dia, mês, ano, [horário] -> Data-hora local
		 * */
		
		// FORMATAÇÃO
		/* Data-hora -> Texto ISO 8601
		 * Data-hora -> Texto formato customizado
		 * */
		
		// PRINCIPAI TIPOS JAVA (VERSÃO 8+)
		
		// Data-hora local
		// LocalDate
		// LocalDateTime
		
		// Data-hora global
		// Instant
		
		// Duração
		// Duration
		
		// Outros
		// ZoneId
		// ChronoUnit
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // O instanciamos passando os formatos baseados na documentação
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		// Instanciação (agora)
		LocalDate d01 = LocalDate.now(); // Pegou a data do sistema e instanciou um objeto do tipo LocalDate
		LocalDateTime d02 = LocalDateTime.now(); // Pega data e hora do sistema.
		Instant d03 = Instant.now(); // Aqui tem o Z, que indica data e hora GMT (traz a hora de Londres)
		
		System.out.println("d01: " + d01);
		System.out.println("d02: " + d02); 
		System.out.println("d03: " + d03);
		
		// Texto ISO 8601 e gerar uma data-hora
		
		LocalDate d04 = LocalDate.parse("2025-01-31"); // Nos () colocamos o texto representando uma data no formato ISO 8601 (YYYY-MM-DD)
		LocalDateTime d05 = LocalDateTime.parse("2025-01-31T19:18:22");
		Instant d06 = Instant.parse("2025-01-31T19:18:22Z"); // Ele cria com o horário especificado como Z e não horário da máquina mostrando o Z
		Instant d07 = Instant.parse("2025-01-31T19:18:22-03:00"); // Agora mostra o horário Z quando é o horário passado no GMT
		
		System.out.println("d04: " + d04);
		System.out.println("d05: " + d05);
		System.out.println("d06: " + d06);
		System.out.println("d07: " + d07);
		
		// Texto formato customizado para virar data hora
		
		// LocalDate d08 = LocalDate.parse("31/01/2025");
		// Assim acusará um erro, pois não especificamos em lugar algum que 31 é dia, nem que 01 é mês etc
		
		// Precisamos empunhar o DateTimeFormatter para corrigir, transformando String para dataHora
		// DateTimeFormatter foi instanciado lá em cima
		
		LocalDate d08 = LocalDate.parse("31/01/2025", fmt1); // Parse tem sobrecarga que aceita um segundo argumento que é como interpretar o texto
		LocalDateTime d09 = LocalDateTime.parse("31/01/2025 19:18", fmt2); // Para cada formato diferente, necessário criar outro formatter
		// Também é possível jogar diretamente a formatação:
		LocalDateTime d10 = LocalDateTime.parse("01/31/2025 19:18", DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"));
		
		System.out.println("d08: " + d08);
		System.out.println("d09: " + d09);
		System.out.println("d10: " + d10);

		// dia, mês, ano, [horário]

		LocalDate d11 = LocalDate.of(2025, 1, 31);
		LocalDateTime d12 = LocalDateTime.of(2025, 1, 31, 19, 18);
		
		System.out.println("d11: " + d11);
		System.out.println("d12: " + d12);
		
		// AGORA SOBRE FORMATAÇÃO
		
		// Já teríamos o obj data e hora na mão e queremos transformar em texto, podendo ser ISO 8601 ou customizado
		
		// Utilizando as variáveis d04, d05 e d06:
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("d04 = " + d04); // Podemos utilizar o formatter pra dizer como transformar para String
		System.out.println("d04 formatado = " + d04.format(fmt3));
		
		// Lembrando que é possível imprimir diretamente do DateTimeFormatter
		System.out.println("d04 formatado = " + fmt3.format(d04));
		
		// Novamente, também possível deste modo, instanciando na hora de rodar
		System.out.println("d04 formatado = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		// Agora com LocalDateTime
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("d05 = " + d05.format(fmt3));
		System.out.println("d05 = " + d05.format(fmt4));
		
		// Instant não tem método .format já que não está numa data local, já que dia e horário varia
		// Para imprimir de modo customizado uma global (Instant) é necessário qual o fuso horário que será considerado
		
		
		// Vai especificar o padrão, aí utiliza o método para demonstrar de qual zona, e é possível que busque o padrão do seu sistema
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		// Só que o format é a partir do DateTimeFormatter
		System.out.println("d06 = " + fmt5.format(d06)); 
		
		
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
		
		System.out.println("d05 utilizando ISO_DATE_TIME = " + d05.format(fmt6));
		
		DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d05 utilizando ISO_INSTANT = " + fmt7.format(d06));
		
		System.out.println();
		
		// Operações importantes com da-tahora
		
		// Converter data-hora global para local
		// Data-hora global, timezone (sistema local) -> Data-hora local
		
		// É preciso informar o timezone
		
		// Na classe ZoneId temos esse cara que retorna uma coleção com os nomes dos fuso horários customizados
		// for (String s : ZoneId.getAvailableZoneIds()) {
		// 	System.out.println(s);
		// }
		
		// Converte instante pra data local considerando fuso horário do computador
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
				
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		// Obter dados de uma data-hora local
		// Data-hora local -> dia, mês, ano, horário
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minuto = " + d05.getMinute());
		
		// Cálculos com data-hora
		// Data-hora +/- tempo -> Data-hora

		
		
		// Outras datas com essa diferença foram instanciadas
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		LocalDate nextYearLocalDate = d04.plusYears(1);


		System.out.println("pastWeekLocalDate= " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate= " + nextWeekLocalDate);
		System.out.println("nextYearLocalDate= " + nextYearLocalDate);

		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		// LocalDateTime também terá minus e plus Seconds, Minutes etc

		System.out.println("pastWeekLocalDateTime= " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime= " + nextWeekLocalDateTime);
		
		
		// Com o Instant é diferente, não tem minusDays, só um em que se passa a quantia e a métrica
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

		System.out.println("pastWeekInstant= " + pastWeekInstant);
		System.out.println("nextWeekInstant= " + nextWeekInstant);

		// Data-hora 1, Data-hora 2 -> Duração
		
		// Duration é uma classe do Java:
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		
		// é possível adicionar .to que ele trás a quantidade em dias, minutos, horas etc
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t1 dias (sem o .toDays()) = " + t1);
		
		// Duration t2 = Duration.between(pastWeekLocalDate, d04);
		
		// LocalDate não tem informação de tempo, não tem como calcular tempo de duração entre dois LocalDates, tem que convertê-los em LocalDateTime
		
		// Pra corrigir isso, adicionamos um .atTime(0, 0) seria  horas e minutos
		
		// Duration t2 = Duration.between(pastWeekLocalDate.atTime(0,0), d04.atTime(0, 0));
		
		// Existe um método melhor do que ficar colocando 0, 0
		
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		
		System.out.println("t2 = " + t2.toDays());
		
		// Instant
		
		Duration t3 = Duration.between(pastWeekInstant, d06);
		
		System.out.println("t3 = " + t3.toDays());
		
		// Mas, usamos datas no passado primeiro, e se colocarmos datas no futuro por primeiro?
		
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("t4 = " + t4.toDays());
		
		// Fica negativo pois a 1a data é posterior à segunda
		
	}

}
