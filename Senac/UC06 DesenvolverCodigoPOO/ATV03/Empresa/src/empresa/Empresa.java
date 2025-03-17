package empresa;

import java.util.Scanner;
import java.util.ArrayList;


public class Empresa {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       ArrayList<Funcionario> funcionario = new ArrayList<>();
       String opCadastro = "", opAumento;
        
        System.out.println("SEJAM BEM VINDO AO SISTEMA FOLHA DE PAGAMENTO");
        System.out.println();
        
        for(int i = 0; i < 10; i++){
            System.out.println("Registro Pagamento");
            System.out.println("1-Assalariado; 2-Horista;");
            int opcao = entrada.nextInt();
            entrada.nextLine();
            
                System.out.println("Nome do funcionário:");
                String nome = entrada.nextLine();
                System.out.println("CPF do funcionário:");
                String cpf = entrada.nextLine();
                System.out.println("Endereço do funcionário:");
                String endereco = entrada.nextLine();
                System.out.println("Telefone:");
                String telefone = entrada.nextLine();
                System.out.println("Setor do funcionário:");
                String setor = entrada.nextLine();
                
            if(opcao == 1){
                System.out.println("Total a receber:");
                float salario = entrada.nextFloat();
                entrada.nextLine();
                
                funcionario.add( new Assalariado(nome, cpf, endereco, telefone, setor, salario));  
            } else if(opcao == 2){
                System.out.println("Horas trabalhada:");
                float horas = entrada.nextFloat();
                entrada.nextLine();
                System.out.println("Valor hora do funcionário:");
                float valorHora = entrada.nextFloat();
                entrada.nextLine();
                
                funcionario.add(new Horista(nome, cpf, endereco, telefone, setor, horas, valorHora));
            }
            
            if(funcionario.size() >= 10){
                System.out.println("Número máximo de funcionários!");
            }
            System.out.println("Deseja continuar? S/N");
            opCadastro = entrada.nextLine();
            if(!opCadastro.equalsIgnoreCase("S")){
                break;
            } 
        }
        
        for(Funcionario f : funcionario){
            f.descrever();
        }    
         System.out.println("Gostaria de acrescentar aumento para os funcionários? S/N");
         opAumento = entrada.nextLine();
         if(opAumento.equalsIgnoreCase("S")){
             System.out.println("Informe percentual do aumento:");
             float aumento = entrada.nextFloat();
             entrada.nextLine();
         for(Funcionario f : funcionario){
            f.aplicarAumento(aumento);   
        }
         } 
    }
}
