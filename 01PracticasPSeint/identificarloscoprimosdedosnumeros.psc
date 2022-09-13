Algoritmo identificarloscoprimosdedosnumeros
	Escribir "Identificar los coprimos de dos numeros"
	a<-0
	b<-0
	
	Repetir
	Escribir "Escriba el primer numero"
	Leer a
	Escribir "Escriba el segundo numero"
	Leer b
	
	Si a MOD 2=0 y b MOD 2=0 Entonces
		Escribir "Los numeros ", a, " y ", b " No son coprimos"
	SiNo
		Si a MOD 3=0 y b MOD 3=0 Entonces
			Escribir "Los numeros ", a, " y ", b " No son coprimos"
		SiNo
			Si a=b Entonces
				Escribir "No son coprimos"
			SiNo
				Escribir "Los numeros ", a, " y ", b " Son coprimos"
			Fin Si
		Fin Si
	Fin Si
	
	Escribir "¿Desea repetir el proceso? Sí/No"
	Leer respuesta
	Hasta Que respuesta="No"
	
FinAlgoritmo
