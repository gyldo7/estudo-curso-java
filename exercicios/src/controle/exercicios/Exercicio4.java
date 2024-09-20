package controle.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		// Criar um programa que receba um número e diga se ele é um número primo.
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int qtdDivisiveis = 0;
		boolean eDivisivel;
		
		System.out.println("Informe um número inteiro: ");
		int numero = entrada.nextInt();
		
		if(numero >= 2) {
				
			for(int i = 1; i <= numero; i++) {
			
				eDivisivel = (numero % i == 0);
			
				if (eDivisivel) {
					qtdDivisiveis++;
				}
				
				if(qtdDivisiveis >= 3) {
					break;
				}
				
			}
		
		
			if(qtdDivisiveis == 2) {
				System.out.println("É primo");
			} else {
				System.out.println("Não é primo");
			}
		
		} else {
			System.out.println("Não é primo");
		}
		
					
		entrada.close();
		
		// Resposta professor - https://github.com/cod3rcursos/fundamentos-programacao-java/blob/master/CursoJavaExercicios/src/controle/Exercicio4.java
		
		/*
		 int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + numero + " é primo.");
		} else {
			System.out.println("\nO numero " + numero + " não é primo.");
		}

		scanner.close();
		 */
	}

}
