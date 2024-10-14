package arrays;

import java.util.Locale;
import java.util.Scanner;


public class DesafioArrays {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas você quer informar?");
		int qtdNotas = entrada.nextInt();
		
		// criar array
		double[] notas = new double[qtdNotas];
		
		// inserir os dados do array
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Por favor Informe a %dª nota: ", i + 1);
			notas[i] = entrada.nextDouble();
		}
		
		// somar as notas
		double somaNotas = 0;
		for(double nota: notas) {
			somaNotas += nota;
		}
		
		// calcular e mostrar a média
		double media = somaNotas / notas.length;
		System.out.printf("A média é %.2f: ", media);
		
		entrada.close();
	}

}