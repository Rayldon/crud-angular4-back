package br.com.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.dto.PessoaDTO;

@Path("/pessoa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class pessoaServico {
	
	@GET
	@Path("/consulta")
	public Response consultar(){
	PessoaDTO pessoa = new PessoaDTO();
	pessoa.setNome("João");
	pessoa.setCpf("123456789");
	pessoa.setIdade(21L);
	return Response.ok(pessoa).build();
	}

}
