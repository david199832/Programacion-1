package Controlador;

import java.util.Scanner;
import Modelo.Tasa;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double importe, tipo, limite = 0;
        int periodo;

        System.out.print("Introduce el importe del préstamo en pesos: ");
        importe = scanner.nextDouble();
        
        System.out.print("Introduce el porcentaje % de interés: ");
        tipo = scanner.nextDouble();
        
        System.out.print("Introduce el tiempo de amortización (años): ");
        periodo = scanner.nextInt();
        
    
        periodo *= 12; // Convertir el tiempo a meses
        tipo = tipo / 1200; // Calcular el tipo mensual

        double numerador = tipo * Math.pow(1 + tipo, periodo);
        double denominador = Math.pow(1 + tipo, periodo) - 1;
        double cuota = importe * (numerador / denominador);
        
        System.out.println(
                "\nLa cuota mensual será de " + cuota + 
                "\n¿La cuota supera tu límite? -> " + (cuota > limite));
    }
    
}