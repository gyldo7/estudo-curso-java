package classes;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 1; // facultativo
		mes = 1;  // facultativo
		ano = 1970; // facultativo
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
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
	 }
	 
	 /*
	  void imprimirDataFormatada() {
		 System.out.println(imprimirDataFormatada);
	 }
	  */
	 
}
