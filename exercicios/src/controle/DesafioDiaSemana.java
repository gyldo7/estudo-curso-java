package controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		// Domingo -> 1
		// Quarta -> 4
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o nome do dia: ");
		String diaSemana = entrada.next();
		
		if(diaSemana.equalsIgnoreCase("domingo")) {
			System.out.println(1 + "-" + diaSemana);
		} else if(diaSemana.equalsIgnoreCase("Segunda")) {
				System.out.println(2 + "-" + diaSemana);
		} else if(diaSemana.equalsIgnoreCase("Terça")) {
			System.out.println(3 + "-" + diaSemana);
		} else if(diaSemana.equalsIgnoreCase("Quarta")) {
			System.out.println(4 + "-" + diaSemana);
		} else if(diaSemana.equalsIgnoreCase("Quinta")) {
			System.out.println(5 + "-" + diaSemana);
		} else if(diaSemana.equalsIgnoreCase("Sexta")) {
			System.out.println(6 + "-" + diaSemana);
	    } else if(diaSemana.equalsIgnoreCase("Sábado") || diaSemana.equalsIgnoreCase("Sabado")) {
			System.out.println(7 + "-" + diaSemana);
	    } else {
	    	System.out.println("Dia inválido!");
	    }
		
		
		entrada.close();
		
	}

}
