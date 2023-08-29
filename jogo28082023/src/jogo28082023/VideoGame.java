package jogo28082023;

public class VideoGame extends Jogo{

	private String paisDeOrigem;
	private String Modelo;
	/**
	 * @param nomeJogo
	 * @param categoria
	 * @param fornecedor
	 * @param genero
	 * @param preco
	 * @param paisDeOrigem
	 * @param modelo
	 */
	public VideoGame(String nomeJogo, String categoria, Fornecedor fornecedor, char genero, float preco,
			String paisDeOrigem, String modelo) {
		super(nomeJogo, categoria, fornecedor, genero, preco);
		this.paisDeOrigem = paisDeOrigem;
		Modelo = modelo;
	}
	/**
	 * @return the paisDeOrigem
	 */
	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}
	/**
	 * @param paisDeOrigem the paisDeOrigem to set
	 */
	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return Modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	

	
}
