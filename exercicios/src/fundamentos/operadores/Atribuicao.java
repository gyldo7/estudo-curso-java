package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; //c = c + b;
		c -= b; // c = c - b;
		c *= b; // c = c * b;
		c /= b;	// c = c / b;
		c %= a; // c = c % b
		
		c++; // c = c + 1
		
		System.out.println(a);
		a %= 2; // c = c % 2; 0 é par ou 1 é ímpar
		System.out.println(a);
		
		
		
		
		
	}
}
