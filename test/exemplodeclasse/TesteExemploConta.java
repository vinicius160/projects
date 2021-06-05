
package exemplodeclasse;

 // @author Vinicius Carvalho

public class TesteExemploConta {
  public static void main (String [] args ){
      
      ContaCorrente cr = new ContaCorrente();
      
      cr.saqueConta(100);
      System.out.println("saldo em conta corrente: " + cr.saldo);
      System.out.println("a data de abertura e: " + cr.dataAbertura);
      
  
    
      ContaPoupanca cp = new ContaPoupanca();
      
      cp.saqueConta(100);
      System.out.println("saldo em conta corrente: " + cp.saldo);
      System.out.println("a data de abertura e: " + cp.dataAbertura);
      
  }

}
