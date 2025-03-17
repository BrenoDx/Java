
package agenciadeviagens;

import java.util.Scanner;

public class AgenciaDeViagens {
    
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in, "latin1");
        String continuar = "", formPagamento = "";
        int numero= 4, opcao;
        float margem = 0f, taxaAdicional = 0f, cotacao = 0f;
        
        Transporte[] transporte = new Transporte[numero]; 
        Hospedagem[] hospedagem = new Hospedagem[numero];
        PacoteDeViagem[] pacote = new PacoteDeViagem[numero];
        Venda[] venda = new Venda[numero];
  
        do{
            System.out.println("-------------------------Bem vindo ao Sistema de Viagens--------------------------");
            System.out.println("1 - Cadastrar Pacotes; 2 - Exibir Pacotes; 3 - Calcular; 4 - Efetuar Venda; 5 - Sair");
            System.out.println("Escolha número do serviço:");
            opcao = entrada.nextInt();
            entrada.nextLine();
            
        switch (opcao){
            case 1: 
              for(int i = 0; i < transporte.length; i++){
                if(!continuar.equalsIgnoreCase("Nao")){
                System.out.println("Qual seria o meio de transporte?");
                String meioTranspor = entrada.nextLine();
                
                System.out.println("Qual o valor do transporte?");
                float valor = entrada.nextFloat();
                entrada.nextLine();
                
                System.out.println("Qual seria o Hotel?");
                String descricao = entrada.nextLine();
                
                System.out.println("Valor da diária?");
                float diaria = entrada.nextFloat();
                entrada.nextLine();   
                
                System.out.println("Qual seria o Destino?");
                String destino = entrada.nextLine();
                System.out.println("Quantidade de dias para hospedagem?");
                int qntDias = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Qual seria a cotação do Dolar?");
                cotacao = entrada.nextFloat();
               entrada.nextLine();
                
                System.out.println("Nome do cliente: ");
                String nome = entrada.nextLine();
                
                while(!formPagamento.equalsIgnoreCase("d") && !formPagamento.equalsIgnoreCase("c")){
                System.out.println("================Forma de Pagamento================");
                System.out.println("D - dinheiro; C - Cartao");
                formPagamento = entrada.nextLine();
                }
                   
                hospedagem[i] = new Hospedagem(descricao,diaria);
                transporte[i] = new Transporte(meioTranspor,valor);
                pacote[i] = new PacoteDeViagem(destino, qntDias, transporte[i], hospedagem[i]);
                venda[i] = new Venda(nome, formPagamento, pacote[i]);
                
                System.out.println("Deseja continuar: ");
                continuar = entrada.nextLine();
                    System.out.println();
            }else{
                break;
            }
        }break;
    
            case 2:
              for(int i = 0; i < transporte.length; i++){                
                if(pacote[i] != null) {
                pacote[i].descreverPacote(); }
                }break; 
                
            case 3:
                System.out.println();
                System.out.println("Digite margem de lucro: ");
                margem = entrada.nextFloat();
                entrada.nextLine();
                
                System.out.println("Gostaria de adicionar alguma taxa adicional ?");
                String taxa = entrada.nextLine();
                
                if(taxa.equalsIgnoreCase("sim")){
                System.out.println("Qual valor?");
                taxaAdicional += entrada.nextFloat();    
        }
              for(int i = 0; i < transporte.length; i++) {
                if(pacote[i] != null){
                System.out.println("Valor da Diaria: U$" + pacote[i].calcularDiaria());
                System.out.println("Valor da Margem: U$" + pacote[i].calcularMargem(margem));
                System.out.println("Valor Total do Pacote: U$" + pacote[i].calcularTotal(margem, taxaAdicional));
                    System.out.println();
                }
                  }break;   
                  
            case 4:
              for(int i = 0; i < transporte.length; i++){
               if(venda[i] != null){
                pacote[i].descreverPacote();
                venda[i].converterReal(margem, taxaAdicional, cotacao);
                venda[i].descreverVenda(margem, taxaAdicional, cotacao);
                    }
                }break;
                
            case 5:
                System.out.println("Desligando o sistema.");
                    break;
                    
            default: 
                System.out.println("Opcção Inválida");
        }   
        }while(opcao != 5);
    
    }  
}
