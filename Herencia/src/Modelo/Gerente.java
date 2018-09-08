package Modelo;

public class Gerente extends Empleado 
{
public Gerente(String nombre, int edad) {
		super(nombre, edad);
	
	}

private int personasCargo;


public int getPersonasCargo() {
	return personasCargo;
}


public void setPersonasCargo(int personasCargo) {
	this.personasCargo = personasCargo;
}


public void Echar() 
{
	System.out.print("estas despedido");
	
}

}