package classes;

public class Usuario {
	
	String nome;
	String email;
	// 6wpK5_P3!bqH/s*
	
	public boolean equals(Object objeto) {
		if(objeto instanceof Usuario) { // verifica se objeto é uma instancia de Usuario
			Usuario outro = (Usuario) objeto; // convertendo Object para o objeto Usuario
					
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}
	
	// O hashcode será abordado em outra aula
}
