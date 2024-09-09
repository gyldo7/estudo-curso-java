package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; //conversão implícita
		System.out.println(a);
		
		float b = (float) 1.0; // conversão explícita usado cansting, conversão explícita pode haver perda de informação
		System.out.println(b);
		
		float ba = (float) 1.1234567891011; // aqui houve perda de informação, o valor 1.1234567891011 não cabe em um float
		System.out.println(ba);
		
		int c = 4;
		// byte d = c; // erro, pois o java não analiza o valor, mais o tipo. o tipo int não cabe no byte.
		byte d = (byte) c; // forma correta. Lembrando que se eu passar um valor para c maior que 127 ou menor que -128 pode retornar um valor inesperado para d.
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
		
		// Recomendação usar int e double para valores númericos
	}

}
