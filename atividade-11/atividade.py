class Universidade:
    def __init__(self, nome):
        self.nome = nome

    class Departamento:
        def __init__(self, nome_dep):
            self.nome_dep = nome_dep

        def exibir_nome(self):
            print(f"Departamento: {self.nome_dep}")

uni = Universidade("Universidade XYZ")
dep = Universidade.Departamento("Ciências da Computação")
dep.exibir_nome()