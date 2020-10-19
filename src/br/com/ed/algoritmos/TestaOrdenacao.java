package br.com.ed.algoritmos;

public class TestaOrdenacao {

	public static void main(String[] args) {

		Produto produtos[] = {
				new Produto("Lamborghini", 1000000d),
				new Produto("Jipe", 46000d),
				new Produto("Brasilia", 16000d),
				new Produto("Smart", 46000d),
				new Produto("Fusca", 17000d),
				
		};
		
		int maisBarato = buscaMenor(produtos, 0, 4);
		
		//For que realiza a ordenação
		for (int atual = 0; atual <= produtos.length -1; atual++) {
			int menor = buscaMenor(produtos, atual, produtos.length - 1);
			Produto produtoAtual = produtos[atual];
			Produto produtoMenor = produtos[menor];
			produtos[atual] = produtoMenor;
			produtos[menor] = produtoAtual;
			
		}
		
		for (Produto produto : produtos) {
			System.out.println(produto.getNome() + " custa " + produto.getPreco());
		}
		
//		int maisBarato = buscaMenor(produtos, 0, 4);
//		System.out.println(maisBarato);
//		System.out.println("O carro " + produtos[maisBarato].getNome() 
//									  + " é o mais barato, e custa: " 
//									  + produtos[maisBarato].getPreco());

	}
	
	private static int buscaMenor(Produto[] produtos, int inicio,int tamanhoArrayProdutos) {
		
		int maisBarato = inicio;
		
		for(int atual = inicio; atual <= tamanhoArrayProdutos; atual++) {
			if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
		}
		return maisBarato;
	}

}
