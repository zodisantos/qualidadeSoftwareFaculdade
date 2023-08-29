package jogo28082023;

public class JogoDeTabuleiro extends Jogo{

	private int qtdePecas;

	/**
	 * @param nomeJogo
	 * @param categoria
	 * @param fornecedor
	 * @param genero
	 * @param preco
	 * @param qtdePecas
	 */
	public JogoDeTabuleiro(String nomeJogo, String categoria, Fornecedor fornecedor, char genero, float preco,
			int qtdePecas) {
		super(nomeJogo, categoria, fornecedor, genero, preco);
		this.qtdePecas = qtdePecas;
	}

	/**
	 * @return the qtdePecas
	 */
	public int getQtdePecas() {
		return qtdePecas;
	}

	/**
	 * @param qtdePecas the qtdePecas to set
	 */
	public void setQtdePecas(int qtdePecas) {
		this.qtdePecas = qtdePecas;
	}
	
	
}
