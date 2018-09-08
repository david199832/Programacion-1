package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Mundo 
{
	
	private String rutaArchivo;
	
	public Mundo()
	{
		rutaArchivo = "C:\\Users\\aulamovil06\\Desktop\\numeros1-20";
	}
	
	public void escribirArchivo()
	{
		File archivo = new File(rutaArchivo);
		try 
		{
			FileWriter escritor = new FileWriter(archivo);
			PrintWriter impresor = new PrintWriter(escritor);
			
			for (int i = 1; i <= 2000; i++) 
			{
				impresor.println("["+ (i) +"]");
			}
			escritor.close();
			System.out.println("Ya lo ley� prro.");
		} 
		catch (IOException e) 
		{
			System.out.println("Paila socio...");
			e.printStackTrace();
		}
	}
	
	public void leerArchivo()
	{
		File archivo = new File(rutaArchivo);
		try 
		{
			FileReader lector = new FileReader(archivo);
			BufferedReader Buffy = new BufferedReader(lector);
			String linea = Buffy.readLine();
			
			while(linea != null)
			{
				System.out.println(linea);
				Thread.sleep(100);
				linea = Buffy.readLine();
			}
			
			lector.close();
		}
		
		catch (IOException | InterruptedException e)
		{
			System.out.println("Paila socio...");
			e.printStackTrace();
		}
	}
}
