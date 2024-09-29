package main

import "fmt"

func somar(a int) int {
	return a
}

func somarDois(a int, b int) int {
	return a + b
}

func somarTres(a int, b int, c int) int {
	return a + b + c
}

func main() {
	fmt.Println(somar(1))           
	fmt.Println(somarDois(1, 2))    
	fmt.Println(somarTres(1, 2, 3)) 
}
