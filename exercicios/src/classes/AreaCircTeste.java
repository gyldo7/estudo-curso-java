package classes;

import java.util.Locale;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		AreaCirc a1 = new AreaCirc(10);
		
		System.out.println(AreaCirc.PI); // como o PI é static eu posso acessá-lo pela classe.
		System.out.println(a1.area()); // como a area é um método não static eu preciso instancicar a classe para acessá-la.
		
		
	}

}
