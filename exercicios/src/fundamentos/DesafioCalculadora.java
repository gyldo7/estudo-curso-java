package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		// pegar o input de 3 números do usuário
			// ler num1
			// ler num2
			// 
		// perguntar qual é a operação: +, -, *, /, %
		// fazer a operação
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a operação: +, -, *, /, % ");
		String op = entrada.next();
		
		//Lógica
		double resultado = "+".equals(op) ? num1 + num2: 0;
		resultado = "-".equals(op) ? num1 - num2: resultado;
		resultado = "*".equals(op) ? num1 * num2: resultado;
		resultado = "/".equals(op) ? num1 / num2: resultado;
		resultado = "%".equals(op) ? num1 % num2: resultado;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		entrada.close();
		
		}

}
