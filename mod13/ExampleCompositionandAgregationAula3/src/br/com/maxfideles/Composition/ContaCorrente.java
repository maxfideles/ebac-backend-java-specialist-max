package br.com.maxfideles.Composition;

public class ContaCorrente {

    private float saldo;
    private float chequeEspecial;


    public ContaCorrente(float saldo,float chequeEspecial){
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
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
}
