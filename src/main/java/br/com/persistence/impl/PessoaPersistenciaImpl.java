package br.com.persistence.impl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;

import br.com.model.Pessoa;
import br.com.persistence.PessoaPersistencia;

@Stateless
public class PessoaPersistenciaImpl extends PersistenciaImpl<Pessoa, Serializable> implements PessoaPersistencia {
	
	@Override
	public Pessoa salvar(Pessoa usuario){		
		return getEntityManager().merge(usuario);
	}
	
	@Override
	public Pessoa buscarPorId(Long idUsuario){		
		return getEntityManager().find(Pessoa.class, idUsuario);
}
	
	@Override
	public void excluir(Long idUsuario) {
		getEntityManager().remove(buscarPorId(idUsuario));
	}
	
	@Override
	public List<Pessoa> obterTodos(){
		return obterTodos(Pessoa.class);
	}

}
