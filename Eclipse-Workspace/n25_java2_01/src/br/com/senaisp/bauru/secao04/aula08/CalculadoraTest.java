package br.com.senaisp.bauru.secao04.aula08;

public class CalculadoraTest {

	public static void main(String[] args) {
		Calculadora calc= new Calculadora();
		//Calculado cada pessoa
		calc.calcularTotal("Pessoa1",10);
		calc.calcularTotal("Pessoa2",12);
		calc.calcularTotal("Pessoa3",9);
		calc.calcularTotal("Pessoa4",8);
		calc.calcularTotal("Pessoa5",7);
		calc.calcularTotal("Pessoa6",15);
		calc.calcularTotal("Pessoa7",11);
		calc.calcularTotal("Pessoa8",30);
		//Mostrando o total da Mesa
		System.out.println("Total da mesa" + calc.getGrandeTotal());
		//dividindo a conta entre 6 pagantes
		System.out.println("A divisao para a 6 pagantes ficou em :");
		
	}

}
