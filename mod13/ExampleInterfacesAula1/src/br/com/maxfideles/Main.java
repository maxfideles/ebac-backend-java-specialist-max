package br.com.maxfideles;

import br.com.maxfideles.interfaces.ICaneta;

public class Main {

    public static void main(String [] args){

        ICaneta caneta = new CanetaEsferografica();
        ICaneta giz = new Giz();
        ICaneta lapis = new Lapis();


        caneta.escrever("vai Corinthians");
        String canetaCor = caneta.getCor();
        System.out.println("A caneta é: " + canetaCor);

        giz.escrever("vai Corinthians");
        String gizCor = giz.getCor();
        System.out.println("O giz é: " + gizCor);

        lapis.escrever("vai Corinthians");
        String lapisCor = lapis.getCor();
        System.out.println("O lápis é: " + lapisCor);

    }


}
