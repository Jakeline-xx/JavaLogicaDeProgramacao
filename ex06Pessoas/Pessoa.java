package ex06Pessoas;

public abstract class Pessoa {
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

    public abstract String calcularRendaAnual();

}
