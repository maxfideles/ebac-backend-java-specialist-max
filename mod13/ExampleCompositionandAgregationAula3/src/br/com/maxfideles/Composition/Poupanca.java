package br.com.maxfideles.Composition;

public class Poupanca {

    private float saldo;
    Banco banco;


    public void deposita(){

    }

    public void saque(){

    }
    public void extrato(){

    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
