package br.com.ed.algoritmos;

public class TesteMenorPreco {

	public static void main(String[] args) {
		
		Produto produtos[] = new Produto[5];
		
		produtos[0] = new Produto("Lamborghini", 1000000d);
		produtos[1] = new Produto("Jipe", 46000d);
		produtos[2] = new Produto("Brasilia", 16000d);
		produtos[3] = new Produto("Smart", 46000d);
		produtos[4] = new Produto("Fusca", 17000d);
		
		int maisBarato = 0;
		
		for(int atual = 0; atual <= (produtos.length - 1); atual++) {
			if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
		}
		System.out.println(maisBarato);
		System.out.println("O carro " + produtos[maisBarato].getNome() 
									 + " é o mais barato, e custa: " 
									 + produtos[maisBarato].getPreco());
			
	}

}
