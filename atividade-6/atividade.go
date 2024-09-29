package main

import "fmt"

type Motor struct {
	Potencia int
}

type Carro struct {
	Marca  string
	Modelo string
	Motor  Motor
}

func (c Carro) ExibirDetalhes() {
	fmt.Printf("Carro: %s %s, Potência: %d HP\n", c.Marca, c.Modelo, c.Motor.Potencia)
}

func main() {
	motor := Motor{Potencia: 150}
	carro := Carro{Marca: "Toyota", Modelo: "Corolla", Motor: motor}
	carro.ExibirDetalhes()
}
