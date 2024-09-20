package controle.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		// 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro:");
		int numero = entrada.nextInt();
		
		if(numero <= 10 && numero >= 0) {
			System.out.printf("O número %d está entre 0 e 10. ", numero);
			
			if(numero % 2 == 0) System.out.printf(" E o número %d é par.", numero);
		    else System.out.printf(" E o número %d é ímpar.", numero);
			
		} else {
			System.out.printf("O número %d não está entre 0 e 10.", numero);
			
			if(numero % 2 == 0) System.out.printf(" E o número %d é par. ", numero);
		    else System.out.printf(" E o número %d é ímpar.", numero);
		}
		
		
		entrada.close();
		
		// Resposta professor - https://github.com/cod3rcursos/fundamentos-programacao-java/blob/master/CursoJavaExercicios/src/controle/Exercicio1.java
		
		/* 
		 
	 	Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero = scanner.nextInt();

		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("O numero " + numero + " está entre 0 e 10 e é um par.");
			} else {
				System.out.println("O numero " + numero + " está entre 0 e 10 mas não é um par.");
			}
		} else {
			System.out.println("O numero " + numero + " não está entre 0 e 10.");
		}
		scanner.close(); 
		 
		 */
	}

}
