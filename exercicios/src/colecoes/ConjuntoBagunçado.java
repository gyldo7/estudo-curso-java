package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {
	
	@SuppressWarnings({ "unchecked", "rawtypes" }) // remove as advertências do eclipse
	public static void main(String[] args) {
		
		// coleções não aceita tipos primitivos
		
		// set
			// não ordenado (por padrão)
			// pode ser ordenado
			// pode ser heterogêneo(tipos de dados)
			// pode ser homogêneo(tipos de dados)
			// não indexado	
			// não aceita repetição
		// list
			// indexada
			// é ordenada
			// aceita repetição
			//pode ser heterogêneo(tipos de dados)
			// pode ser homogêneo(tipos de dados)
			// aceita objeto duplicados
		// map
			// chave: valor
			// chave não aceita repetição
			// valor aceita repetição
		// queue
			// implementa a fila
			// first in first out(FIFO)
		//stack
			// implementa a pilha
			// last in first out (LIFO)
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // o java converte double para Double já que as colections não aceita tipos primitivos
		conjunto.add(true); // boolean para Boolean
		conjunto.add("Teste");
		conjunto.add(1); // int para Integer
		conjunto.add('x'); // char para Caractere
		
		System.out.println(conjunto);
		
		System.out.println("Tamanho: " + conjunto.size()); // retorna o tamanho do conjunto
		System.out.println(conjunto.remove("Teste")); // remove o elemento => retorna true. O elemento não existe => retorna falso.
		System.out.println(conjunto.size());
		System.out.println(conjunto.contains(1)); // verifica se o elemento está ou não no conjunto, retorna true ou false
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		//conjunto.addAll(nums); // União entre dois conjuntos
		conjunto.retainAll(nums); // interseção entre dois conjuntos
		System.out.println(conjunto);
		
		conjunto.clear(); // limpa o conjunto
		System.out.println(conjunto);
		
		
		
	}

}
