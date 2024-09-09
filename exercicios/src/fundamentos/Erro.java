package fundamentos;

import java.util.Scanner;

public class Erro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		 
	    System.out.println("Qual a sua idade?");
	    int idade = teclado.nextInt();
	    System.out.println("Qual o seu nome?");
	    String nome = teclado.nextLine();
	    System.out.println("Qual o seu sobrenome?");
	    String sobrenome = teclado.nextLine();
	 
	    teclado.close();

	}

}
