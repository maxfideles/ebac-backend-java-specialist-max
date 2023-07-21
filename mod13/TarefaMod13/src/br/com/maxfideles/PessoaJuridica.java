package br.com.maxfideles;

public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private String razaoSocial;
    private String situacaoCadastral;

    public PessoaJuridica(String nome, String endereco, String cnpj, String razaoSocial, String situacaoCadastral) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.situacaoCadastral = situacaoCadastral;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getSituacaoCadastral() {
        return situacaoCadastral;
    }

    public void setSituacaoCadastral(String situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + getNome() + "\nEndereco: " + getEndereco() + "\nCNPJ: " + getCnpj()+ "\nRazao Social: " + getRazaoSocial() + "\nSituacao Cadastral: " + getSituacaoCadastral());
    }
}
