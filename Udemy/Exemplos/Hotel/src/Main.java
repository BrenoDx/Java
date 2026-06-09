import model.entidades.Reservas;
import model.exceptions.DomainException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    try {
        System.out.println("Numero do quarto:");
        int numQuarto = sc.nextInt();

        System.out.println("Check-In (dd/mm/yyyy)");
        Date checkIn = sdf.parse(sc.next());

        System.out.println("Check-out (dd/mm/yyyy)");
        Date checkOut = sdf.parse(sc.next());

        Reservas reserva = new Reservas(numQuarto, checkIn, checkOut);
        System.out.println("Reserva: " + reserva.toString());

        System.out.println("Entre com dados para atualizar a reserva:");
        System.out.println("Check-In (dd/mm/yyyy)");
        checkIn = sdf.parse(sc.next());

        System.out.println("Check-out (dd/mm/yyyy)");
        checkOut = sdf.parse(sc.next());

        reserva.updateDatas(checkIn, checkOut);

        System.out.println("Reserva: " + reserva.toString());
    }catch(ParseException e){
        System.out.println("Formato data inválido");
    }catch(DomainException e){
        System.out.println("Erro na reserva: " + e.getMessage());
    }catch(RuntimeException e){
        System.out.println("Erro fatal: " + e);
    }


    sc.close();

}
