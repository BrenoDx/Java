import models.entidades.Contrato;
import models.services.ContratoService;
import models.services.PayPalService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    ContratoService contrService = new ContratoService(new PayPalService());
    Contrato contr;

    try{
        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int numContr = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        sc.nextLine();

        Date data = sdf.parse(sc.nextLine());

        System.out.print("Valor do contrato: ");
        double vlr = sc.nextDouble();

        System.out.print("Entre com o número de parcelas: ");
        int parcelas = sc.nextInt();

        contr = new Contrato(numContr,data,vlr);
        

    }catch(ParseException e){
        System.out.print("Erro formato DATA inválida");
    }

}
