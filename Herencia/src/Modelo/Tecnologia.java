package Modelo;

public class Tecnologia extends Empleado


{
public Tecnologia(String nombre, int edad) {
		super(nombre, edad);
	
	}

private int Desarrollar;
private int Investigar;



public void Manejar() 
{
	System.out.print("Manejar Tecnologia");
	
}



public int getDesarrollar() {
	return Desarrollar;
}



public void setDesarrollar(int desarrollar) {
	Desarrollar = desarrollar;
}



public int getInvestigar() {
	return Investigar;
}



public void setInvestigar(int investigar) {
	Investigar = investigar;
}


}