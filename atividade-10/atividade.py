from abc import ABC, abstractmethod

class Animal(ABC):
    @abstractmethod
    def som(self):
        pass

class Cachorro(Animal):
    def som(self):
        return "Latido"

class Movel(ABC):
    @abstractmethod
    def mover(self):
        pass

class Carro(Movel):
    def mover(self):
        return "O carro está se movendo"

cachorro = Cachorro()
print(cachorro.som())  

carro = Carro()
print(carro.mover())