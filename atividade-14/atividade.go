package main

import "fmt"

type Configuracao struct{}

var instancia *Configuracao

func GetInstancia() *Configuracao {
	if instancia == nil {
		instancia = &Configuracao{}
	}
	return instancia
}

func main() {
	config1 := GetInstancia()
	config2 := GetInstancia()

	fmt.Println(config1 == config2) 
}
