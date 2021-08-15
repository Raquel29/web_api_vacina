package br.com.opta2.aula8.enums;

public enum Laboratorio {
	CORONAVAC("CoronaVac"),
	PFIZER("Pfizer"),
	ASTRAZENECA("Astrazeneca");
	private String descricao;
	private Laboratorio(String descricao) {
	this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
		}

}
