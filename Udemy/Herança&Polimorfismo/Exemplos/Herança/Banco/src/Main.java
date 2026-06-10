import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Conta c1 = new Conta(1000,"Bob", 0.0);
    ContaEmpresa c2 = new ContaEmpresa(1001, "Alex", 0.0, 100);

    // UPCASTING
    Conta c3 = c2;
    Conta c4 =  new ContaEmpresa(1002, "Alex", 0.0, 100);
    Conta c5 = new ContaPoupanca(1003, "Anna", 0.0, 0.01);

    // DOWNCASTING
    ContaEmpresa c6 = (ContaEmpresa)c3;
    c6.emprestimo(100);

    if(c5 instanceof ContaEmpresa){
        ContaEmpresa c7 = (ContaEmpresa)c5;
        c7.emprestimo(200);
        System.out.println("Empréstimo!");
    }

    if(c5 instanceof ContaPoupanca){
        ContaPoupanca c8 = (ContaPoupanca)c5;
        c8.atualizarSaldo();
        System.out.println("Atualizado!");
    }

    // @Override
    Conta c9 = new Conta(1001, "ALEX", 1000);
    c9.saque(200);
    System.out.println(c9.getSaldo());

    Conta c10 = new ContaPoupanca(1001,"Alex", 1000, 0.01);
    c10.saque(200);
    System.out.println(c10.getSaldo());

    Conta c11 = new ContaEmpresa(1001, "alex", 1000, 100);
    c11.saque(200);
    System.out.println(c11.getSaldo());




}
