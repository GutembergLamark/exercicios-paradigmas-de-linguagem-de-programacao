package main

import (
	"fmt"
	"math"
)

type Forma interface {
	Area() float64
}

type Quadrado struct {
	Lado float64
}

func (q Quadrado) Area() float64 {
	return q.Lado * q.Lado
}

type Circulo struct {
	Raio float64
}

func (c Circulo) Area() float64 {
	return math.Pi * c.Raio * c.Raio
}

func main() {
	quadrado := Quadrado{Lado: 4}
	circulo := Circulo{Raio: 3}

	fmt.Printf("Área do quadrado: %.2f\n", quadrado.Area())
	fmt.Printf("Área do círculo: %.2f\n", circulo.Area())
}
