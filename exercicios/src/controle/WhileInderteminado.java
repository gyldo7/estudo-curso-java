package controle;

import java.util.Locale;
import java.util.Scanner;

public class WhileInderteminado {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		String valor = "";
		
		while(valor.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			valor = entrada.next();
		}
		
		entrada.close();
	}

}
