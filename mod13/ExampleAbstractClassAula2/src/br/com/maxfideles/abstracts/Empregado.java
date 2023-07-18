package br.com.maxfideles.abstracts;

public abstract class Empregado {

    private String nome;
    private String sobrenome;
    private String cpf;
    public abstract double vencimento();

    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }

    public String getCpf(){
        return  this.cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(java.lang.String cpf) {
        this.cpf = cpf;
    }

    /**
     * Self implementing the method vencimento<p></p>
     * This way is possible to bring the return from the method vencimento and
     * print it out on the console<p></p>
     * Hiding this way to the user (in the main class) the implementation information
     * from this method (imprimirValores).
     */
    public void imprimirValores(){
        double valor = vencimento();
        System.out.println("O salário de " + this.getNome() + " é: $" + valor);
    }

}
