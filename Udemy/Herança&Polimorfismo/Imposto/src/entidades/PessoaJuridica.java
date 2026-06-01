package entidades;

public class PessoaJuridica extends ImpostoRenda{
    private int qtdFunc;

    public PessoaJuridica(String nome, double rendaAnual, int qtdFunc){
        super(nome,rendaAnual);
        this.qtdFunc = qtdFunc;
    }

    public int getQtdFunc() {
        return qtdFunc;
    }

    @Override
    public double calcularImposto() {
        if(getQtdFunc() > 10){
            return getRendaAnual()*0.14;
        }
        return getRendaAnual()*0.16;
    }

}
