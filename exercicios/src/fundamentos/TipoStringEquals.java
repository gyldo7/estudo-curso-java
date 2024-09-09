package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		System.out.println("2" == "2"); // não usar o operador == para comparar strings
		
		String s1 = new String("2"); // é o mesmo que String s1 = "2" 
		System.out.println("2" == s1);
		
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine(); // o next() remove os espaços em branco, já o nextLine() não remove
		System.out.println(s2);
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim())); // trim remove os espaços em branco
		
		
		
		entrada.close();
	}

}
