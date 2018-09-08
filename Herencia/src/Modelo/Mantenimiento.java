package Modelo;

public class Mantenimiento extends Empleado


{
public Mantenimiento(String nombre, int edad) {
		super(nombre, edad);
	
	}

private int reparacionEquipos;
private int Limpieza;



public void Reparar() 
{
	System.out.print("arreglar");
	
}



public int getReparacionEquipos() {
	return reparacionEquipos;
}



public void setReparacionEquipos(int reparacionEquipos) {
	this.reparacionEquipos = reparacionEquipos;
}



public int getLimpieza() {
	return Limpieza;
}



public void setLimpieza(int limpieza) {
	Limpieza = limpieza;
}

}