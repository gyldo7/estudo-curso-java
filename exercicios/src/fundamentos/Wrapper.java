package fundamentos;

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {
		
		// wrappers => são classes dos tipos primitivos
		// para cada tipo primitivo em java existe uma versão orientada a objeto
		
		Scanner entrada = new Scanner(System.in);
		
		
		Byte b = 100; 
		Short s = 1000;
		Integer integ = 10000; //int
		Long l = 1000000L;
		Character c ='#'; // char
		Float f = 123.10F;
		Double d = 1234.5678;
		Boolean bo = true;
		

		System.out.println(b.byteValue()); // exibe o valor primitivo que está associado a classe
		
		System.out.println(s.toString()); // converte o valor para string
		
		Integer i = Integer.parseInt(entrada.next()); // converte uma string numérica em um inteiro. Aqui estou pegando uma entrada no teclado
		
		System.out.println(i * 3);
		
		bo = Boolean.parseBoolean("true"); // converte uma string para um valor boolean
		
		System.out.println(bo.toString().toUpperCase()); // converte para uma string e depois a coloca tudo em maiúscula
		
		System.out.println(c.toString());
		entrada.close();
		
	}
	
}
