package br.com.maxfideles.Composition;

public class Vendedor {
    private String name;
    private float comissao;

    public void vende(){

    }

    public Vendedor(String name, float comissao){
        this.name = name;
        this.comissao = comissao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }




}
