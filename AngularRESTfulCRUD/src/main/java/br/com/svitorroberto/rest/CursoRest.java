package br.com.svitorroberto.rest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;

/**
 * @author svitorroberto
 */
 
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.svitorroberto.modelo.Curso;

@Path("/cursos")
public class CursoRest {

	@GET
	@Path("/get")
	@Produces("application/json")
	public ArrayList<Curso> listarCursos() {
 
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso(1L, "Medicina", "1", 'A'));
		cursos.add(new Curso(2L, "Matemática", "1", 'F'));
		
		return cursos;
	}
	
	@POST
	@Path("/cadastrar")
	@Consumes("application/json")
	public Response cadastrarCurso(Curso curso) {
 
		String result = "Product created : " + curso;
		return Response.status(201).entity(result).build();
	}
	
}
