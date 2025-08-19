package br.com.senaisp.bauru.secao04.aula08;

public class Calculadora {
	//Propriedades - Campos
	private double imposto;
	private double comissao;
	private double grandeTotal;
	//Constructor
	public Calculadora() { 
		imposto = 5;
		comissao = 15;
		grandeTotal=0;
	}
	//comportamentos - Getters e Setters
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	private double addtGrandeTotal() {
		return grandeTotal;
	}
	public double zerarGrandeTotal() {
		double valorGasto = 0;
		double ret = Math.round(valorGasto*(1+getImposto()/100+ getComissao()/100)*100)/100.;
		String nome = null;
		System.out.println(nome+" : R$ " + ret);
		return ret;
		
	}
	
	public double dividirValor(int qtdPagantes) {
		double ret = 0;
		if(qtdPagantes>0) {
			ret=getGrandeTotal(6)/ qtdPagantes;
		}
		return ret;
	}
	private int getGrandeTotal(int i) {
		return 0;
	}
}
