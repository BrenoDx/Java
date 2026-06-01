package entidades;

public class PessoaFisica extends ImpostoRenda{
    private double gSaude;

    public PessoaFisica(String nome, double rendaAnual, double gSaude) {
        super(nome,rendaAnual);
        this.gSaude = gSaude;

    }

    public double getgSaude() {
        return gSaude;
    }

    @Override
    public double calcularImposto() {
        double imposto = 0;

        if(getRendaAnual() >= 20000){
            imposto = getRendaAnual()*0.25;
        }else{
            imposto = getRendaAnual()*0.15;
        }

        if(getgSaude() >0){
            return imposto - getgSaude()*0.5;
        }
        return imposto;
    }

}
