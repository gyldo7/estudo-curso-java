package controle.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		
		/*
		 Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado. 
		 Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.
		*/
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int numeroEscolhido = 72;
		System.out.println("Você tem 10 tentativas para adivinhar um número que foi escolhido entre 0 e 100:");
		
		int numeroTentativas = 10;
		int numeroInformado;
		
		String nomeTentativas = "tentativas";
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf(" %dª tentativa: ", i);
			numeroInformado = entrada.nextInt();
			
			if(i == 10) {
				nomeTentativas = nomeTentativas.replace("tentativas", "tentativa");
			}

			if (numeroInformado == numeroEscolhido) {
				System.out.println("Parabéns você acertou!!! O numero escolhido é " + numeroEscolhido + ". ");
				break;
			} else if (numeroInformado < numeroEscolhido) {
				System.out.println("Você errou!!! o número escolhido é maior que " + numeroInformado + ".");
				System.out.printf("Você ainda tem %d %s.\n\n", (numeroTentativas - i), nomeTentativas );
			} else if (numeroInformado > numeroEscolhido) {
				System.out.println("Você errou!!! o número escolhido é menor que " + numeroInformado);
				System.out.printf("Você ainda tem %d %s.\n\n", (numeroTentativas - i), nomeTentativas );
			}
			
			
		}
		
		entrada.close();
		
		// Resposta professor - https://github.com/cod3rcursos/fundamentos-programacao-java/blob/master/CursoJavaExercicios/src/controle/Exercicio6.java
		
		/*
		  Scanner scanner = new Scanner(System.in);
		  int continuar;
		  int numeroSorteado;
		  int tentativas;
		  int numero;
		
		  do {
		   System.out.println("Sorteando numero entre 0 e 100...\n");
		   Random numeroAleatorio = new Random();
		   numeroSorteado = numeroAleatorio.nextInt(101);
		
		   System.out.println("Começou o jogo! Sera que consegue me vencer?");
		   tentativas = 0;
		
		   do {
		    tentativas++;
		    System.out.printf("Tentativa %d: ", tentativas);
		    numero = scanner.nextInt();
		
		    if (numero > numeroSorteado) {
		
		     System.out.printf("\nO numero sorteado e menor que %d\n\n", numero);
		
		    } else if (numero < numeroSorteado) {
		
		     System.out.printf("\nO numero sorteado e maior que %d\n\n", numero);
		
		    } else {
		
		     System.out.printf("\nParabens! Voce acertou o numero em %d tentativas!\n\n", tentativas);
		     break;
		    }
		
		   } while (tentativas != 10);
		
		   System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
		   continuar = scanner.nextInt();
		
		  } while (continuar != 0);
		
		  scanner.close();
	  	 
		 */
	}

}
