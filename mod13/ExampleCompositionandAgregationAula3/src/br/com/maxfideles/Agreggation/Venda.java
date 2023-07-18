package br.com.maxfideles.Agreggation;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Comprador comprador;
    private Vendedor vendedor;

    private List<Produto> produtos;

    public Venda(){
        this.produtos = new ArrayList<>();
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void concretizerVenda(){
        System.out.println("Olá, " + this.comprador.getName());
        System.out.println("Estes são os seus itens: ");
        for(Produto prod: this.produtos){
            System.out.println(prod.getNome() + " R$" + prod.getPreco());
        }
        System.out.println("\n Vendedor: " + vendedor.getName());



    }

    public void cancelarVenda(){

    }

}
