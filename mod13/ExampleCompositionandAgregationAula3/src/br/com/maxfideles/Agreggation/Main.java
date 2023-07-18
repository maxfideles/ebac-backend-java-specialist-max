package br.com.maxfideles.Agreggation;

public class Main {
    public static void main (String [] args){
        //Calling methods to instance new objects
        //to the respective object type
        Comprador comprador = createComprador("Max",3000);
        Vendedor vendedor = createVendedor("Zé",0.3f);
        Produto produto1 = createProduto("TV",1500);
        Produto produto2 = createProduto("Cel",3000);
        Produto produto3 = createProduto("AC",2500);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.addProduto(produto1);
        venda.addProduto(produto2);
        venda.addProduto(produto3);
        venda.concretizerVenda();

    }

    /**
     *
     * @return the comprador object
     */
    private static Comprador createComprador(String name, float verba){
        Comprador comprador = new Comprador();
        comprador.setName(name);
        comprador.setVerba(verba);
        return comprador;
    }
    /**
     *
     * @return the vendedor object
     */
    private static Vendedor createVendedor(String name, float comissao){
        Vendedor vendedor = new Vendedor(name, comissao);

        return vendedor;
    }

    private static Produto createProduto(String name, float preco){
        Produto produto = new Produto(preco, name);

        return  produto;
    }


}
