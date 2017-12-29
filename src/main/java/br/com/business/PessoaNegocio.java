package br.com.business;

import java.util.List;

import br.com.dto.PessoaDTO;

public interface PessoaNegocio {
	PessoaDTO salvar(PessoaDTO pessoa); 
	
	List<PessoaDTO> obterTodos();
}
