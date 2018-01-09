package br.com.persistence.impl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

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
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Pessoa> obterTodos(){
		StringBuilder sb = new StringBuilder(" SELECT p FROM Pessoa p");
		Query query = getEntityManager().createQuery(sb.toString());
		return query.getResultList();
	}

}
