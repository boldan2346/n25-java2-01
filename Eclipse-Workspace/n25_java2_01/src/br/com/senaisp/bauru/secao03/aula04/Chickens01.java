package br.com.senaisp.bauru.secao03.aula04;

public class Chickens01 {

	public static void main(String[] args) {
		int totalEggs = 0;
		int eggsPerChicken = 5, chickenCount =3;
		//1º dia
		totalEggs += eggsPerChicken*chickenCount;
		//2º dia 
		chickenCount++; //ganhou uma galinha
		totalEggs += eggsPerChicken*chickenCount; //15+20
		//3º dia 
		chickenCount/=2; //animal come metade das galinhas
		totalEggs += eggsPerChicken*chickenCount; //15+20+10
		//imprimir o total
		System.out.println(totalEggs);//45
		
	}

}
