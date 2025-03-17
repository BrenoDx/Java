
package contabilatv;

/**
 *
 * @author breno
 */
public class Ipi implements Imposto{
   private float valorProduto, frete, seguro, outrasDespesas, aliquota;
   
   public Ipi(float valorProduto, float frete, float seguro,float outraDespesas, float aliquota){
       this.valorProduto = valorProduto;
       this.frete = frete;
       this.seguro = seguro;
       this.outrasDespesas = outrasDespesas;
       this.aliquota = aliquota;
               }
   
   @Override
   public float calcularImposto(){
       float baseCalculo = valorProduto+frete+seguro+outrasDespesas;
       return baseCalculo*(aliquota/100);
   }
   
   @Override
   public String getDescricao(){
       return "IPI";
   }

   
}
