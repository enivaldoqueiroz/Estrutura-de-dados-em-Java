package br.com.ed.algoritmos;

public class TesteMenorPreco {

	public static void main(String[] args) {
		
		Produto produtos[] = {
				new Produto("Lamborghini", 1000000d),
				new Produto("Jipe", 46000d),
				/*new Produto("Brasilia", 16000d),*/
				new Produto("Smart", 46000d),
				new Produto("Fusca", 17000d)				
		};
		
		
		
		
		
		
		int maisBarato = buscaMenor(produtos);
		System.out.println(maisBarato);
		System.out.println("O carro " + produtos[maisBarato].getNome() 
									  + " é o mais barato, e custa: " 
									  + produtos[maisBarato].getPreco());	
		
			
	}
	
		private static int buscaMenor(Produto[] produtos) {
			int maisBarato = 0;
			int tamanhoArrayProdutos = produtos.length - 1;
			for(int atual = 0; atual <= tamanhoArrayProdutos; atual++) {
				if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
					maisBarato = atual;
				}
			}
			return maisBarato;
		}

}
