package entidades;

public class ProdutoImportado extends Produto{
    private double taxa;

    public ProdutoImportado(String nome, double vlr, double taxa){
        super(nome,vlr);
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public Double total(){
        return getVlr()+getTaxa();
    }
    @Override
    public String etiquetaPreco() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNome() + " $" + total());
        sb.append(" (Taxa de alfândega: $" + getTaxa()+ ")");

        return sb.toString();
    }
}
