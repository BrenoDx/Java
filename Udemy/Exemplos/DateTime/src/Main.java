//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  // Criando um objeto de Formatação
  DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
  DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

  // Buscando informação Data e Hora
  LocalDate d01 = LocalDate.now();
  LocalDateTime d02 = LocalDateTime.now();
  Instant d03 = Instant.now();

  // Convertendo String para Data e Hora
  LocalDate d04 = LocalDate.parse("2026-05-12");
  LocalDateTime d05 = LocalDateTime.parse("2026-05-12T19:30:01");
  Instant d06 = Instant.parse("2026-05-12T19:30:01Z");
  Instant d07 = Instant.parse("2026-05-12T19:30:01-03:00");

  LocalDate d08 = LocalDate.parse("12/05/2026", dtf1);
  LocalDateTime d09 = LocalDateTime.parse("12/05/2026 19:45", dtf2);

  LocalDate d10 = LocalDate.of(2026,01,20);
  LocalDateTime d11 = LocalDateTime.of(2026, 01, 20, 19, 50);

  System.out.println("D01 "+ d01);
  System.out.println("D02 "+ d02);
  System.out.println("D03 "+ d03);

  System.out.println("D04 "+ d04);
  System.out.println("D05 "+ d05);
  System.out.println("D06 "+ d06);
  System.out.println("D07 "+ d07);

  System.out.println("D08 "+ d08);
  System.out.println("D09 "+ d09);

  System.out.println("D10 "+ d10);
  System.out.println("D11 "+ d11);
}
