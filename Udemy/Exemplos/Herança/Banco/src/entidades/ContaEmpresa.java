package entidades;
/*
Suponha que, para realizar um empréstimo, é
descontada uma taxa no valor de RS10,00
 */
public class ContaEmpresa extends Conta{
    private double limite;

    public ContaEmpresa(int numero, String titular, double saldo, double limite){
        super(numero,titular,saldo);
        this.limite = limite;
    }

    public void emprestimo(double valor){
        if(valor <= limite){
            saldo += valor - 10.0;
        }
    }
}
