abstract class Animal {
    public abstract String som();
}

class Cachorro extends Animal {
    @Override
    public String som() {
        return "Latido";
    }
}

interface Movel {
    String mover();
}

class Carro implements Movel {
    @Override
    public String mover() {
        return "O carro está se movendo";
    }

    
}

public class Main{
   public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        System.out.println(cachorro.som());  

        Movel carro = new Carro();
        System.out.println(carro.mover());  
    }
}