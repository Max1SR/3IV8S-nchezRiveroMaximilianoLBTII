Algoritmo numeroparoimpar
	Escribir "Identificar si un numero es par o impar"
	num1<-0
	
	
	Repetir
		Escribir "Ingresar un numero"
		Leer num1
		
		Si num1 MOD 2=0 Entonces
			Escribir "El numero ", num1 , " es par"
		SiNo
			Escribir "El numero " , num1 , " es impar"
		Fin Si
		
		Escribir "¿Desea repetir el proceso? Sí/No"
		Leer respuesta
		
	Hasta Que respuesta= "No"
		
	
	
FinAlgoritmo
