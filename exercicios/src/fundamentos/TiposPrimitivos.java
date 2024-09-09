package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// Em java temos 8 tipos primitivos de dados.
		
		/* Inteiros
		 	* byte - 1 byte, -128 a 127
		 	* short - 2 bytes
		 	* int - 3 bytes
		 	* long - 4 bytes
		 * Flutuantes
		 	* float - 4 byte
		 	* double - 8 bytes
		 * 
		 * char - armazena um caractere, delimitado por aspas simples.
		 * 
		 * boolean - true ou false
		 * 
		 * 
		 */
		
		// Informações do funcionário
		
		// Tipos literais inteiros
		byte anosDeEmpresa = 23; // Apesar de declarar um byte, o java interpreta como int.
		short numeroDeVoos = 542; // Apesar de declarar um short, o java interpreta como int.
		int id = 56789; 
		long pontosAcumulados = 1_234_845_223; // Apesar de declarar um long, o java interpreta como int.
		
		// Tipo literal long
		long pontosAcumuladosLong = 3_234_845_223L; // O L no final é nescessário para informar ao java que a varíavel é do tipo long, já que não posso armazenar o valor declarado em um int.
		
		// Tipo literal double
		double salarioDouble = 11_445.44;
		double vendasAcumuladas = 2_991_797_103.01;
		
		
		// Tipo literal float 
		float salarioFloat = 11_445.44F; // // O F no final é nescessário para informar ao java que a varíavel é do tipo float, mesmo que o valor da variável float caiba em um double.
		
		// Tipo booleano
		boolean estaDeFerias = false;
		
		// Tipo caractere
		char status = 'A'; // só aceita um caractere
		char unicode = '\u1001'; //Representa um caractere da tabela unicode. 
		System.out.println(unicode);
		
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 364);
		
		// Números de viagens 
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salarioDouble);
		System.out.println("Férias? " + estaDeFerias);
		

	}

}
