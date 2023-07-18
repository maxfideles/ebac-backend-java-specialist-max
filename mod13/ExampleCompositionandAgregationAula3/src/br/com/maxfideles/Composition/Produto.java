package br.com.maxfideles.Composition;

import java.util.HashSet;
import java.util.Set;

public class Produto {


    private float preco;
    private String nome;


    private void vendido(){

    }

    public Produto(float preco, String name){
        this.nome = name;
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
