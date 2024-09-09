package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom"); // não quebra a linha
		System.out.print("dia!!\n");
		
		System.out.println("Bom");
		System.out.println("dia");
		
		System.out.printf("Mega sena: %d, %d, %d, %d, %d, %d %n", 01, 02, 03, 04, 05, 06); // string formatada. %n também quebra a linha.
		
		System.out.printf("Salario: %.1f%n", 12345.5678);
		
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in); // instanciando a classe Scanner. Pega entrada do teclado.
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine(); // Line pega todo o nome que o usuário digitar
		
		System.out.print("Digite o seu sobrenome: ");
		String sobreNome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		
		System.out.printf("%s %s tem %d anos. %n", nome, sobreNome, idade);
		
		entrada.close(); // fecha o Scanner para economizar recursos da máquina
		
		
	}

};
