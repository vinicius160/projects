
package exemplodeclasse;
//@author Vinicius Carvalho
 
public class DigitaConta extends Conta{
  public static void main (String [] args){
      java.util.Scanner sc = new java.util.Scanner(System.in);
      ContaPoupanca cp = new ContaPoupanca();
      ContaCorrente cr = new ContaCorrente();
      int c;
      
      do {
      
      System.out.println("Digite <1> para Corrente ");
      System.out.println("Digite <2> para Poupança ");
      System.out.println("Digite <0> para Sair");
      c = sc.nextInt();
      if (c > 2 || c < 0){
          System.out.println("Opção invalida");
      }
       switch (c){
          case 1 :
        System.out.println("Cadastro de Conta Corrente"); 
      while(cr.numeroconta == 0){ 
        System.out.print("Digite Numero da conta : ");
          cr.numeroconta = sc.nextInt();
            if(cr.numeroconta == 0) 
            {
            System.out.println("Erro numero de conta invalido.");
            }
          }while (cr.numeroCliente == 0){
            System.out.print("Digite Numero de Cliente : ");
             cr.numeroCliente = sc.nextInt();
           if(cr.numeroCliente == 0) {
            System.out.println("invalido.");
          }
      }while (cr.dataAbertura == null){
          System.out.print("Digite Data de Abertura : ");
           cr.dataAbertura = sc.next();
       if(cr.dataAbertura == null) {
          System.out.println("invalido.");
          }
          
      } 
        System.out.print("Digite o Codigo do gerente : ");
          cr.gerente = sc.nextInt();
        System.out.print("Digite o limite : ");
          cr.limite = sc.nextInt();
        System.out.print("Digite Valor do deposito : ");
          cr.depositoConta(sc.nextDouble());
        System.out.print("Digite Valor do saque : ");
          cr.saqueConta(sc.nextDouble());
        System.out.println("Saldo na conta e : " + cr.saldo);
         break;
         
     case 2 :
      System.out.println("Cadastro de Conta Poupança"); 
      while(cp.numeroconta == 0){ 
        System.out.print("Digite Numero da conta : ");
           cp.numeroconta = sc.nextInt();
          if(cp.numeroconta == 0) 
          {
            System.out.println("Erro numero de conta invalido.");
          }
          }while (cp.numeroCliente == 0){
            System.out.print("Digite Numero de Cliente : ");
              cp.numeroCliente = sc.nextInt();
           if(cp.numeroCliente == 0) {
            System.out.println("invalido.");
          }
      }while (cp.dataAbertura == null){
          System.out.print("Digite Data de Abertura : ");
            cp.dataAbertura = sc.next();
        if(cp.dataAbertura == null) {
            System.out.println("invalido.");
          }
      } 
        System.out.print("Digite Valor do deposito : ");
          cp.depositoConta(sc.nextDouble());
        System.out.print("Digite Valor do saque : ");
          cp.saqueConta(sc.nextDouble());
        System.out.println("Saldo na conta e : " + cp.saldo);
       }
       }while (c != 0);
      }
      }


      


      
  
