Algoritmo factorial
	Escribir "Identificar el factorial de un numero"
	num1<-0
	f<-1
	
	Repetir
		
	Escribir "Ingrese el numero"
	Leer num1
	
		Para r<-1 Hasta num1 Con Paso 1 Hacer
			f<-f*r
		
		Fin Para
		
	Escribir "El factorial de ", num1, " es ", f

	Escribir "¿Desea repetir el proceso? Sí/No"
	Leer respuesta
	Hasta Que respuesta="No"


FinAlgoritmo
