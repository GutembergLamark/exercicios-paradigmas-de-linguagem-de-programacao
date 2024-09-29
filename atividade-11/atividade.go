package main

import "fmt"

type Departamento struct {
	NomeDep string
}

func (d Departamento) ExibirNome() {
	fmt.Printf("Departamento: %s\n", d.NomeDep)
}

func main() {

	departamento := Departamento{NomeDep: "Ciências da Computação"}
	departamento.ExibirNome()
}
