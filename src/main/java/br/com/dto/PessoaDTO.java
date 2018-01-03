package br.com.dto;

import java.io.Serializable;
import java.util.List;

import br.com.model.Telefone;

public class PessoaDTO implements Serializable {  /**
	 * 
	 */
	private static final long serialVersionUID = 3148121619686208671L;

	private long idade;
	private String nome;
	private String cpf;
	private long id;
	private List<Telefone> telefones;
	
	
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
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

}
