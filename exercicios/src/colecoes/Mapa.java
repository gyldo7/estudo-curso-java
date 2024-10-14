package colecoes;

import java.util.Map;
import java.util.Map.Entry;

import java.util.HashMap;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Roberto"); // adiciona e sustitui caso a chave já exista;
		usuarios.put(2, "Rafaela"); // adiciona e sustitui caso a chave já exista;
		usuarios.put(3, "Rebeca"); // adiciona e sustitui caso a chave já exista;
		
		System.out.println(usuarios);
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); // retorna todas as chaves
		System.out.println(usuarios.values()); // retorna os valores
		System.out.println(usuarios.entrySet()); // retorna as chaves e os valores
		
		System.out.println(usuarios.containsKey(5));
		System.out.println(usuarios.containsValue("Rafaela"));
		
		System.out.println(usuarios.get(1)); // obtendo o valor a partir da chave
		System.out.println(usuarios.remove(1)); // remove e retorna o elemento da chave
		System.out.println(usuarios.remove(4, "Gui"));
		
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ===> ");
			System.out.println(registro.getValue());
		}
		
		
		
	}
}
