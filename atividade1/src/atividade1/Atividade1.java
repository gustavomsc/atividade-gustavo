
package atividade1;
import java.util.Scanner;

public class atividade {
  
    public int[] valor;
    
    public void VerificarMaior(int ValorMaior){
        
    }
    
    public void VerificarMenor(int ValorMenor){
        
    }

    public void VerificarMedia(int ValorMedia){
        
    }
    
    public void AdicionarNovoValor(int valor){
        
    }
    
    public class Operacao {
        
        
        public int CadastrarValor;
        public int BuscarMaior;
        public int BuscarMenor;
        public int AdicionarNovoValor;
        
    }
    
    public static void main(String[]args){
         Scanner input = new Scanner(System.in);
         
         int opcao;
         int i;
         
         Opcoes[] opcoes = new Opcoes[5];
         
         System.out.println("");
         
         System.out.println("=====MENU=====");
         
         System.out.println("1. Cadastrar Valor");
                 
         System.out.println("2. Buscar Maior");
         
         System.out.println("3. Buscar Menor");
         
         System.out.println("4. Ler Media");        
         
         System.out.println("5. sair");
         
         System.out.println("Digite a opcao desejada");
         
         opcao = input.nextInt();
         
         System.out.println("");
         
         if(opcao == 1){
             for(int i=0; i<5; i++){
                 
             System.out.println("_____Cadastros de Valores____" +(i+1)+"____");
             
             System.out.println("Valor 1: "); float valor1 = input.nextFloat();
             
             }
         }
    }            
}