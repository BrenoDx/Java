//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(){
    LocalDate d1 = LocalDate.now();
     LocalDateTime d2 = LocalDateTime.now();
     Instant d3 = Instant.now();

    LocalDate semanaPassada1 = d1.minusDays(7);
    LocalDate proximaSemana1 = d1.plusDays(7);

    System.out.println(semanaPassada1);
    System.out.println(proximaSemana1);

     LocalDateTime semanaPassada2 = d2.minusDays(7);
     LocalDateTime proximaSemana2 = d2.plusDays(7);

     System.out.println(semanaPassada2);
     System.out.println(proximaSemana2);

     Instant semanaPassada3 = d3.minus(7, ChronoUnit.DAYS);
     Instant proximaSemana3 = d3.plus(7, ChronoUnit.DAYS);

    System.out.println(semanaPassada3);
    System.out.println(proximaSemana3);


    Duration t1 = Duration.between(semanaPassada1.atStartOfDay(), d1.atStartOfDay());
    Duration t2 = Duration.between(semanaPassada2, d2);
    Duration t3 = Duration.between(semanaPassada3, d3);


    System.out.println("t1 dias: " + t1.toDays());
    System.out.println("t2 dais: "+ t2.toDays());
    System.out.println("t3 dias: "+ t3.toDays());
}
