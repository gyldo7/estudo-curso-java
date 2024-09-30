package classes;

public class ValorVsReferencia {

	public static void main(String[] args) {

		double a = 2;
		double b = a; // atribuição por valor, já que estou trabalhando com tipos primitivos

		a++;
		b--;

		System.out.println(a + " " + b);

		// ==================================================

		Data d1 = new Data(1, 6, 2024);
		Data d2 = d1; // atribuição por referêcia, já que estou trabalhando com objeto.

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		voltarDataParaValorPadrao(d1);

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		// ====================================================
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}

	static void voltarDataParaValorPadrao(Data d) {
		// quando eu passo um objeto como parametro de um método, estou passando a referência, logo posso alterar o objeto padrão.
		
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

	static void alterarPrimitivo(int a) {
		// quando eu passo um primitivo como parâmetro de um método, estou passando o valor, uma cópia do valor será criada na mémoria. 
		a++;
	}

}
