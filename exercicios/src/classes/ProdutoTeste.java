package classes;

import java.util.Locale;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		// Não é necessário importar a classe Produto.java, pois ambos estão dentro do mesmo pacote classe.
		
		// uma classe define o tipo, aqui temos a classe Produto que define o tipo Produto.
		
		//tipo  identificador/       		  nome do construtor
		Produto      p1         =       new   Produto("Notebook", 4356.89); // instanciando a classe Produto.
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto(); // Lembrar que usando o var o java consegue identificar o tipo do dado, neste caso Produto.
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto(0);
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = ((precoFinal1 + precoFinal2) / 2);
		
		System.out.printf("Média do carrinho = R$%.2f.\n", mediaCarrinho);
		
		
		
	}
}
