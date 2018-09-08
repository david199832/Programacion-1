package Modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class Escribir {
	 private char[] nValor;
	    String valorLetras="",rta="";
	    int bloqueTres=0;
	    public NumeroLetras() {
	    }
	   public String convertir(int valor){ 
	      
	       int nBloque=0;
	       String mostrar="";
	    char []arregloValor=Integer.toString(valor).toCharArray();
	    int[]arregloValores=new int[arregloValor.length];
	       for(int i=0;i<arregloValores.length;i++)            
	           arregloValores[arregloValor.length-i-1]=Character.getNumericValue(arregloValor[i]);
	       int recorrer=0;
	           while(arregloValor.length-recorrer!=0){
	                int bloqueCero=0;
	               int primerDigito=0;
	               int segundoDigito=0;
	               int tercerDigito=0;
	               
	               for(int i=0;i<3;i++ ){
	                   
	                   if(arregloValores[recorrer]!=0){
	                   switch (i){
	                       case 0:
	                           valorLetras=" "+nUnidades[arregloValores[recorrer]-1];
	                           primerDigito=arregloValores[recorrer];
	                           break;
	                       case 1:
	                           if(arregloValores[recorrer]<=2){
	                           valorLetras=" "+nUnidades[arregloValores[recorrer]*10+primerDigito-1];
	                           }else{
	                               valorLetras=" "+nDecenas[arregloValores[recorrer]-1]+(primerDigito!=0?" Y":"")+valorLetras;
	                           }
	                           segundoDigito=arregloValores[recorrer];
	                           break;
	                       case 2:
	                          
	                   }}
	                   else{
	                      bloqueCero++; 
	                   }
	                   if((++recorrer)>arregloValores.length-1)
	                   break; 
	               }
	               switch(nBloque){
	                   case 0:
	                       mostrar=valorLetras;
	                       break;
	                   case 1:
	                       mostrar=valorLetras+(bloqueCero==3?"":" MIL ")+mostrar;
	                       break;
	                   case 2:
	                       mostrar=valorLetras+((primerDigito==1 && segundoDigito==0 && tercerDigito==0)?" MILLON ":" MILLONES ")+(mostrar.trim().compareTo("")==0?" DE ":"")+mostrar;
	                       
	               }
	               nBloque++;
	               
	           }
			return mostrar;
	           
	       
	   }
	   
	   
	} 
	public static void main(String[] args) {
		

		// Fichero del que queremos leer
		File fichero = new File("C:\\Users\\aulamovil06\\Desktop\\monto");
		Scanner s = null;

		try {
			// Leemos el contenido del fichero
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(fichero);

			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 	// Guardamos la linea en un String
				System.out.println(linea);      // Imprimimos la linea
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	}
}