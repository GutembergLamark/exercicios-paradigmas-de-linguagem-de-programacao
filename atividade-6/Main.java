class Motor {
    int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }
}

class Carro {
    String marca;
    String modelo;
    Motor motor;

    public Carro(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void exibirDetalhes() {
        System.out.println("Carro: " + marca + " " + modelo + ", Potência: " + motor.potencia + " HP");
    }

    
}

public class Main{
    public static void main(String[] args) {
        Motor motor = new Motor(150);
        Carro carro = new Carro("Toyota", "Corolla", motor);
        carro.exibirDetalhes(); 
    }
}