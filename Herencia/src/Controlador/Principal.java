package Controlador;
import Modelo.Empleado;
import Modelo.Mantenimiento;
import Modelo.Gerente;

public class Principal {
	
	private static Empleado emp1;
	public static void main(String[] args) {
		emp1 = new Empleado("Gareth Bale ", 45);
		emp1.cobrar();
		emp1.correr();
		emp1.darEdad();
		
	}
public static Mantenimiento emp2;
public static void main1(String[] args) {
	emp2 = new Mantenimiento("Gareth Bale ", 45);
	emp2.getLimpieza();
	
	
}

}


