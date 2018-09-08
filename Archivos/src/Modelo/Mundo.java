package Modelo;
import java.io.*;
public class Mundo<BufferReader> {
	
	private String rutaArchivo; 
	public static void main(String  [] args) {
		File archivo =new File("c:\\users\\aulamovil06\\Desktop\\numeros1-20");
		
		try {
			FileWriter escritor= new FileWriter(archivo);
			PrintWriter impresor = new PrintWriter(escritor);
			for(int i =1;i<=20;i++)
			{
	
				impresor.print("["+ i +"]");
			}
			escritor.close();
		}
		catch(IOException e)
		{
			System.out.println("archivo no creado paila :,v");
		}
	}
	
	public void leerArchivo()
	{
		
	}

	private File File(String rutaArchivo2) {
		// TODO Auto-generated method stub
		return null;
	}
}