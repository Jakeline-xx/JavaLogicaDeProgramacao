package ex08Pessoas;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;
    private int idade;
    private String nome;



    public PessoaFisica(int id, int rendaMensal, String telefone, String cpf, String rg, int idade, String nome) {
        super(id, rendaMensal, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}