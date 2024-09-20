package controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe uma nota válida: ");
		
		int contador = 0;
		double somaNotas = 0;
		double notas = 0;
		
		while(notas != -1.0) {
			 notas = entrada.nextDouble();
			 if(notas > 10 || (notas < 0 && notas != -1)) System.out.println("Nota inválida. Informe uma nota válida");
			 else {
				 if(notas != -1) {
				 contador++;
				 somaNotas += notas;
				 }
			 }
			 
		}
		
		double media = somaNotas / contador;
		System.out.println("A média da turma é: " + media + "\n");
		
		//=================================================
		
		System.out.print("Resposta do professor\n\n");
		
		int quantidadeDeNotas =0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Informe a nota (ou -1 para sair): ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			} else {
				System.out.println("Nota inválida!!!");
			}
			
		}
		
		double media1 = total / quantidadeDeNotas;
		System.out.println("Média = " + media1);
		entrada.close();
	}

}
