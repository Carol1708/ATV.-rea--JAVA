public class Matematica {
    public static void main(String[] args) {

        Circulo c1 = new Circulo (5, "lilás");
        Retangulo r1 = new Retangulo(5, 7, "rosa");
        Triangulo t1 = new Triangulo(4, 5, "branco");

        System.out.printf("%s%s%.2f", "A área do circulo " + c1.getCor() + " é igual a :", "", c1.CalcularArea());
        System.out.println("cm");
        System.out.println("A área do retângulo " + r1.getCor() + " é igual a :" + r1.CalcularArea() + "cm") ;
        System.out.println("A área do triangulo " + t1.getCor() + " é igual a :" + t1.CalcularArea() + "cm") ;

    }
}
