package fundamentos.exercicios;

import java.util.Locale;
import javax.swing.JOptionPane;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
		Locale.setDefault(Locale.US);
		String valorString = JOptionPane.showInputDialog("Entre com um valor");
		double valorDouble = Double.parseDouble(valorString);
		
		double valorDoubleAoQuadrado = Math.pow(valorDouble, 2);
		double valorDoubleAoCubo = Math.pow(valorDouble, 3);
		
		System.out.printf("O valor ao quadrado de %.2f é %.2f\n", valorDouble, valorDoubleAoQuadrado );
		System.out.printf("O valor ao cubo de %.2f é %.2f", valorDouble, valorDoubleAoCubo);
		
	}

}
