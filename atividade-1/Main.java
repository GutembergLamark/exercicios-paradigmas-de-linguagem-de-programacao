class Carro {
    String marca;
    String modelo;
    int ano;

    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    void exibirDetalhes() {
        System.out.println("Carro: " + marca + " " + modelo + ", Ano: " + ano);
    }

    
}

public class Main{
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2019);
        Carro carro3 = new Carro("Ford", "Mustang", 2021);

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
        carro3.exibirDetalhes();
    }
}