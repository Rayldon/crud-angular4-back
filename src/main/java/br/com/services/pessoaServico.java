package br.com.services;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.business.PessoaNegocio;
import br.com.dto.PessoaDTO;

@Path("/pessoa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class pessoaServico {
	@EJB
	PessoaNegocio pessoaNegocio;
	
	@GET
	@Path("/consulta")
	public Response consultar(){

	return Response.ok(pessoaNegocio.obterTodos()).build();
	}
	
	@GET
	@Path("/excluir/{idUsuario}")
	public void excluirUsuario(@PathParam("idUsuario") Long idUsuario) {
		pessoaNegocio.excluir(idUsuario);
}
	
	@POST
	@Path("/salvar")
	public PessoaDTO salvar(PessoaDTO usuario) {
		
		return pessoaNegocio.salvar(usuario);
}

}
