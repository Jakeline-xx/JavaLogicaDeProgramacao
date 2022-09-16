package ex10FiguraGeometrica;

public class Circulo implements FiguraGeometrica {
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    private float raio;

    public Circulo(float raio){
        this.raio = raio;
    }
    @Override
    public float obterPerimetro() {
        return 6.28f * this.raio;
    }

    @Override
    public double obterArea() {
        return 3.14 * (Math.pow(this.raio,2));
    }

}
