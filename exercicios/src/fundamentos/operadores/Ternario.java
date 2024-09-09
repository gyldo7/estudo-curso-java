package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 7.6;
		
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em recuperação."; // Três operando, por isso operador ternário.
		
		System.out.println("O aluno está " + resultadoFinal);
	}

}
