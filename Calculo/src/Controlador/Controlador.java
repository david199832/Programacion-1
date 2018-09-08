package Controlador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.io.*;

import Modelo.Calcular;



public class Controlador {

	 private static final NumberFormat DoubleFormat = null;

	public static void main(String[] args) throws IOException, Except {
	      int error = 1;
	      do {
	          try {
	              Calcular CreditoCuotas = new
	              Calcular(Input( "Total Credito" ),
	              Input( "Cuota ( Credito > Cuota > 0 )" ),
	              Input( "Tasa de Interes ( 0 - 100 )" ),
	              ( int )Input( "Mes ( 1 - 12 )" ),
	              ( int )Input( "Anyo ( => 2006 )" ),
	              ( int )Input( "Periodo de Tiempo ( en Anyos => 1 )" ) );
	              CreditoCuotas.checkEntradas();
	              CreditoCuotas.printHeader();

	              do {
	                  Object amortiz = null;
					CreditoCuotas.resultados(amortiz, amortiz);
	              } while ( CreditoCuotas.resto > 0.0 );
	              error = 0;
	          }
	          catch ( NumberFormatException e ) {
	              System.out.println( "Por Favor Hagalo Bien!\n" +
	              "Por Favor, intentelo Nuevamente.\n" +
	              "===============================\n\n" );
	          }
	      } while (error == 1);
	  }

	  public static double Input( String s ) throws IOException,
	    NumberFormatException {
	    BufferedReader Input = new BufferedReader (
	      new InputStreamReader( System.in ));
	      System.out.print( "Por favor ingrese " + s );
	      String InputString = Input.readLine();
	      return Double.parseDouble( InputString );
	  }

	  public void printHeader() {
	    Object tasa = null;
		Object credito = null;
		String tiempo = null;
		String mes = null;
		String anyo = null;
		System.out.println("\n\nCalculo de Tasa de Amortizacion con "
	        + "Cuotas de Igual Valor\n" +
	        "Tasa nominal: \t" + DoubleFormat.format( tasa ) +
	        "%\tCredito Inicial: " + DoubleFormat.format( credito ) +
	        " EUR\n" + "Tiempo: \t\t" + tiempo +
	        " Anyo(s)\tInicio: \t" + mes + "/" + anyo + "\n\n" +
	        "Mes" + "\t" + "Cuota"+"\t\t" + "Intereses" +
	        "\t\t" + "Amortizacion" + "\t\t" + "Resto");
	  }

	  public void print() {
	    Object cuota = null;
		Object intereses = null;
		Object resto = null;
		Object amortiz = null;
		int mes = 10;
		String anyo = null;
		if (mes >= 10 ) {
	        System.out.println( mes + "." + anyo + "\t\t" +
	            DoubleFormat.format( cuota ) + " EUR\t\t" +
	            DoubleFormat.format( intereses ) + " EUR\t\t" +
	            DoubleFormat.format( amortiz ) + " EUR\t\t" +
	            DoubleFormat.format( resto ) + " EUR");
	    } else {
	        System.out.println(" " + mes + "." + anyo + "\t\t" +
	            DoubleFormat.format( cuota ) + " EUR\t\t" +
	            DoubleFormat.format( intereses ) + " EUR\t\t" +
	            DoubleFormat.format( amortiz ) + " EUR\t\t" +
	            DoubleFormat.format( resto ) + " EUR");
	    }
	  }

	  public void resultados(double ratenSUM, double zins) {
	      double zinsen = 0;
		int monat = 0;
		if (zinsen != 0.0)
	        monat++;
	      int tilgungSUM = 0;
		int mes = 0;
		if (mes > 12) {
	        mes = 1;
	        int anyo = 0;
			anyo++;
	        Object amortizSUM = null;
			Object interesSUM = null;
			Object cuotaSUM = null;
			System.out.println("Summen: \t" +
	        DoubleFormat.format( cuotaSUM ) + " EUR\t\t" +
	        DoubleFormat.format( interesSUM ) + " EUR\t\t" +
	        DoubleFormat.format( amortizSUM ) + " EUR\t\t p.a.\n\n" +
	        "Zahlmonat" + "\t" + "Rate"+"\t\t" + "Zinsen" +
	        "\t\t" + "Tilgung" + "\t\t" + "Rest");
	ratenSUM = zinsen = tilgungSUM = 0;
	      }

	double resto = 0;
	// zinsen = (int)(rest * zins / 12.0 + 0.5) / 100.0;
	zinsen = (int)(resto * zins) / 1200.0;
	double rate = 0;
	double tilgung = rate - zinsen;
	resto = resto - tilgung;
	ratenSUM += rate;
	zinsen += zinsen;
	tilgungSUM += tilgung;
	if (resto > 0.0) {
	print();
	      } else {
	System.out.println("Summen: \t" +
	DoubleFormat.format(ratenSUM) + " EUR\t\t" +
	DoubleFormat.format(zinsen) + " EUR\t\t" +
	DoubleFormat.format(tilgungSUM) + " EUR\t\t p.a.\n\n");
	      }
	}

	public void checkEntradas() throws Except {
	      double credito = 0;
		if(credito <= 0.0)
	throw new Except("\n\nSie sollten einen sinnvollen Kredit " +
	"angeben!\nBitte versuchen Sie nochmal.\n" +
	"=======================================\n\n");
	      double rate = 0;
		if(credito <= rate)
	throw new Except("\n\nSie sollten eine sinnvolle Rate " +
	"angeben!\nBitte versuchen Sie nochmal.\n" +
	"======================================\n\n");
	      double zins = 0;
		if(zins <= 0.0 || zins >= 100.0)
	throw new Except("\n\nSie sollten einen sinnvollen Zinssatz " +
	"angeben!\nPor Favor Intente de nuevo.\n" +
	"=========================================\n\n");
	      int monat = 0;
		int jahr = 0;
		if(monat < 0 || monat > 12 || jahr < 2006)
	throw new Except("\n\nDebe Ingresar un Valor Correcto Para Fecha" +
	"!\nPor Favor Intente de nuevo.\n" +
	"==========================================\n\n");
	      int zeit = 0;
		if(zeit <= 0)
	throw new Except("\n\nDebe Ingresar un Valor Correcto Para " +
	"Tiempo!\nPor Favor Intente de nuevo.\n" +
	"=========================================\n\n");
	}
	}

	class Except extends Exception {
	private String s;

	public Except(String e) {
	s = e;
	}

	public String toString() {
	return s;
	    }
	  }

