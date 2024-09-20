package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "laranja";
		
		// Sem o break, ele vai executar o caso correpodente e os demais que estão abaixo dele, inclusive o default.
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei Tekki Shodan...");
		case "roxa":
			System.out.println("Sei o Heian Godan...");
		case "verde":
			System.out.println("Sei o Heian Yodan...");
		case "laranja":
			System.out.println("Sei o Heian Sadan...");
		case "vermelha":
			System.out.println("Sei o Heian Nydan...");
		case "amarela":
			System.out.println("Sei o Heian Shodan...");
		}
		
		int idade = 3;
		
		switch (idade) {
		case 3:
			System.out.println("Sabe falar");
		case 2:
			System.out.println("Sabe andar");
		case 1:
			System.out.println("Sabe respirar");
		}
		
		
	}

}
