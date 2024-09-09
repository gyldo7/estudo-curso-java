package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprarTV50 = trabalho1 && trabalho2;
		boolean comprarTV32 = trabalho1 ^ trabalho2;
		
		boolean tomarSorvete = comprarTV50 || comprarTV32;
		
		boolean maisSaudavel = !tomarSorvete;
		
		
		
		System.out.println("Trabalho1 deu certo? " + trabalho1);
		System.out.println("Trabalho2 deu certo? " + trabalho2);
		
		System.out.println("Comprou a TV de 50 polegadas? " + comprarTV50);
		System.out.println("Comprou a TV de 32 polegadas? " + comprarTV32);
		
		System.out.println("A família tomou sorvete? " + tomarSorvete);
		System.out.println("A família ficou mais saudável? " + maisSaudavel);
		
		// Resposta professor
		
		/* 
		 * boolean trabalho1 = false;
		 * boolean trabalho2 = false;
		 * 
		 * boolean comprouTV50 = trabalho1 && trabalho2;
		 * boolean comprouTV32 = trabalho1 ^ trabalho2;
		 * boolean comprouSorvete = trabalho1 || trabalho2;
		 * 
		 *
		 * boolean maisSaudavel = !comprouSorvete; // Operador unário
		 * 
		 * System.out.Prinln("Comprou TV 50\"? " + ComprouTV50); \ => Escape => serve para exibir as duplas dentro de uma String
		 * System.out.Prinln("Comprou TV 32\"? " + ComprouTV32); 
		 * System.out.Prinln("Comprou sorvete? " + ComprouSorvete); 
		 * System.out.Prinln("Mais saudável? " + maisSaudavel);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	}
}
