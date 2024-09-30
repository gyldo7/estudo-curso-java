package classes;

public class DataTeste {
	
	public static void main(String[] args) {
		
		
		Data data1 = new Data();
		
		data1.dia = 24;
		data1.mes = 9;
		data1.ano = 2024;
		
		
		var data2 = new Data();
		data2.dia = 17;
		data2.mes = 9;
		data2.ano = 2018;
		
		Data data3 = new Data(1,1,1970);
		
		System.out.println(data1.obterDataFormatada());
		System.out.println(data1.obterDataFormatada1());
		System.out.println(data1.obterDataFormatada2());
		System.out.println(data3.obterDataFormatada());
		
		data2.imprimirDataFormatada();
		
	}

}
