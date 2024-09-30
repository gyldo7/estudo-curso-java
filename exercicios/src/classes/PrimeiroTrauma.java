package classes;

public class PrimeiroTrauma {
	
	int a = 3; // como não possui a palavra reservada static a variável "a" é uma variável de instancia. Para acessá-la 
	           // dentro de um método de classe (possui a palavra reservada static) devo instaciá-la.
	
	static int b = 4; // aqui temos uma variável de classe, posso acessá-la normalmente dentro de um método de classe.

	public static void main(String[] args) {
	
	PrimeiroTrauma p = new PrimeiroTrauma();
	System.out.println(p.a);
	
	System.out.println(b);
	System.out.println(PrimeiroTrauma.b);
		
	}
	

}
