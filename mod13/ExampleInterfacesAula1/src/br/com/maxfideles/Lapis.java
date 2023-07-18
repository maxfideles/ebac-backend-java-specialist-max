package br.com.maxfideles;

import br.com.maxfideles.interfaces.ICaneta;

public class Lapis implements ICaneta {
    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo " + texto + " usando o lápis");
    }

    @Override
    public String getCor() {
        return "Cinza";
    }
}
