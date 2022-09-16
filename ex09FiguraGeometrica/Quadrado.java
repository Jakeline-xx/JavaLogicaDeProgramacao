package ex09FiguraGeometrica;

public class Quadrado extends Quadrilatero {
    @Override
    public double obterArea() {
        return this.getLado1()*this.getLado1();
    }
    public Quadrado(float lado){
        this.setLado1(lado);
        this.setLado2(lado);
        this.setLado3(lado);
        this.setLado4(lado);
    }
}
