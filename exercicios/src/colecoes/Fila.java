package colecoes;

import java.util.Queue;
import java.util.LinkedList;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); // lançará uma exceção (erro) caso a fila esteja cheia.
		fila.offer("Bia"); // retorna falso caso a fila esteja cheia.
		fila.offer("Carlos"); // retorna falso caso a fila esteja cheia.
		fila.offer("Daniel"); // retorna falso caso a fila esteja cheia.
		fila.offer("Rafaela"); // retorna falso caso a fila esteja cheia.
		fila.offer("Gui"); // retorna falso caso a fila esteja cheia.
		
		System.out.println(fila.peek()); // retorna o primeiro elemento da fila, não remove. Se a fila estiver vazia retorna null
		System.out.println(fila.element()); // retorna o primeiro elemento da fila, não remove. Se a fila estiver vazia retorna um erro (exceção)

		// fila.size(); // retorna o tamanho da fila
		// fila.clear(); // limpa a fila
		// fila.isEmpty(); // verificar se a fila está ou não vazia;
		// fila.contains("Bia");
		
		System.out.println(fila.poll()); // retorna o primeiro elemento da fila e remove. Retorna null se a fila estiver vazia
		System.out.println(fila.remove()); // remove o primeiro elemento da fila. Gera um erro se a fila estive vazia
	}

}
