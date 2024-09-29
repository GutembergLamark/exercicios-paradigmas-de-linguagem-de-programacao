class Animal {
    public String som() {
        return "";
    }
}

class Cachorro extends Animal {
    @Override
    public String som() {
        return "Latido";
    }
}

class Gato extends Animal {
    @Override
    public String som() {
        return "Miau";
    }

}

public class Main{
    public static void emitirSons(Animal[] animais) {
        for (Animal animal : animais) {
            System.out.println(animal.som());
        }
    }
    
    public static void main(String[] args) {
        Animal[] animais = {new Cachorro(), new Gato()};
        emitirSons(animais);
    }
}