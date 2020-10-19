package br.com.ed.algoritmos;

public class TesteMenorPreco {

	public static void main(String[] args) {
		
		double precos[] = new double[5];		
		precos[0] = 1000000d;
		precos[1] = 46000d;
		precos[2] = 16000d;
		precos[3] = 46000d;
		precos[4] = 17000d;
		
		int maisBarato = 0;
				
		for(int atual = 0; atual <= (precos.length - 1); atual++) {
			if (precos[atual] < precos[maisBarato]) {
				maisBarato = atual;
			}
		}
		System.out.println(maisBarato);
		System.out.println("O carro mais barato custa: " + precos[maisBarato]);
			
	}

}
