package jogo28082023;

public class JogoDeCarta extends Jogo {

	private int qtdeCartas;

	/**
	 * @param nomeJogo
	 * @param categoria
	 * @param fornecedor
	 * @param genero
	 * @param preco
	 * @param qtdeCartas
	 */
	public JogoDeCarta(String nomeJogo, String categoria, Fornecedor fornecedor, char genero, float preco,
			int qtdeCartas) {
		super(nomeJogo, categoria, fornecedor, genero, preco);
		this.qtdeCartas = qtdeCartas;
	}

	/**
	 * @return the qtdeCartas
	 */
	public int getQtdeCartas() {
		return qtdeCartas;
	}

	/**
	 * @param qtdeCartas the qtdeCartas to set
	 */
	public void setQtdeCartas(int qtdeCartas) {
		this.qtdeCartas = qtdeCartas;
	}
	
	
}
