package br.com.business.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.business.PessoaNegocio;
import br.com.dto.PessoaDTO;
import br.com.model.Pessoa;
import br.com.persistence.PessoaPersistencia;

@Stateless
public class PessoaNegocioImpl implements PessoaNegocio {
	
	@Inject
	PessoaPersistencia pessoaPersistencia;
	
	@Override
	public PessoaDTO salvar(PessoaDTO pessoaDTO) {
		Pessoa pessoa = new Pessoa();
		pessoa.setIdPessoa(pessoaDTO.getId());
		pessoa.setNome(pessoaDTO.getNome());
		pessoa.setCpf(pessoaDTO.getCpf());
		pessoa.setIdade(pessoaDTO.getIdade());
		pessoaPersistencia.salvar(pessoa);
		return pessoaDTO;
	} 
	
	@Override
	public void excluir(Long idUsuario) {
		pessoaPersistencia.excluir(idUsuario);
	}
	
	@Override
	public List<PessoaDTO> obterTodos(){
		
		List<PessoaDTO> listaDTO = new ArrayList<>();
		List<Pessoa> lista = pessoaPersistencia.obterTodos();
		
		for(Pessoa pessoa : lista) {
			PessoaDTO pessoaDTO = new PessoaDTO();
			pessoaDTO.setId(pessoa.getIdPessoa());
			pessoaDTO.setNome(pessoa.getNome());
			pessoaDTO.setCpf(pessoa.getCpf());
			pessoaDTO.setIdade(pessoa.getIdade());
			listaDTO.add(pessoaDTO);
		}
		return listaDTO;
	}

}
