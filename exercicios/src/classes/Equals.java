package classes;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";
		
		System.out.println(u1==u2); // false porque os endereços de memória que os objetos apontam são diferentes
		System.out.println(u1.equals(u2)); // false => mesma coisa que o == faz para objetos
		System.out.println(u2.equals(u1)); // false
		
	}
}
