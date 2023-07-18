package br.com.maxfideles.Composition;

public class Comprador {
    private String name;
    private float verba;
    public void compra(){
        System.out.print("Comprou!");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public float getVerba() {

        return verba;
    }

    public void setVerba(float verba) {

        this.verba = verba;
    }
}
