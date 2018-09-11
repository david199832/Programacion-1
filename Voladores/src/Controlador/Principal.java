package Controlador;


import Modelo.Mundo;
import Vista.Vista;

public class Principal {
 
	Mundo m;
	Vista v;
	
	public Principal() {
		m = new Mundo();
		v= new Vista();
		v.darDatosSea(m.getSup().darDatos(),"SUPERMAN");
		v.darDatosSea(m.getSea().darDatos(),"SEAPLANE");
		v.darDatosSea(m.getPaj().darDatos(),"PAJARO");

	}
}