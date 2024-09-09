package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		// Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		// °F = (°C * 9/5) + 32 
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		final double AJUSTE = 32;
		final double FATOR = 9.0 / 5.0;
		
		System.out.println("Entre com a temperatura em Celcius: ");
		double tempC = entrada.nextDouble();
		
		double tempF = (tempC * FATOR) + AJUSTE;
		System.out.printf("%.1f°C equivale a %.1f°F.", tempC, tempF);
		
		entrada.close();
	
	}

}
