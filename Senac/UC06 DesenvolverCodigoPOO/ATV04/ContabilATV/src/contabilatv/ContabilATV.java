
package contabilatv;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class ContabilATV {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in, "latin1");
      String opMenu = "";
            
      System.out.println("Digite nome da empresa:");
      String empresa = entrada.nextLine();
      Pagamentos pagamentos = new Pagamentos(empresa);   
        
      while(!opMenu.equalsIgnoreCase("pare")){
          System.out.println("--------------------------------");
          System.out.println("DIGITE UMAS DAS OPÇÕES ABAIXO");
          System.out.println("PIS; IPI; OU PARE para encerrar:");
          opMenu = entrada.nextLine();
          
          if(opMenu.equalsIgnoreCase("Pis")){                 
          System.out.println("Informe debitos da empresa");
          float debito = entrada.nextFloat();
          entrada.nextLine();
          
          System.out.println("Informe valor de credito da empresa");
          float credito = entrada.nextFloat();
          entrada.nextLine();
          
          pagamentos.listaPagamentos(new Pis(debito, credito));
          
          }else if(opMenu.equalsIgnoreCase("Ipi")){         
          System.out.println("Informe valor do produto:");
          float valorProduto = entrada.nextFloat();
          entrada.nextLine();
          
          System.out.println("Informe o valor do frente:");
          float frete = entrada.nextFloat();
          entrada.nextLine();
          
          System.out.println("Valor do seguro");
          float seguro = entrada.nextFloat();
          entrada.nextLine();
          
          System.out.println("Outras despesas");
          float despesas = entrada.nextFloat();
          entrada.nextLine();
          
          System.out.println("valor da Alíquota");
          float aliquota = entrada.nextFloat();
          entrada.nextLine();
          
          pagamentos.listaPagamentos(new Ipi(valorProduto, frete, seguro, despesas, aliquota));
          }   
      }
        
         System.out.println("--------------------------------"); 
         System.out.println("Impostos a serem pagos:");
         pagamentos.mostraImposto();
         entrada.close();
    }
    
}
