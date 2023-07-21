package br.com.maxfideles.Composition;

import java.util.HashSet;
import java.util.Set;

public class Banco {

    private long codigo;
    private String nome;
    private Set<ContaCorrente> contasCorrente;
    private Set<Poupanca> contasPoupanca;

    public Banco(){
        this.contasCorrente = new HashSet<>();
        this.contasPoupanca = new HashSet<>();

    }

    public void addCC(ContaCorrente cc){
        this.contasCorrente.add(cc);
    }

    public void addCP(Poupanca cp){
        this.contasPoupanca.add(cp);
    }

    public void iniciaBanco(){

    }
    public void abreConta(){

    }
    public void abrePoupanca(){

    }
    public void falencia(){

    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
