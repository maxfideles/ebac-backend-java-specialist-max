package br.com.maxfideles;

public class Main {

    public static void main(String[] args){

    PessoaFisica pf = createPF("Max", "Rua dos Limões", "123.123.123-00", "Masculino", 1.86f);
    PessoaJuridica pj = createPJ("M&M", "Rua da Santa", "12.7126361.00001/00", "MeM Ltda.", "Ativa");



    System.out.println("Pessoa Fisica Registrada");
    pf.imprimir();


    System.out.println("\nPessoa Juridica Registrada");
    pj.imprimir();

    }

    public static PessoaFisica createPF(String nome, String endereco, String cpf, String genero, float altura) {

        PessoaFisica pf = new PessoaFisica(nome, endereco, cpf, genero, altura);

        return pf;
    }

    public static PessoaJuridica createPJ(String nome, String endereco, String cnpj, String razaoSocial, String situacaoCadastral) {
        PessoaJuridica pj = new PessoaJuridica(nome, endereco, cnpj, razaoSocial, situacaoCadastral);
        return pj;
    }


}
