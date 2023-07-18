package br.com.maxfideles;

import br.com.maxfideles.abstracts.Empregado;

public class Assalariado extends Empregado {
    private double salario;

    @Override
    public double vencimento() {
        return 1000;
    }
}
