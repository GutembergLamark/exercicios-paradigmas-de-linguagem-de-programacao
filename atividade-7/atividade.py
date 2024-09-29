class Professor:
    def __init__(self, nome):
        self.nome = nome

class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []

    def adicionar_professor(self, professor):
        self.professores.append(professor)

    def exibir_professores(self):
        print(f"Professores da escola {self.nome}:")
        for professor in self.professores:
            print(f"- {professor.nome}")

escola = Escola("Escola A")
professor1 = Professor("João")
professor2 = Professor("Maria")

escola.adicionar_professor(professor1)
escola.adicionar_professor(professor2)
escola.exibir_professores()