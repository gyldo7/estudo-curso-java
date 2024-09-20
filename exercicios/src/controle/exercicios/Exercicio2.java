package controle.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		// Criar um programa informa se o ano atual é um ano bissexto;
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um ano: ");
		int ano = entrada.nextInt();
		
		if((ano % 4 == 0 && ano % 100 != 0) || (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0)){
			System.out.printf("O ano %d é bissexto!!", ano);
		} else {
			System.out.printf("O ano %d não é bissexto!!", ano);
		}
		
		entrada.close();
		
		// Resposta professor - https://github.com/cod3rcursos/fundamentos-programacao-java/blob/master/CursoJavaExercicios/src/controle/Exercicio2.java
		
		/*
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int ano = scanner.nextInt();

		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0  || ano % 400 == 0);

		if (bissexto == true) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		scanner.close();
		 */
		
	}

}
