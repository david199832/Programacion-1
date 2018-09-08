package Controlador;

import java.io.*;
public class Controlador {


	public static void main(String[]args)throws IOException {
	BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

		int n1 = 2;
		int n2 = 3;
		int n3 = 4;
		int n4 = 5;
		
		PicasYFijas App = new PicasYFijas (n1, n2, n3, n4);
		
		System.out.println("Ingrese numero 1: ");
		n1 = Integer.parseInt(lectura.readLine());

		System.out.println("Ingrese numero 2: ");
		n2 = Integer.parseInt(lectura.readLine());

		System.out.println("Ingrese numero 3: ");
		n3 = Integer.parseInt(lectura.readLine());
		
		System.out.println("Ingrese numero 4: ");
		n3 = Integer.parseInt(lectura.readLine());

		while (!App.getPicasYFijas(n1, n2, n3, n4).equals("4 FIJAS")){

		System.out.println("Ingrese numero 1: ");
		n1 = Integer.parseInt(lectura.readLine());

		System.out.println("Ingrese numero 2: ");
		n2 = Integer.parseInt(lectura.readLine());

		System.out.println("Ingrese numero 3: ");
		n3 = Integer.parseInt(lectura.readLine());
		
		System.out.println("Ingrese numero 4: ");
		n4 = Integer.parseInt(lectura.readLine());

		System.out.println(App.getPicasYFijas(n1, n2, n3, n4));

		}		

	}
}