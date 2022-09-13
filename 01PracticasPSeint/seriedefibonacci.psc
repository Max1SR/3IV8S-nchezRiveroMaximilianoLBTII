Algoritmo seriedefibonacci
	Escribir "Primeros 100 números de fibonacci"
	a<-0
	b<-1

	Repetir
		
	
	Para n<-1 Hasta 100 Con Paso 1 Hacer
		Escribir a
		c<-a+b
		a<-b
		b<-c
		
	Fin Para
	
	Escribir "¿Desea repetir el proceso? Sí/No"
	Leer respuesta
	Hasta Que respuesta="No"
FinAlgoritmo

