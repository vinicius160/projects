package exemplodeclasse;
public class ExemploDeClasse {

    public static void main(String[] args) {
    Conta x = new Conta();
    
    
    System.out.println("o valor do saldo é: " + x.saldo  );
    System.out.println("o numero cliente é: " + x.numeroCliente);
        System.out.println("A data e : "+ x.dataAbertura);
    x.depositoConta(1);
    System.out.println("o valor do saldo é: " + x.saldo  );
    
    }
        

}
