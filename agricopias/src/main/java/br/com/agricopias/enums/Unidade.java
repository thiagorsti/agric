package br.com.agricopias.enums;

public enum Unidade {
	
	METRO_LINEAR("metro linear", "m"), 
	METRO_QUADRADO("metro quadrado", "m²"), 
	UNITARIO("unitário", "u");

	private Unidade(String descricao, String sigla) {
		this.descricao = descricao;
		this.sigla = sigla;
	}

	private final String descricao;

	private final String sigla;

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDescricaoCompleta() {
		return getSigla() + " - " + getDescricao();
	}
}
