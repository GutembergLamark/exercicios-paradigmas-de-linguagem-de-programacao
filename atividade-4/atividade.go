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

func main() {
	var animal Animal

	animal = Cachorro{}
	fmt.Println(animal.Som()) 

	animal = Gato{}
	fmt.Println(animal.Som()) 
}
