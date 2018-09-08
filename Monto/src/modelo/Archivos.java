package modelo;
import java.io.*;
import java.util.ArrayList;

public class Archivos {

	private String rutaArchivo;
	private ArrayList<String> lista;
	public Archivos(){
		
		
		rutaArchivo = "C:\\Users\\CDTi LABORATORIOS\\Desktop\\numero.txt";
		
		
		ArrayList<String> lista = new ArrayList<String>();
	}
	
	public boolean agregarNumero(String y) {
		boolean valor = true;
		System.out.println(y);
		if (y == null) {
			
		}else {
			lista.add(y);
		}
		
		return valor;
	}
	
	public void escribirArchivo(String y)
	{
		
		File archivo = new File(rutaArchivo);
		try 
		{
			FileWriter escritor = new FileWriter(archivo,true);
			PrintWriter impresor = new PrintWriter(escritor);
			
			
			impresor.println(y);
			
			
			escritor.close();
			System.out.println("Ya lo leí prro.");
		} 
		catch (IOException e) 
		{
			System.out.println("Paila socio...");
			e.printStackTrace();
		}
	}	
	
	
}

