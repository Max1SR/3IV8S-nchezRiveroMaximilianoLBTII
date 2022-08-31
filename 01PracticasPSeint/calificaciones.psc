Algoritmo calificaciones
	Escribir "Desarrolle un algoritmo que permita convertir calificaciones numéricas a letras"
	nota <- 0
	
	Repetir
		Escribir "Ingresa la calificación numérica"
		Leer nota
		
		Si nota > 20 Entonces
			Escribir "No se aceptan números tan grandes, solo hasta 20"
		SiNo
			Si nota >=19 y nota >=20 Entonces
				Escribir "Tu nota es A"
			SiNo
				Si nota >=16 y nota <=18 Entonces
					Escribir "Tu nota es B"
				SiNo
					Si nota >=13 y nota<=15 Entonces
						Escribir "Tu nota es C"
					SiNo
						Si nota >= 10 y nota<=12 Entonces
							Escribir "Tu nota es D"
						SiNo
							Si nota>=1 y nota<=9 Entonces
								Escribir "Tu nota es e"
							SiNo
								Escribir "No negativos"
							Fin Si
						Fin Si
					Fin Si
				Fin Si
			Fin Si
		Fin Si
		
		
	Hasta Que nota=0
	
	Escribir "Cambiar a un mientras"

FinAlgoritmo
