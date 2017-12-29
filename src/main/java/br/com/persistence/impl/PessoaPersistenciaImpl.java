package br.com.persistence.impl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;

import br.com.model.Pessoa;
import br.com.persistence.PessoaPersistencia;

@Stateless
public class PessoaPersistenciaImpl extends PersistenciaImpl<Pessoa, Serializable> implements PessoaPersistencia {
	
	@Override
	public Pessoa salvar(Pessoa pessoa) {
		return pessoa;
	}
	
	@Override
	public List<Pessoa> obterTodos(){
		return obterTodos(Pessoa.class);
	}

}
