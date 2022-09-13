Algoritmo numeroprimo
	Escribir "Identificar si un numero es primo"
	num1<-0
	
	
	Repetir
		
	Escribir "Ingrese el numero"
	Leer num1

	Si num1=2  Entonces
		Escribir "El numero ", num1 , "  es primo"
	SiNo
		Si num1 MOD 3=0 Entonces
			Escribir "El numero ", num1 , "  no es primo"
		SiNo
			Si (num1+1)  MOD 2=0 Entonces
				Escribir "El numero ", num1 , "  es primo"
			SiNo
				Escribir "El numero ", num1 , "  no es primo"
			Fin Si
		Fin Si
		
	Fin Si
	
	Escribir "¿Desea repetir el proceso? Sí/No"
	Leer respuesta
	
	Hasta Que respuesta= "No"
	

	
FinAlgoritmo
