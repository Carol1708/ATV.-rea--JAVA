public class Retangulo implements FiguraInterface {

    private double lado1;
    private double lado2;
    private String cor;

    public Retangulo(double lado1, double lado2, String cor) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.cor = cor;
    }

    @Override
    public double CalcularArea() {
        return lado1 * lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
