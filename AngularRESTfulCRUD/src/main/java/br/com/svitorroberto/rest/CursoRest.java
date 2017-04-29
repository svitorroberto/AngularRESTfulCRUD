package br.com.svitorroberto.rest;

import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.Consumes;

/**
 * @author svitorroberto
 */
 
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.svitorroberto.business.CursoNegocio;
import br.com.svitorroberto.modelo.Curso;

@Path("/cursos")
public class CursoRest {

	@GET
	@Path("/get")
	@Produces("application/json")
	public ArrayList<Curso> listarCursos() {
		CursoNegocio cursoNegocio = new CursoNegocio();
		return (ArrayList<Curso>) cursoNegocio.recuperarTodos();
 
		/*ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso(1L, "Medicina", "1", 'A'));
		cursos.add(new Curso(2L, "Matemática", "1", 'F'));*/
	}
	
	@GET
	@Path("/get/{id}")
	@Produces("application/json")
	public Curso recuperarPorId(@PathParam("id")Long id) {
		CursoNegocio cursoNegocio = new CursoNegocio();
		return cursoNegocio.recuperarPorId(new Curso(id));
		
		/*ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso(1L, "Medicina", "1", 'A'));
		cursos.add(new Curso(2L, "Matemática", "1", 'F'));*/
	}
	
	@POST
	@Path("/cadastrar")
	@Consumes("application/json")
	public Response cadastrarCurso(Curso curso) {
 
		CursoNegocio cursoNegocio = new CursoNegocio();
		cursoNegocio.salvar(curso);
		String result = "Product created : " + curso;
		return Response.status(201).entity(result).build();
	}
	
}
