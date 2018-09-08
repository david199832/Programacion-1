package Controlador;

import java.util.Scanner;
import Modelo.Tasa;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double importe, tipo, limite = 0;
        int periodo;

        System.out.print("Introduce el importe del pr�stamo en pesos: ");
        importe = scanner.nextDouble();
        
        System.out.print("Introduce el porcentaje % de inter�s: ");
        tipo = scanner.nextDouble();
        
        System.out.print("Introduce el tiempo de amortizaci�n (a�os): ");
        periodo = scanner.nextInt();
        
    
        periodo *= 12; // Convertir el tiempo a meses
        tipo = tipo / 1200; // Calcular el tipo mensual

        double numerador = tipo * Math.pow(1 + tipo, periodo);
        double denominador = Math.pow(1 + tipo, periodo) - 1;
        double cuota = importe * (numerador / denominador);
        
        System.out.println(
                "\nLa cuota mensual ser� de " + cuota + 
                "\n�La cuota supera tu l�mite? -> " + (cuota > limite));
    }
    
}