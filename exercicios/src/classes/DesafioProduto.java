package classes;

public class DesafioProduto {
	
	// Atributos
	String nomeProduto;
	double preco;
	static double desconto = 0.25;
	
	// Construtor Padrão
	DesafioProduto() {
		
	}
	
	// Redefinido Constrtutor
	DesafioProduto(String nomeProduroInicial, double precoInicial) {
		nomeProduto = nomeProduroInicial;
		preco = precoInicial;
	}
	
	// Método
	
	double ValorProduto() {
		
		return preco * (1 - desconto);
	}
	
	

}
