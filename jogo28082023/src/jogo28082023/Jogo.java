package jogo28082023;

public class Jogo {

	private String nomeJogo, categoria;
	private Fornecedor fornecedor;
	private char genero;
	private float preco;
	/**
	 * @param nomeJogo
	 * @param categoria
	 * @param fornecedor
	 * @param genero
	 * @param preco
	 */
	public Jogo(String nomeJogo, String categoria, Fornecedor fornecedor, char genero, float preco) {
		super();
		this.nomeJogo = nomeJogo;
		this.categoria = categoria;
		this.fornecedor = fornecedor;
		this.genero = genero;
		this.preco = preco;
	}
	/**
	 * @return the nomeJogo
	 */
	public String getNomeJogo() {
		return nomeJogo;
	}
	/**
	 * @param nomeJogo the nomeJogo to set
	 */
	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the fornecedor
	 */
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	/**
	 * @param fornecedor the fornecedor to set
	 */
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	/**
	 * @return the genero
	 */
	public char getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(char genero) {
		this.genero = genero;
	}
	/**
	 * @return the preco
	 */
	public float getPreco() {
		return preco;
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	

}

