package controle.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		/*
		 Criar um programa que receba duas notas parciais, calcular a média final. 
		 Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
		 caso contrário imprime no console "Reprovado".
		*/
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		while(nota1 > 10 || nota1 < 0.0) {
			System.out.println("Nota inválida! Informe a nota correta.");
			nota1 = entrada.nextDouble();
					
		}
		
		System.out.println("Informe a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		while(nota2 > 10 || nota2 < 0.0) {
			System.out.println("Nota inválida! Informe a nota correta.");
			nota2 = entrada.nextDouble();
		}
		
		double media = (nota1 + nota2) / 2;
		
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aprovado");
		} else if (media < 7.0 && media >=4.0) {
			System.out.println("Recuperação");
		} else if (media >= 0 && media < 4.0) {
			System.out.println("Reprovado");
		} 
		
		
		entrada.close();	
		
		// Resposta professor - https://github.com/cod3rcursos/fundamentos-programacao-java/blob/master/CursoJavaExercicios/src/controle/Exercicio3.java
		
		/*
		  Scanner scanner = new Scanner(System.in);

		System.out.println("Nota Parcial 1: ");
		double nota1 = scanner.nextDouble();

		System.out.println("Nota Parcial 2: ");
		double nota2 = scanner.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("Sua média foi " + media + " e você está Aprovado.");
		} else if (media >= 4) {
			System.out.println("Sua média foi " + media + " e você está de Recuperação.");
		} else {
			System.out.println("Sua média foi " + media + " e você está Reprovado.");
		}

		scanner.close();
		 
		 */
		
	}

}
