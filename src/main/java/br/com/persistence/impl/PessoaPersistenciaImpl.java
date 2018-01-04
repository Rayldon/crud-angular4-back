package br.com.persistence.impl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;

import javax.persistence.Query;
import br.com.model.Pessoa;
import br.com.model.Telefone;
import br.com.persistence.PessoaPersistencia;

@Stateless
public class PessoaPersistenciaImpl extends PersistenciaImpl<Pessoa, Serializable> implements PessoaPersistencia {
	
	@Override
	public Pessoa salvar(Pessoa usuario){
		String tel[] = new String[10];
		int i = 0;
		
		if(usuario.getTelefones() != null && !usuario.getTelefones().isEmpty())
			for(Telefone t : usuario.getTelefones()) {
				tel[i] = t.getTelefone();
				i++;
			}

		usuario = getEntityManager().merge(usuario);
		i = 0;
		if(usuario.getTelefones() != null && !usuario.getTelefones().isEmpty())
			for(Telefone t : usuario.getTelefones()) {
				t.setIdPessoa(usuario.getIdPessoa());
				t.setTelefone(tel[i]);
				getEntityManager().merge(t);
				i++;
			}
		
		return usuario;
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
		
		StringBuilder sb = new StringBuilder(" SELECT p FROM Pessoa p");
		sb.append(" INNER JOIN FETCH p.telefones group by p ");
		Query query = getEntityManager().createQuery(sb.toString());
		
		return query.getResultList();

	}

}
