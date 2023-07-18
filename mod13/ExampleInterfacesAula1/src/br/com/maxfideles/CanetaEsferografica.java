package br.com.maxfideles;

import br.com.maxfideles.interfaces.ICaneta;

public class CanetaEsferografica implements ICaneta {

    @Override
    public void escrever(String texto) {
        System.out.println("Writing " + texto + " using a caneta esferografica");
    }

    @Override
    public String getCor() {
        return "Preta";
    }


}
