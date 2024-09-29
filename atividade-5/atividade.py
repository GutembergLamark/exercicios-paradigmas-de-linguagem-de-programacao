class Animal:
    def som(self):
        pass

class Cachorro(Animal):
    def som(self):
        return "Latido"

class Gato(Animal):
    def som(self):
        return "Miau"

def emitir_sons(animais):
    for animal in animais:
        print(animal.som())

animais = [Cachorro(), Gato()]
emitir_sons(animais)