package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.	
		// formula => °C = (°F - 32) ÷ (9/5)
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Fahrenheit: ");
		double tempF = entrada.nextDouble();
		
		final double AJUSTE = 32;
		double DIVISOR = 9.0 / 5.0;
		
		double tempC = (tempF - AJUSTE) / DIVISOR;
		
		System.out.printf("%.1f°F equivale a %.1f°C.", tempF, tempC);
		
		entrada.close();
		

	}
}
