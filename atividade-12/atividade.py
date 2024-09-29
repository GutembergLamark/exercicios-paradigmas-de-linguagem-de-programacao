class Calculadora:
    def somar(self, a, b=0, c=0):
        return a + b + c

calc = Calculadora()
print(calc.somar(1))     
print(calc.somar(1, 2))   
print(calc.somar(1, 2, 3))  