package fundamentos.operadores;

import java.util.Locale;

public class Logico {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // and
		System.out.println(condicao1 || condicao2); // or, ou inclusivo
		System.out.println(condicao1 ^ condicao2); // xor, ou exclusivo
		System.out.println(!condicao1); 
		System.out.println(!condicao2);
		System.out.println(!!condicao2);
		
	}

}
