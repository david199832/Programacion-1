package controlador;

import Modelo.Mundo;

public class Controlador 
{
	public Controlador()
	{
		Mundo miMundo = new Mundo();
		miMundo.escribirArchivo();
		miMundo.leerArchivo();
	}
}
