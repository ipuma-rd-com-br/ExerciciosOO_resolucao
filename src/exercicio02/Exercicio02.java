package exercicio02;

public class Exercicio02 {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(10, 2);
        System.out.println("Area do triangulo 1: "+t1.area());

        Triangulo t2 = new Triangulo(1.5, 1.1);
        System.out.println("Area do triangulo 2: "+t2.area());

        Triangulo t3 = new Triangulo(20, 20);
        System.out.println("Area do triangulo 3: "+t3.area());
    }
}
