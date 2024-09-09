package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		// Tipos primitivos não tem o operador ".", métodos.
		
		String s = "Bom dia X"; // String não é um tipo primitivo em java;
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		System.out.println("Gildo".toUpperCase());
		
		String x = "Jose".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X" // concatenação de metódos que retorna uma string
				.replace("X", "Gui")
				.toUpperCase().concat("!!!");
		System.out.println(y);
		
		
	}

}
