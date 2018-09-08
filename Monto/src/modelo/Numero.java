package modelo;

public class Numero {
	private int numero;
	
	public Numero(int n) {
		int numero = n;
		
	}
	
	public static String buscarUn(int x) {
		String valor ="";
		String[] unidades;
		unidades = new String[10];
		unidades[0]="uno";
		unidades[1]="dos";
		unidades[2]="tres";
		unidades[3]="cuatro";
		unidades[4]="cinco";
		unidades[5]="seis";
		unidades[6]="siete";
		unidades[7]="ocho";
		unidades[8]="nueve";
		
		valor = unidades[x-1];
		
		
		return valor;
	}
	public static String ConvertirDiez(int x) {
		String valor = "";
		String[] valores;
		valores = new String[10];
		valores[0]="once";
		valores[1]="doce";
		valores[2]="trece";
		valores[3]="catorce";
		valores[4]="quince";
		valores[5]="dieciséis";
		valores[6]="diecisiete";
		valores[7]="dieciocho";
		valores[8]="diecinueve";
		
		valor = valores[x-1];
		
		return valor;
	}
	public static String ConvertirDecenas(int x) {
		String valor = "";
		String[] valores;
		valores = new String[10];
		valores[0]="diez";
		valores[1]="veinte";
		valores[2]="treinta";
		valores[3]="cuarenta";
		valores[4]="cincuenta";
		valores[5]="sesenta";
		valores[6]="ochenta";
		valores[7]="noventa";
		
		
		valor = valores[x-1];
		
		return valor;
	}
	
	public static String rango(int x) {
		String retorno = "";
		
		int valor1= 0;
		
		String mostrar = "";
		if(x>=0 && x<10) {
			if(x !=0) {
				
				mostrar = buscarUn(x);
				retorno = mostrar;
			}else {
				retorno ="Cero";
			}
		}else if(x>=10 &&x<20) {
			if (x !=10) {
			
			valor1= x%10;
			mostrar= ConvertirDiez(valor1);
			retorno =mostrar;
			//System.out.println(mostrar);
			}else {
				retorno =("diez");
			}
			
		}else if (x>=20 &&x< 30) {
			if(x!=20) {
			valor1 = x%10;
			mostrar = buscarUn(valor1);
			retorno = "Veinti"+mostrar;
			}else {
				retorno = "Veinte";
			}
			
		}else if (x >=30 && x<40) {
			if(x != 30) {
			valor1 = x%10;
			
			mostrar  = buscarUn(valor1);
			retorno ="Treinta y "+ mostrar;
			}else {
				retorno ="Treinta";
			}
		}else if(x >=40 && x<50) {
			
			if(x!=40) {
				valor1 = x%10;
				mostrar = buscarUn(valor1);
				retorno = "Cuarenta y "+ mostrar;
			}else {
				retorno = "Cuarenta";
			}
			
		}else if(x >=50 && x<60) {
			
			if (x!=50) {
			valor1 = x%10;
			mostrar = buscarUn(valor1);
			retorno = "Cincuenta y "+ mostrar;
			}else {
				retorno = "Cincuenta";
			}
		}else if(x >= 60 && x<70) {
			if(x !=60) {
				valor1 = x%10;
				mostrar = buscarUn(valor1);
				retorno = ("Sesenta y "+ mostrar);
			}else {
				retorno = ("Sesenta");
			}
			
		}else if(x >= 80 && x<90) {
			if(x!=80) {
			valor1 = x%10;
			mostrar = buscarUn(valor1);
			retorno = ("Ochenta y "+ mostrar);
			}else {
				retorno = "Ochenta";
			}
			
		}else if(x >= 90 && x<= 99) {
			if(x!=90) {
				
			
			valor1 = x%10;
			mostrar = buscarUn(valor1);
			retorno = ("Noventa y "+ mostrar);
			}else {
				retorno = "Noventa";
			}
		}else if (x>= 70 && x <80) {
			if(x!=70) {
				valor1 = x%10;
				mostrar = buscarUn(valor1);
				retorno = "Setenta y "+ mostrar;
				
			}else {
				retorno = "Setenta";
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		return retorno;
	}
	
}
