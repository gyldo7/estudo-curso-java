package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		// Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
		// Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta.
		
		Locale.setDefault(Locale.US);
		
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o valor de a (a diferente de 0): ");
		double a = entrada.nextDouble();
		
		System.out.println("Entre com o valor de b: ");
		double b = entrada.nextDouble();
		
		System.out.println("Entre com o valor de c: ");
		double c = entrada.nextDouble();
		
		double delta = b * b - 4 * a * c;
		System.out.println("Delta = " + delta);
		
		double x1 = (-b + Math.sqrt(delta) / (2 * a));
		
		double x2 = (-b - Math.sqrt(delta) / (2 * a));
		
		System.out.printf("O valor de x1 é %.2f e x2 é %.2f.", x1, x2);
		
		
		
		entrada.close();
		
		
		
		
	}
}
