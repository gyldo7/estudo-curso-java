package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (°F-32) * 5/9 = °C
		
		final double AJUSTE = 32.0;
		final double FATOR = 5.0/9.0;
		double temperaturaFihrenheit = 86.0;
		
		double temperaturaCelcius = (temperaturaFihrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + temperaturaCelcius + "°C."); // alt + setas para cima e para baixo move a linha do código;
		
		temperaturaFihrenheit = 150.0;
		temperaturaCelcius = (temperaturaFihrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + temperaturaCelcius + "°C."); // alt + setas para cima e para baixo move a linha do código;

		
		
	}

}
