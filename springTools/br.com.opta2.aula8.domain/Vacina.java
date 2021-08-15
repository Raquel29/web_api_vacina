package br.com.opta2.aula8.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.opta2.aula8.enums.Laboratorio;

@Entity
public class Vacina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	private String cidade;
	private Laboratorio laboratorio;
	private String nomeResponsavel;
	private String dataaplica;
	private String dataSegunda;
	

	public Vacina() {
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getDataaplica() {
		return dataaplica;
	}

	public void setDataaplica(String dataaplica) {
		this.dataaplica = dataaplica;
	}

	public String getDataSegunda() {
		return dataSegunda;
	}

	public void setDataSegunda(String dataSegunda) {
		this.dataSegunda = dataSegunda;
	}

}
