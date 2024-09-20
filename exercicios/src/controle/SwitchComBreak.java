package controle;

import java.util.Locale;
import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		System.out.println("Informe a nota: ");
		int nota = entrada.nextInt();
		
		
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7: { // posso colocar chaves para limitar o bloco de código
			conceito = "B";
			break;
		}
		case 6: 
		case 5:
			conceito = "C";
			break;
		case 4: 
		case 3:
			conceito = "D";
			break;
		default:
			conceito = "não informado";
		}
		
		System.out.println("Conceito é " + conceito);
		entrada.close();
	}

}
