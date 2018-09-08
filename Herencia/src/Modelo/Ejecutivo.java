package Modelo;

public  class Ejecutivo extends Gerente 
{
public Ejecutivo(String nombre, int edad) {
		super(nombre, edad);
	
	}

private int administrarCuentas;
private int evaluacionPresupuestos;


public  void revisarPersonal() {

System.out.print("administrar el personal");
}


public int getAdministrarCuentas() {
	return administrarCuentas;
}


public void setAdministrarCuentas(int administrarCuentas) {
	this.administrarCuentas = administrarCuentas;
}


public int getEvaluacionPresupuestos() {
	return evaluacionPresupuestos;
}


public void setEvaluacionPresupuestos(int evaluacionPresupuestos) {
	this.evaluacionPresupuestos = evaluacionPresupuestos;
}





}