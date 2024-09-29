import java.util.ArrayList;

class Empregado {
    String nome;
    String cargo;
    double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
}

abstract class Forma {
    public abstract double area();
}

class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}

class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    public static void main(String[] args) {
        Forma quadrado = new Quadrado(4);
        Forma circulo = new Circulo(3);

        System.out.println("Área do quadrado: " + quadrado.area());
        System.out.println("Área do círculo: " + circulo.area());
    }
}

public class Main{
   public static void main(String[] args) {
        Forma quadrado = new Quadrado(4);
        Forma circulo = new Circulo(3);

        System.out.println("Área do quadrado: " + quadrado.area());
        System.out.println("Área do círculo: " + circulo.area());
    }
}