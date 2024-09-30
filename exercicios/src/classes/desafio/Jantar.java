package classes.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		// instanciar uma pessoa
		Pessoa p = new Pessoa("João", 99.8);
		// instanciar duas comidas
		Comida c1 = new Comida("Arroz", 0.180);
		Comida c2 = new Comida("Feijão", 0.300);
		
		// apresentar um pessoa
		System.out.println(p.apresentar());
		// fazer a pessoa comer a comida
		p.comer(c1);
		
		// apresentar um pessoa
		System.out.println(p.apresentar());
		// fazer a pessoa comer a comida
		p.comer(c2);
		
		System.out.println(p.apresentar());
	
		
	}

}
