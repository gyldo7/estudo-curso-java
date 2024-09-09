package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159; // Declaração de uma constante
		
		double area = PI * raio * raio;
		
		System.out.println(PI * raio * raio);
		System.out.println(area);
		
		raio = 10; // Reatribuição
		area = PI * raio * raio;
		
		System.out.println("Área = " + area + "m2.");
		
		
	}

}
