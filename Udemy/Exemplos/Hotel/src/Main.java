import model.entidades.Reservas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws ParseException {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("Numero do quarto:");
    int numQuarto = sc.nextInt();

    System.out.println("Check-In (dd/mm/yyyy)");
    Date checkIn = sdf.parse(sc.next());

    System.out.println("Check-out (dd/mm/yyyy)");
    Date checkOut = sdf.parse(sc.next());

    // Not check-out after = check-out não for depois de check-in
    if(!checkOut.after(checkIn)){
        System.out.println("Erro: data  check-out é antes da data check-in");
    }else{
        Reservas reserva = new Reservas(numQuarto,checkIn,checkOut);
        System.out.println("Reserva: " + reserva.toString());

        System.out.println("Entre com dados para atualizar a reserva:");
        System.out.println("Check-In (dd/mm/yyyy)");
        checkIn = sdf.parse(sc.next());

        System.out.println("Check-out (dd/mm/yyyy)");
        checkOut = sdf.parse(sc.next());

        Date agora = new Date();
        if(checkIn.before(agora) || checkOut.before(agora)){
            System.out.println("A reserva não pode ser datas passadas");
        }else if(!checkOut.after(checkIn)){
            System.out.println("Erro: data  check-out é antes da data check-in");
        }else{
            reserva.updateDatas(checkIn,checkOut);
            System.out.println("Reserva: " + reserva.toString());
        }
    }
    sc.close();

}
