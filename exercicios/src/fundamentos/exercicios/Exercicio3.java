package fundamentos.exercicios;

import java.util.Locale;
import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		// Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		Locale.setDefault(Locale.US);
		
		String pesoString = JOptionPane.showInputDialog("Entre com o seu peso: ");
		double pesoDouble = Double.parseDouble(pesoString);
		

		String alturaString = JOptionPane.showInputDialog("Entre com o sua altura: ");
		double alturaDouble = Double.parseDouble(alturaString);
		
		double  imc = pesoDouble / (Math.pow(alturaDouble, 2));
		
		System.out.printf("O seu IMC é %.2f", imc);
		
		
		
		
		
		
	}
}
