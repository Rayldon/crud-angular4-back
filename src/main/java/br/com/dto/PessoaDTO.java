package br.com.dto;

import java.io.Serializable;

public class PessoaDTO implements Serializable {  /**
	 * 
	 */
	private static final long serialVersionUID = 3148121619686208671L;

	private long idade;
	private String nome;
	private String cpf;
	private long id;
	
	
	public long getIdade() {
		return idade;
	}
	public void setIdade(long idade) {
		this.idade = idade;
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

}
