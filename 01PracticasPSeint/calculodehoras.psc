Algoritmo calculodehoras
	Escribir "Desarrolle un algoritmo que permita calcular la nomina de unos trabajadores"
	horas<-0;
	dias<-0;
	jornada<-0;
	salario<-0;
	nomina<-0;
	diasextra<-0;
	
	Escribir "Ingrese el numero de horas trabajadas a la semana en dias laborales"
	Leer horas
	Escribir "Ingrese el numero de dias trabajados a la semana en dias laborales"
	Leer dias
	Escribir "Ingrese el número según la jornada trabajada:" 
	Escribir "1.-Diurno"
	Escribir "2.-Nocturno"
	Escribir "3.-Mixto"
	Leer jornada
	Escribir "Ingrese el salario por hora"
	Leer salario

	
	Segun jornada Hacer
		1:
			Si dias<=5 Entonces
				Si horas<=40 Entonces
					nomina=horas * dias * salario
					Escribir "La nomina es: ", nomina
				SiNo
					Si horas>40 y horas<60 Entonces
						nomina=horas * dias * (2*salario)
						Escribir "La nomina es: " , nomina
					SiNo
						Escribir "Las horas son incorrectas"
					Fin Si
				Fin Si
			SiNo
				Si dias>5 y dias<=7 Entonces
					Escribir "Indique el numero según los dias extra trabajados"
					Escribir "1.-Sábado"
					Escribir "2.-Domingo"
					Escribir "3.-Sábado y Domingo"
					Leer diasextra
					
					Segun diasextra Hacer
						1:
							Si expresion_logica Entonces
								acciones_por_verdadero
							SiNo
								acciones_por_falso
							Fin Si
						2:
							secuencia_de_acciones_2
						3:
							secuencia_de_acciones_3
						De Otro Modo:
							secuencia_de_acciones_dom
					Fin Segun
				SiNo
					acciones_por_falso
				Fin Si
			Fin Si
		2:
			Si jornada==Nocturno Entonces
				Si horas<=7 Entonces
					nomina=horas * dias * salario
					Escribir "La nomina es: ", nomina
				SiNo
					Escribir "Hola"
				Fin Si
			SiNo
				Escribir "Hola"
			Fin Si
		3:
			Si jornada==Mixto Entonces
				Si horas<=7.5 Entonces
					nomina=horas * dias * salario
					Escribir "La nomina es: ", nomina
				SiNo
					Escribir "Hola"
				Fin Si
				
			SiNo
				Escribir "Hola"
			Fin Si
		De Otro Modo:
			Escribir "Hola"
	Fin Segun
	
	

	
FinAlgoritmo
