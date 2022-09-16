package ex09FiguraGeometrica;

public abstract  class  Quadrilatero implements FiguraGeometrica{
    public float obterPerimetro(){
        return this.lado1 + this.lado2 + this.lado3 +this.lado4;
    }
    private float lado1;
    private float lado2;
    private float lado3;
    private float lado4;
    public Quadrilatero() {}
    public Quadrilatero(float lado1, float lado2, float lado3, float lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }
    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }
    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    public float getLado4() {
        return lado4;
    }

    public void setLado4(float lado4) {
        this.lado4 = lado4;
    }
}
