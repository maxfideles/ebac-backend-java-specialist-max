package br.com.maxfideles;

import br.com.maxfideles.interfaces.ICaneta;

public class Main {

    public static void main(String [] args){
        ICaneta caneta = new CanetaEsferografica();

        caneta.escrever("vai Corinthians");
        String canetaColor = caneta.getCor();
        System.out.println(canetaColor);
    }


}
