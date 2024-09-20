package controle.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		/*
		 Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos,
		 caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
		 */
	
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com números positivos para somá-los e informe um número negativo para sair.");
		
		double numero = 0;
		double somaNumero = 0;
		
		while(numero >= 0) {
			
			somaNumero += numero;
			System.out.printf("= "  + somaNumero + "\n");
			numero = entrada.nextDouble();
			
		}
		
		
		entrada.close();
		
		// Resposta professor - https://github.com/cod3rcursos/fundamentos-programacao-java/blob/master/CursoJavaExercicios/src/controle/Exercicio7.java
	/*
		 Scanner scanner = new Scanner(System.in);

		  int somadorDeNumeros = 0;
		  int numero = 0;

		  while (numero >= 0) {
		   System.out.println("Digite um numero inteiro (ou negativo para sair): ");
		   numero = scanner.nextInt();
		   if (numero >= 0) {
		    somadorDeNumeros += numero; // Isso é igual a somadorDeNumeros = somadorDeNumeros + numero;
		    System.out.printf("\nSoma até o momento: %d\n", somadorDeNumeros);
		   }
		  }
		  scanner.close();	
	*/	
	
	}

}
