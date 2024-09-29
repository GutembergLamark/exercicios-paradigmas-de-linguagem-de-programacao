class SaldoInsuficienteException(Exception):
    pass

class ContaBancaria:
    def __init__(self, saldo):
        self.saldo = saldo

    def sacar(self, valor):
        if valor > self.saldo:
            raise SaldoInsuficienteException("Saldo insuficiente para realizar o saque.")
        self.saldo -= valor
        return self.saldo

conta = ContaBancaria(100)
try:
    conta.sacar(150)
except SaldoInsuficienteException as e:
    print(e)