package fundamentos;

public class Inferencia {
	
	public static void main(String[] args){
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5; // Ao usar o var o java vai inferir o valor pelo tipo da variável. Recurso adicionado com o java 10.
					 // Ao usar o var preciso atribuir o valor da variável já na sua declaração.
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		double d;
		d = 123.65;
		System.out.println(d);
	}

}
