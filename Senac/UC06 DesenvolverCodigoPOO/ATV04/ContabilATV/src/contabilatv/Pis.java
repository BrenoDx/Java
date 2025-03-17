
package contabilatv;

/**
 *
 * @author breno
 */
public class Pis implements Imposto{
    private float valorDebito, valorCredito;
    
    public Pis(float valorDebito, float valorCredito){
        this.valorDebito = valorDebito;
        this.valorCredito = valorCredito;                 
    }
    
    @Override
    public float calcularImposto(){
        return (valorDebito-valorCredito)*0.0165f; //1,65% em decimal
    }
    
    @Override
    public String getDescricao(){
        return "PIS";
    }

    public float getValorDebito() {
        return valorDebito;
    }

    public void setValorDebito(float valorDebito) {
        this.valorDebito = valorDebito;
    }

    public float getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(float valorCredito) {
        this.valorCredito = valorCredito;
    }

    
    
}
