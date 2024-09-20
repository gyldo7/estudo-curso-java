package controle;

import java.util.Locale;
import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media <= 10.0 && media >= 7.0) {
			System.out.println("Aprovado!"); 
			System.out.println("Parabéns!");
		}
		
		if(media < 7.0 && media >= 4.5) {
			System.out.println("Recuperação");
		}
		
		if(media < 4.5 && media >= 0.0) {
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}

}
