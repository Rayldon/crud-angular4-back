package br.com.persistence;

import java.util.List;

import br.com.model.Pessoa;

public interface PessoaPersistencia {

	Pessoa salvar(Pessoa pessoa);
	
	Pessoa buscarPorId(Long idUsuario);
	
	void excluir(Long idUsuario);
	
	List<Pessoa> obterTodos();

}
