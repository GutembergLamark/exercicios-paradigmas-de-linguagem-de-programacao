package main

import "fmt"

type Animal interface {
	Som() string
}

type Cachorro struct{}
type Gato struct{}

func (c Cachorro) Som() string {
	return "Latido"
}

func (g Gato) Som() string {
	return "Miau"
}

func emitirSons(animais []Animal) {
	for _, animal := range animais {
		fmt.Println(animal.Som())
	}
}

func main() {
	animais := []Animal{Cachorro{}, Gato{}}
	emitirSons(animais)
}
