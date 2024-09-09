package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 1000;
		System.out.println(num1.toString());
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); // convertendo um inteiro primitvo para string
		
		System.out.println("" + num2); // convertendo um valor númerico para string usando a concatenação
		System.out.println(("" + num2).length());
	}

}
