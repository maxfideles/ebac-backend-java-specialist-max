package br.com.maxfideles;

import br.com.maxfideles.abstracts.Empregado;

public class Horista extends Empregado {

    private double precoHora;
    private double horasTrabalhadas;

    @Override
    public double vencimento() {
        return 0;
    }
}
