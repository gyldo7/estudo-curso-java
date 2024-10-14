package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		// list
			// indexada
			// é ordenada
			// aceita repetição
			// pode ser heterogêneo(tipos de dados)
			// pode ser homogêneo(tipos de dados)
			// aceita objeto duplicados
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3).nome); // acessar pelo índice
		
		System.out.println(">>>>> " + lista.remove(1)); // removendo pelo índice, retorna o objeto
		System.out.println(lista.remove(new Usuario("Manu"))); // removendo pelo objeto, retorna um boolean
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		
		for(Usuario u: lista) {
			System.out.println(u.toString());
		}
		
		
	}

}
