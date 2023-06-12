// CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 13.0;

       if(valorSolicitado < saldo) {
        saldo = saldo - valorSolicitado;
        System.out.println("Novo saldo: " + saldo);

       } else {
        System.out.println("O valor de saque solicitado é maior que o saldo em conta.");
       }
       

        

    }
}
