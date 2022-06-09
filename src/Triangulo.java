public class Triangulo implements FiguraInterface {

    private double base;
    private double altura;
    private String cor;

    public Triangulo(double base, double altura, String cor) {
        this.base = base;
        this.altura = altura;
        this.cor = cor;
    }

    @Override
    public double CalcularArea() {
        return (base * altura)/2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
