Algoritmo compararnumeros
	Escribir "Ejemplo para comparar si un numero es mayor que 10"
	num1<- 0
	num2<- 0
	num3<- 0
	
	Escribir "Ingresa el primer numero: "
	Leer num1
	Escribir "Ingresa el segundo numero: "
	Leer num2
	Escribir "Ingresa el tercer numero: "
	Leer num3
	
	
				Si num1== num2 y num1<>num3 y num1 es mayor que num3 Entonces
					Escribir "El primero y el segundo son iguales y mayores que ", num3
				SiNo
					Si num2== num3 y num2<>num1 y num2 es mayor que num3 Entonces
						Escribir "El segundo y el tercero son iguales y mayores que ", num1
					SiNo
						Si num3== num1 y num3<>num2 y num3 es mayor que num2 Entonces
							Escribir "El primero y el tercero son iguales y mayores que ", num2
						SiNo
							Si num1== num2 y num1<>num3 y num1 es menor que num3 Entonces
								Escribir "El primero y el segundo son iguales y menores que ", num3
							SiNo
								Si num2== num3 y num2<>num1 y num2 es menor que num3 Entonces
									Escribir "El segundo y el tercero son iguales y menores que ", num1
								SiNo
									Si num3== num1 y num3<>num2 y num3 es menor que num2 Entonces
										Escribir "El primero y el tercero son iguales y menores que ", num2
									SiNo
										
										Si num1 es mayor que num2 y num1 es mayor que num3  Entonces
											Escribir "El numero: ", num1, " es el mayor"
										SiNo
											Si num2 es mayor que num1 y num2 es mayor que num3  Entonces
												Escribir "El numero: ", num2, " es el mayor"
												
											SiNo
												Si num3 es mayor que num1 y num3 es mayor que num2  Entonces
													Escribir "El numero: ", num3, " es el mayor"
													
												SiNo
										Escribir "Todos son iguales"
										
									Fin Si
									
								Fin Si
								
							Fin Si
							
						Fin Si
						
					Fin Si
					
				Fin Si
				
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo

