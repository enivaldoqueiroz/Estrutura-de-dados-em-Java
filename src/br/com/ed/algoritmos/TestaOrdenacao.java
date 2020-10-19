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
		
		
		
		ordenar(produtos, produtos.length);		
		
		System.out.println("");
		for (Produto produto : produtos) {
			System.out.println(produto.getNome() + " custa " + produto.getPreco());
		}
		
//		System.out.println("");
		int maisBarato = buscaMenor(produtos, 0, 4);
//		System.out.println(maisBarato);
//		System.out.println("O carro " + produtos[maisBarato].getNome() 
//									  + " é o mais barato, e custa: " 
//									  + produtos[maisBarato].getPreco());

	}
	
	//Metodo que realiza a ordenação pela seleção do menor valor
	private static void ordenar(Produto[] produtos, int tamanhoArrayProdutos) {

		for (int atual = 0; atual < tamanhoArrayProdutos -1; atual++) {
			
			System.out.println("Estou no indice " + atual + "");
			
			int menor = buscaMenor(produtos, atual, tamanhoArrayProdutos - 1);
			
			System.out.println("Trocando "	+ atual	+ "	com	o "	+ menor);
			
			Produto produtoAtual = produtos[atual];
			Produto produtoMenor = produtos[menor];
			
			System.out.println("Trocando " + produtoAtual.getNome() + " por " + produtoMenor.getNome());
			
			produtos[atual] = produtoMenor;
			produtos[menor] = produtoAtual;			
			
		}
		
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
