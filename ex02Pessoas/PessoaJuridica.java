package ex02Pessoas;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;



    public PessoaJuridica(int id, int rendaMensal, String telefone, String cnpj, String razaoSocial) {
        super(id, rendaMensal, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
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
}