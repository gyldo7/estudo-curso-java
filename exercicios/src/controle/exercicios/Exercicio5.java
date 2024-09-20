package controle.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		// Refatorar o exercício 04, utilizando a estrutura switch.
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int qtdDivisiveis = 0;
		boolean eDivisivel;
		
		System.out.println("Informe um número inteiro: ");
		int numero = entrada.nextInt();
		
		if(numero >= 2){
				
			for(int i = 1; i <= numero; i++) {
				eDivisivel = (numero % i == 0);
				
				if (eDivisivel) {
					qtdDivisiveis++;
				}
				
				if(qtdDivisiveis >= 3){
					break;
				}
			}
			
			switch (qtdDivisiveis) {
			case 2: 
				System.out.println(numero + " é primo.");break;
			default: 
				System.out.println(numero + " não é primo.");
			}
			
		} else {
			System.out.println(numero + "não é primo.");
		}
		
		entrada.close();
		
		// Resposta professor - https://github.com/cod3rcursos/fundamentos-programacao-java/blob/master/CursoJavaExercicios/src/controle/Exercicio5.java
		
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

		switch (contadorDeDivisores) {

		case 0:
			System.out.println("O numero " + numero + " é um numero primo.");
			break;

		default:
			System.out.println("O numero " + numero + "  não é um numero primo.");

		}

		scanner.close(); 
	    */
		 
	}
}
