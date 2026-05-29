package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataFabricacao;

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public ProdutoUsado(String nome, double vlr, Date dataFabricacao){
        super(nome,vlr);
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String etiquetaPreco() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNome() + " (Usado) $" + getVlr());
        sb.append(" (Data de Fabricação: " + sdf.format(getDataFabricacao()) + ")");

        return sb.toString();
    }
}
