package Modelo;

import Controlador.Menu;

public class Test {
	 
	public static void main(String[] args) {
 
		System.out.println("Bienvenido al programa de c�lculo de ecuaci�n de 2� GRADO\n"
				+ "El programa realiza el c�lculo de una ecuaci�n de segundo grado para el que el usuario debe\n"
				+ "introducir los datos necesarios. El programa est� construido a prueba de 'BOMBAS'\n");
 
		int ejecutar = 0;
		boolean repetir=true, error=true;
		double a=0., b=0., c=0.;
		double resultado1=0., resultado2=0.;
		CEcuacion2Grado ecuacion = new CEcuacion2Grado();
 
		do{
			do{
				System.out.println("Introduzca valor para 'a'"); a=Menu.pedirNumero();
				System.out.println("Introduzca valor para 'b'"); b=Menu.pedirNumero();
				System.out.println("Introduzca valor para 'c'"); c=Menu.pedirNumero();
				try {
					if (ecuacion.calcularDiscriminante(a, b, c) <=0 || ecuacion.comprobarDivisible(a) == 0) {
						throw new ExcepcionNegativo("Operaci�n no v�lida. La ecuaci�n no tiene soluciones reales o no es cuadr�tica");
					}else{
						resultado1=ecuacion.calcularUnSigno(a, b, c);
						resultado2=ecuacion.calcularOtroSigno(a, b, c);		
						error=false;
					}
				} catch (ExcepcionNegativo en) {
					en.printStackTrace();
					System.out.println("Introduzca otros n�meros");
				}
 
			}while(error);
 
		System.out.printf("\nLos resultados de la operaci�n son: \n%.2f \n%.2f \n", resultado1, resultado2);
 
		if (ejecutar!=1) repetir = false;	
		}while(repetir);
 
		System.out.println("-----  Gracias por usar la aplicaci�n  -----");
	}
 
}
