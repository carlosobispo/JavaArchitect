package edu.demo.rsws.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.demo.rsws.entity.Programa;

public interface ProgramaService {

	@GET
	@Path("/list")
	@Produces({MediaType.TEXT_XML, MediaType.APPLICATION_JSON})
	List<Programa> getprogramas();

}
