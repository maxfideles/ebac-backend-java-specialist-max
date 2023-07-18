package br.com.maxfideles;

import br.com.maxfideles.abstracts.Empregado;

public class Comissionado extends Empregado {

    private double totalVenda;
    private double taxaComissao;

    @Override
    public double vencimento() {
        return 2000;
    }
}
