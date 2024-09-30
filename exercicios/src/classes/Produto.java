package classes;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto(){ // construtor padrão de forma explicta;
		
	}
	
	Produto(String nomeInicial){ // modificando o construtor padrão
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	// Em java eu posso ter 2 métodos como nomes iguais, apenas tenho que ter argumentos diferentes
	double precoComDesconto(){
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente){
		return preco * (1 - desconto + descontoDoGerente);
	}

}
