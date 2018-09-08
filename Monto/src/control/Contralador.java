package control;
import modelo.Archivos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

import modelo.Numero;

import vista.Interfaz;



public class Contralador {
	private static int x = 0;
	private static String y= "";
	
	
	
	
	public static  void iniciar() throws IOException {
		
		
		Archivos arch = new Archivos();
		
		Interfaz gui = new Interfaz();
		
		
		Numero modelo = new Numero(x);
		
		while(x !=-1) {
			
			x = gui.pedirDato();
			
			y = modelo.rango(x);
			
			gui.mostrar(y);
			
			arch.escribirArchivo(y);
			
		}
		
		
	}
	
	

}
