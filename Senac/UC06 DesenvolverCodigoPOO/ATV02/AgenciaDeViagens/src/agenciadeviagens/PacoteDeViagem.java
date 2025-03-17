
package agenciadeviagens;

public class PacoteDeViagem {
    private String destino;
    private int qntDias;
    private Transporte transporte;
    private Hospedagem hospedagem;
    
   public PacoteDeViagem(String destino, int qntDias, Transporte transporte, Hospedagem hospedagem){
       this.destino = destino;
       this.qntDias = qntDias;
       this.transporte = transporte;
       this.hospedagem = hospedagem;
   }

   public void descreverPacote(){
            System.out.println();
            System.out.println("---------------------------------Pacote de viagem---------------------------------");
            System.out.println("Destino: " + this.destino);
            System.out.println("Transporte: " + transporte.getTransporte());
            System.out.println("Hospedagem: " + hospedagem.getHotel());
            System.out.println("Dias de hospedagem: " + this.qntDias);
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println();
  
   }
   
   public float calcularDiaria(){
       return this.qntDias * hospedagem.getDiaria();
   }
   
   public float calcularMargem(float margem){
       float valorSemMargem = calcularDiaria() + transporte.getValor();
       return valorSemMargem + (valorSemMargem * margem / 100);
   }
 
   
   public float calcularTotal(float margem, float taxaAdicional){
       float valorTotal = calcularMargem(margem) + taxaAdicional;
       return valorTotal;
   }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getQntDias() {
        return qntDias;
    }

    public void setQntDias(int qntDias) {
        this.qntDias = qntDias;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }
  

}
