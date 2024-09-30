package classes;

import java.util.Locale;

public class DesafioProdutoTeste {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
	
		DesafioProduto p1 = new DesafioProduto("Notebook", 4500);
		DesafioProduto.desconto = 0.5;
		
		System.out.println(p1.ValorProduto());
		
	}
}
