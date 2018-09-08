package Modelo;

public class Comercial extends Gerente
{
public Comercial(String nombre, int edad) {
		super(nombre, edad);
	
	}

private String promoverMrketing;
private String Mensajero;


public void administrarMarketing() {

	System.out.print("publicidad de a empresa");

}


public String getPromoverMrketing() {
	return promoverMrketing;
}


public void setPromoverMrketing(String promoverMrketing) {
	this.promoverMrketing = promoverMrketing;
}


public String getMensajero() {
	return Mensajero;
}


public void setMensajero(String mensajero) {
	Mensajero = mensajero;
}




}