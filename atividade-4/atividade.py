class Animal:
    def som(self):
        pass

class Cachorro(Animal):
    def som(self):
        return "Latido"

class Gato(Animal):
    def som(self):
        return "Miau"

cachorro = Cachorro()
gato = Gato()

print(cachorro.som()) 
print(gato.som())