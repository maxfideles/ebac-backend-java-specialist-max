package br.com.maxfideles;

import br.com.maxfideles.abstracts.Empregado;

public class Main {
    public static void main (String [] args){

        Assalariado assalariado = new Assalariado();
        Comissionado comissionado = new Comissionado();
        Horista horista = new Horista();

        assalariado.setNome("Max");
        assalariado.setCpf("123");
        assalariado.setSalario(1200);
        imprimir(assalariado);

        comissionado.setNome("Gabriel");
        comissionado.setCpf("1234");
        comissionado.setTaxaComissao(.30);
        comissionado.setTotalVenda(20000);
        imprimir(comissionado);

        horista.setNome("Carla");
        horista.setCpf("134");
        horista.setPrecoHora(10);
        horista.setHorasTrabalhadas(300);
        imprimir(horista);


    }

    public static void imprimir(Empregado empregado){
        //casting to print a specific variable from horista class
        if(empregado instanceof Horista){
        empregado.imprimirValores();
        double hor =  ((Horista) empregado).getPrecoHora();
        System.out.println("Recebendo: $" + hor + " por hora");

        }else{
            empregado.imprimirValores();
        }

    }
}
