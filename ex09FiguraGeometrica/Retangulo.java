package ex09FiguraGeometrica;

public class Retangulo extends Quadrilatero{
    public Retangulo(float lado1, float lado2, float lado3, float lado4) {
        super(lado1, lado2, lado3, lado4);
    }

    public Retangulo(float base, float altura){
    this.setLado1(base);
    this.setLado2(altura);
    }

    @Override
    public double obterArea() {
        return this.getLado1()*this.getLado2();
    }

}
