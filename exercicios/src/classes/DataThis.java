package classes;

public class DataThis {
	// constantes é obrigatório a inicialização de um valor, poderá inicializá-la no construtor
	
	// padrão variáveis globais inicialização
		// byte, short, int, long => 0
		// float, double => 0.0
		// boolean => false
		// char => '\u00000'
	// padrão objeto inicialização
		// null
	
	// variáveis locais é obrigatório inicializar a variável com algum valor
	
	int dia;
	int mes;
	int ano;
	
	DataThis(){
		dia = 1; // facultativo
		mes = 1;  // facultativo
		ano = 1970; // facultativo
	}

	// this só posso apenas utilizar em membros de instancia
	
	DataThis(int dia, int mes, int ano){
		dia = this.dia;
		mes = this.mes;
		ano = this.ano;
		
		// this(1, 1, 1970) // posso usar o this dentro de um contrutor para chamar outro construtor
	}
	
	String obterDataFormatada() {
		String data = String.format("%d/%d/%d", dia, mes, ano);
		return data;
	}
	
	
	 String obterDataFormatada1() {
		String diaStr = Integer.toString(dia);
		String mesStr = Integer.toString(mes);
		String anoStr = Integer.toString(ano);
		
		String data = diaStr + "/" + mesStr + "/" + anoStr;
		return data;
	 }
	 
	 String obterDataFormatada2() {
		String diaStr = String.valueOf(dia);
		String mesStr = String.valueOf(mes);
		String anoStr = String.valueOf(ano);
		
		String data = diaStr + "/" + mesStr + "/" + anoStr;
		return data;
	 }
	 
	 
	 void imprimirDataFormatada() {
		 System.out.printf("%d/%d/%d", dia, mes, ano);
		// System.out.printf("%d/%d/%d", dia, mes, ano); // posso usar o this para acessar um método.
		 
	 }
	 
	 /*
	  void imprimirDataFormatada() {
		 System.out.println(imprimirDataFormatada);
	 }
	 */

}
