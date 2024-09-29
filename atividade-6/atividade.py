class Motor:
    def __init__(self, potencia):
        self.potencia = potencia

class Carro:
    def __init__(self, marca, modelo, motor):
        self.marca = marca
        self.modelo = modelo
        self.motor = motor

    def exibir_detalhes(self):
        print(f"Carro: {self.marca} {self.modelo}, Potência: {self.motor.potencia} HP")

motor = Motor(150)
carro = Carro("Toyota", "Corolla", motor)
carro.exibir_detalhes()