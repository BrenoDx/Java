
package contabilatv;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author breno
 */
public class Pagamentos {
    private String nomeEmpresa;
    private List<Imposto> imposto;
    
    public Pagamentos(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;  
        this.imposto = new ArrayList<>();
    }
    
    
    public void listaPagamentos(Imposto imposto){
        this.imposto.add(imposto);
    }
    
    public void mostraImposto(){
        for(Imposto imposto : imposto){
        System.out.printf("%s: R$ %.2f%n", imposto.getDescricao(), imposto.calcularImposto());
                   }
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public List<Imposto> getImposto() {
        return imposto;
    }

    public void setImposto(List<Imposto> imposto) {
        this.imposto = imposto;
    }
    
}
