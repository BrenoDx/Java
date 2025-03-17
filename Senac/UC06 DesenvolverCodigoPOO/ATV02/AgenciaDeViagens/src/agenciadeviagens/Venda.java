
package agenciadeviagens;

public class Venda {
    private String nome;
    private String formPagamento;
    private PacoteDeViagem pacoteViagem;
    
    
    public Venda(String nome, String formPagamento, PacoteDeViagem pacoteViagem){
       this.nome = nome;
        this.formPagamento = formPagamento;
        this.pacoteViagem = pacoteViagem;
       
    }

    public float converterReal(float margem, float taxaAdicional, float cotacao){
        float valorEmReal = pacoteViagem.calcularTotal(margem, taxaAdicional) * cotacao;
        return valorEmReal;
    }
    
    
    public void descreverVenda(float margem, float taxaAdicional, float cotacao){
        
        System.out.println("---------------------------------Dados da Venda----------------------------------");
        System.out.println("Valor em Dolar: " + pacoteViagem.calcularTotal(margem, taxaAdicional));
        System.out.println("Valor em Real: " + converterReal(margem, taxaAdicional, cotacao));
        System.out.println("Venda concluída com sucesso.");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormPagamento() {
        return formPagamento;
    }

    public void setFormPagamento(String formPagamento) {
        this.formPagamento = formPagamento;
    }

    public PacoteDeViagem getPacoteViagem() {
        return pacoteViagem;
    }

    public void setPacoteViagem(PacoteDeViagem pacoteViagem) {
        this.pacoteViagem = pacoteViagem;
    }

    
}
