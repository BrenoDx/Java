import model.Conta;
import service.ContaService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args){

    Conta c1 = new Conta("12345","Breno", 300);
    Conta c2 = new Conta("98765", "teste", 250);

    ContaService cs = new ContaService();

    cs.mostrarSaldo(c1);
    cs.mostrarSaldo(c2);

    cs.depositar(c1,500);
    cs.depositar(c2,700);

    cs.sacar(c1,600);
    cs.sacar(c2,550);
}