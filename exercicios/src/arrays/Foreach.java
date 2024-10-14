package arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		
		for(double nota: notas) { // para cada iteração nota irá receber(atribuir e retribuição) um elemento do array.
			//nota = 9.9 => primeira iteração => atribuição
			//nota = 8.7 => segunda iteração => retribuição
			//nota = 7.2 => terceira iteração => retribuição
			//nota = 9.4 => quarta iteração => retribuição
			System.out.println(nota);
		}
		
		
	}

}
