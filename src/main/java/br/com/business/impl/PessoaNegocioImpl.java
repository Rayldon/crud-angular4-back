package br.com.business.impl;

import javax.ejb.Stateless;

import br.com.business.PessoaNegocio;
import br.com.dto.PessoaDTO;

@Stateless
public class PessoaNegocioImpl implements PessoaNegocio {
	
	@Override
	public PessoaDTO salvar(PessoaDTO pessoaDTO) {
		
		return pessoaDTO;
	} 

}
