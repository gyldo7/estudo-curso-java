package controle;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
	
		// if(...) única sentença; ou {}
		// while(...) única sentença ou {}
		// for(...;...;...) única sentença ou {}
		
		// do única sentença; ou {} while(...); => É a única que termina com ponto e vírgula
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in); 
		
		String texto = "";
		
		do {
			System.out.println("Você precisa digitar as palavras mágicas...");
			System.out.println("Quer sair:");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado");
		
		entrada.close();
		
	}

}
