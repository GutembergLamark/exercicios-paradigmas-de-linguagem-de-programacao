package main

import "fmt"

type Professor struct {
	Nome string
}

type Escola struct {
	Nome        string
	Professores []Professor
}

func (e *Escola) AdicionarProfessor(professor Professor) {
	e.Professores = append(e.Professores, professor)
}

func (e Escola) ExibirProfessores() {
	fmt.Printf("Professores da escola %s:\n", e.Nome)
	for _, professor := range e.Professores {
		fmt.Printf("- %s\n", professor.Nome)
	}
}

func main() {
	escola := Escola{Nome: "Escola A"}
	professor1 := Professor{Nome: "João"}
	professor2 := Professor{Nome: "Maria"}

	escola.AdicionarProfessor(professor1)
	escola.AdicionarProfessor(professor2)
	escola.ExibirProfessores()
}
