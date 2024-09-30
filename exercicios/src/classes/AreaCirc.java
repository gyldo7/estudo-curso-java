package classes;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.1415; // o valor de pi estará associado a classe e não a instancia(objeto)
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	double area() { // método para calcular a area. Como não é do tipo static vou ter que instanciar a classe para usá-lo.
		return PI * Math.pow(raio, 2);
	}	
	
	static double area(double raio) { // criando um método static para calcular a area. Posso acessá-lo pela classe
		return PI * Math.pow(raio, 2);
	}
	
}
