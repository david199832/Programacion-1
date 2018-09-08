package Modelo;

public class Empleado extends Persona
{
public Empleado(String nombre, int edad) {
		super(nombre, edad);
	this.salario= 0;
	this.cargo = " delantero";
	}
private double salario;
private String cargo;

public String getSalario() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public String getCargo() {
	return cargo;
}
public void setSalario(double salario) {
	this.salario = salario;
}
public  int getEdad() {
	return edad;
}
public void setEdad(int edad) 
{
	this.edad = edad;
}

public void cobrar() {
	System.out.print("Mi nombre es " + super.nombre);     
	System.out.print(" y mi cargo es" +cargo + ",");
}
	public void darEdad() {
		System.out.println(" mi edad es:45");

	 

}

	
	
}




