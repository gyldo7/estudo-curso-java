package controle.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		// Crie um programa que recebe 10 valores e ao final imprima o maior número.
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		int numeroMaior = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.printf("Entre com o %d° número: ", i);
			int valor = entrada.nextInt();
			
			if(valor > numeroMaior) {
				numeroMaior = valor;
			}
			
		}
		
		System.out.printf(" O maior número é %d.", numeroMaior);
		
		entrada.close();
		
		// Resposta professor - https://github.com/cod3rcursos/fundamentos-programacao-java/blob/master/CursoJavaExercicios/src/controle/Exercicio9.java
		
		/*
		 
		Scanner scanner = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 0;

		do {
			System.out.println("\nDigite um numero: ");
			int valor = scanner.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}

			contador++;
		} while (contador != 10);

		System.out.printf("O maior valor foi: " + maiorValor);
		scanner.close();
		 */
	}
}
