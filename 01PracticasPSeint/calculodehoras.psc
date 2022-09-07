Algoritmo calculodehoras
	Escribir "Desarrolle un algoritmo que permita calcular la nomina de unos trabajadores"
	horas<-0;
	horasextra<-0
	dias<-0;
	jornada<-0;
	salario<-0;
	nomina<-0;
	diasextra<-0;
	
	Escribir "Ingrese el número según la jornada trabajada:" 
	Escribir "1.-Diurno"
	Escribir "2.-Nocturno"
	Escribir "3.-Mixto"
	Leer jornada
	Escribir "Ingrese el numero de dias trabajados en la quincena (Lunes a viernes)"
	Leer dias
	Escribir "Ingrese el numero de horas trabajadas en la quincena en dias laborales, sin contar horas extra (Lunes a viernes)"
	Leer horas
	Escribir "Ingrese el salario por hora"
	Leer salario
	Escribir "Escribe el número de horas extras que trabajaste en la quincena en dias laborales (Lunes a Viernes), si no trabajaste horas extra coloca un 0 como respuesta"
	Leer horasextra
	
	Segun jornada Hacer
		1:
			Si dias>=0 y dias<=10 Entonces
				Si horas>=0 y horas<=80  Entonces
					Si horasextra>=0 y horasextra<=9 Entonces
						nomina=horas * salario + (2*horasextra*salario)
						Escribir "La nomina es: ", nomina
					SiNo
						Si horasextra>9 y horasextra<=11 Entonces
							nomina=horas * salario + (2*horasextra*salario) + (3 * (horasextra - 9) * salario)
							Escribir "La nomina es: ", nomina
						SiNo
							Escribir "Las horas extra son incorrectas"
						Fin Si
					Fin Si
				SiNo
					Escribir "Las horas son incorrectas"
				Fin Si
			SiNo
				Si dias>0 y dias<=11 Entonces
					Escribir "Indique el numero según el dia extra trabajado"
					Escribir "1.-Sábado"
					Escribir "2.-Domingo"
					Leer diasextra
					
					Segun diasextra Hacer
						1:
							Si horas>=0 y horas<=80  Entonces
								Si horasextra>=0 y horasextra<=9 Entonces
									nomina=horas * salario + (2*horasextra*salario)
									Escribir "La nomina es: ", nomina
								SiNo
									Si horasextra>9 y horasextra<=11 Entonces
										nomina=horas * salario + (2*horasextra*salario) + (3 * (horasextra - 9) * salario)
										Escribir "La nomina es: ", nomina
									SiNo
										Escribir "Las horas extra son incorrectas"
									Fin Si
								Fin Si
							SiNo
								Escribir "Las horas son incorrectas"
							Fin Si	
							
							
						2:

						
					Fin Segun
				SiNo
					Escribir "Los dias son incorrectos"
				Fin Si
			Fin si
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
