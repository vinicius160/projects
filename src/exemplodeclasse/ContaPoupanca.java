
package exemplodeclasse;
public class ContaPoupanca extends Conta{
   String datasAniversario;
    
   void saqueConta (double valor){
       if ((saldo - valor) < 0)//polimorfismo
            System.out.println("\n\nERRO SALDO FICA ABAIXO DE 0.0");
         else saldo -= valor;
       
   }
    
}
