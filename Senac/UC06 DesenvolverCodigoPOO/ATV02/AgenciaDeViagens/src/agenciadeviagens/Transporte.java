
package agenciadeviagens;

public class Transporte {
    private String tipoTransporte;
    private float valor;
    
    public Transporte(String tipoTransporte, float valor) {
        this.tipoTransporte = tipoTransporte;
        this.valor = valor;
    }
    
    public String getTransporte(){
        return tipoTransporte;
    }
    
    public void setTranspote(String tipoTransporte){
        this.tipoTransporte = tipoTransporte;
    }
    
    public float getValor(){
        return valor;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    
}
