package colecoes;

import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet;


public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		Set<String> listaAprovados = new HashSet<String>(); //definindo que os dados serão do mesmo tipo
		//Set<String> listaAprovados = new HashSet<>(); é equivalente ao de cima
		// Set<String> listaAprovados = new TreeSet<>(); // coloca ordem de inserção, importar classe TreeSet
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Pedro");
		listaAprovados.add("Luca");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int num: nums) {
			System.out.println(num);
		}
		
	}

}
