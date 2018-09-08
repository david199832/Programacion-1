package Modelo;

import java.text.DecimalFormat;
import java.io.*;

public class Calcular {
 
  public DecimalFormat DoubleFormat = new DecimalFormat("0.00");
 
  
  public double credito;
  public double tasa;
  public double cuota;
  public double intereses;
  public static double amortiz;
  public double resto;
  public double cuotaSUM;
  public double interesSUM;
  public double amortizSUM;
  public int anyo;
  public int mes;
  public int tiempo;
 
  public Calcular(double startCredito, double laCuota,
      double tasaSatz, int startMes, int startAnyo,
      int laufTiempo) {
      credito = resto = startCredito;
      tiempo = laufTiempo;
      tasa = tasaSatz;
      cuota = laCuota;
      mes = startMes;
      anyo = startAnyo;
      intereses = amortiz = 0.0;
  }

public void checkEntradas() {
	// TODO Auto-generated method stub
	
}

public void printHeader() {
	// TODO Auto-generated method stub
	
}

public void resultados(Object amortiz2, Object amortiz3) {
	// TODO Auto-generated method stub
	
}
}