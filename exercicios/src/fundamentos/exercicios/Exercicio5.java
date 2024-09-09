package fundamentos.exercicios;

import java.util.Locale;
import javax.swing.JOptionPane;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		 
		String baseString = JOptionPane.showInputDialog("Entre com o valor da base do triângulo:" );
		double baseDouble = Double.parseDouble(baseString);
		
		String alturaString = JOptionPane.showInputDialog("Entre com o valor da altura do triângulo: ");
		double alturaDouble = Double.parseDouble(alturaString);
		
		double areaTriangulo = (baseDouble * alturaDouble) / 2;
		System.out.printf("O valor da area do triângulo de base %.2f e altura %.2f é %.2f", baseDouble, alturaDouble, areaTriangulo);
		
	}

}
