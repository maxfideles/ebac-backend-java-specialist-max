package br.com.maxfideles;

import br.com.maxfideles.interfaces.ICaneta;

public class Giz implements ICaneta {
    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo " + texto + " usando o giz");

    }

    @Override
    public String getCor() {
        return "Amarelo";
    }
}
