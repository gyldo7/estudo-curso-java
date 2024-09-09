package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2)); // método para obter o caractere do índice especificado
		
		String s = "Boa tarde"; // string é imutável
		
		System.out.println(s.concat("!!!")); // método para concatenar strings
		System.out.println(s + "!!!"); // outra forma de concatenar strings
		System.out.println(s.startsWith("Boa")); // verifica se a string começa com o caractere/caracteres
		System.out.println(s.startsWith("boa")); // false
		System.out.println(s.toLowerCase().startsWith("boa")); // true
		System.out.println(s.length()); // retorna o número de caracteres da string
		System.out.println(s.endsWith("tarde")); // verifica se a string termina com os caracteres especificado
		System.out.println(s.toUpperCase().endsWith("TARDE")); //true
		System.out.println(s.equals("boa tarde")); // verifica se a string fornecida é igual a string s
		System.out.println(s.equalsIgnoreCase("Boa Tarde")); // Verifica se a string fornecida é igual a string s ignorando se é maiúscula ou minúscula
		System.out.println(s.contains("tar")); // verifica se a string s contém a string especificada
		System.out.println(s.indexOf("tarde")); // retorna o índice da string fornecida;
		System.out.println(s.substring(4)); // retorna uma string a contar do índice fornecido
		System.out.println(s.substring(4, 9)); // retorna uma string do intervalo fornecido, 
		
		var nome = "Pedro"; // inferência
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\n\n"); // \n quebra a linha
		
		System.out.printf("Nome: %s %s tem %d e ganha %f", nome, sobrenome, idade, salario); // %s => string, %d => inteiros, %f => ponto flutuante,
		// printf => não quebra a linha, usar \n
		System.out.printf("\nNome: %s %s tem %d e ganha %.2f", nome, sobrenome, idade, salario); // .2f => limita as casas decimais, neste caso duas
		
		String frase = String.format("\nNome: %s %s tem %d e ganha %.2f", nome, sobrenome, idade, salario); // mesma formatação do printf
		System.out.println(frase);
		
		
	}

}
