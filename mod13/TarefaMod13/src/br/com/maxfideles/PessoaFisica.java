package br.com.maxfideles;

public class PessoaFisica extends Pessoa{
    private String cpf;
    private String genero;
    private float altura;

    public PessoaFisica(String nome, String endereco, String cpf, String genero, float altura) {
        super(nome,endereco);
        this.cpf = cpf;
        this.genero = genero;
        this.altura = altura;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + getNome() + "\nEndereco: " + getEndereco() + "\nCPF: " + getCpf()+ "\nGenero: " + getGenero() + "\nAltura: " + getAltura() +"m");
    }
}
