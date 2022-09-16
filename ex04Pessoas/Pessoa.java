package ex04Pessoas;

public class Pessoa {
    protected int id;
    protected int rendaMensal;
    protected String telefone;


    public Pessoa(int id, int rendaMensal, String telefone) {
        super();
        this.id = id;
        this.rendaMensal = rendaMensal;
        this.telefone = telefone;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(int rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String calcularRendaAnual() {
        double resultado = 12 * rendaMensal;
        return "A renda anual é de: " + resultado;

    }

    public String calcularRendaAnual(int rendaMensalSimulada) {
        double resultado = 12 * rendaMensalSimulada;
        return "A renda anual simulada é de: " + resultado;
    }
}
