package controle;

public class For1 {

	public static void main(String[] args) {
		
		for(int contador = 0;contador <= 10; contador += 2) {
			System.out.printf("%d - Bom dia!\n", contador);
		}
	
		int x = 2;
		for(;x < 5;) {
			System.out.println("x = " + x);
			x++;
		}
		
		/* Laço infinito
		for(;true;) {
			System.out.println("Fim");
		}
		
		for(;;){
			System.out.println("Fim");
		}
		*/
	}
}
