package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1, pós-incremento
		a--; // a = a - 1, pós-decremento
		
		++b; // b = b + 1, pré-incremeno
		--b; // b = b - 1, pré-decremento
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // operador == tem preferencia em relação ao pós-incremento. Aqui ele vai comparar e depois incrementar.
										// operador pré-decremento tem preferência em relação ao operador ==
		System.out.println(a == b);
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
