package br.com.maxfideles.Composition;

public class ContaCorrente {

    private float saldo;
    private float chequeEspecial;

    private Banco banco;


    public ContaCorrente(){

    }


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

    public float getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
