package main

import "fmt"

type Movel interface {
	Mover() string
}

type Som interface {
	EmitirSom() string
}

type Cachorro struct{}

func (c Cachorro) EmitirSom() string {
	return "Latido"
}

type Carro struct{}

func (c Carro) Mover() string {
	return "O carro está se movendo"
}

func main() {
	var som Som = Cachorro{}
	fmt.Println(som.EmitirSom()) 

	var movel Movel = Carro{}
	fmt.Println(movel.Mover()) 
}
