package br.com.maxfideles.Composition;

public class Main {


    public static void main (String [] args){

        Banco banco = new Banco();
        banco.setNome("Max Bank");
        banco.setCodigo(1234);

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(4000);
        cc.setChequeEspecial(4500f);

        Poupanca cp = new Poupanca();
        cp.setBanco(banco);
        cp.setSaldo(10000);

    }

}
