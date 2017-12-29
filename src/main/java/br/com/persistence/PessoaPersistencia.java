package br.com.persistence;

import java.util.List;

import br.com.model.Pessoa;

public interface PessoaPersistencia {

	Pessoa salvar(Pessoa pessoa);
	
	List<Pessoa> obterTodos();

}
