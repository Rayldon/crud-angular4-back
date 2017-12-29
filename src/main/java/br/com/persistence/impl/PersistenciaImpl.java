package br.com.persistence.impl;

import static java.util.Arrays.asList;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


@Stateless
	public class PersistenciaImpl<T, K extends Serializable> {

	    @PersistenceContext(unitName = "conexao-pu")
	    private EntityManager entityManager;

	    public List<T> obterTodos(Class<T> classe) {
	        CriteriaQuery<T> criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery(classe);
	        Root<T> root = criteriaQuery.from(classe);
	        criteriaQuery.select(root);
	        return getEntityManager().createQuery(criteriaQuery).getResultList();
	    }

	    public EntityManager getEntityManager(){
	        return entityManager;
	    }

	    @SuppressWarnings("rawtypes")
	    protected List obter(StringBuilder jpql, Integer... ids) {
	        return getEntityManager().createQuery(jpql.toString()).setParameter("ids", asList(ids)).getResultList();
	    }
	}

