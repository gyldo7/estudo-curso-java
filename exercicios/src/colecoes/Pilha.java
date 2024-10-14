package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Príncipe"); // retorna um boolean
		livros.push("Don Quixote");// se a pilha tiver um limite, pode retorna um erro se a pilha estiver cheia
		livros.push("O Hobbit"); //
		livros.add("A revolução dos Bichos");
		livros.add("Seja Foda");
	
		System.out.println(livros.peek()); // retorna o último elemento adicionado
		System.out.println(livros.element()); // retorna o último elemento adicionado
		
		System.out.println(livros.poll()); // remove o último elemento da pilha. Caso vazia retorna null
		System.out.println(livros.remove()); // remove o último elemento da pilha. Caso vazia gera uma exceção
		System.out.println(livros.pop()); // remove o último elemento da pilha. Caso vazia gera uma exceção
		
		livros.size();
		//livros.clear();
		livros.isEmpty();
		livros.contains("Don Quixote");
		
		for(String livro: livros) {
			System.out.println(livro);
		}
	
	}

}
