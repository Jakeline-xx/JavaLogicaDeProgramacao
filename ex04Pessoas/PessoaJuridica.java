package ex04Pessoas;

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

    @Override
    public String calcularRendaAnual() {
        super.calcularRendaAnual();
        double resultado = 12 * rendaMensal;
        resultado -= 100;
        return "A renda anual é de: " + resultado;
    }
}