package com.mkyong.rest;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/{param}")
	//@Produces(MediaType.APPLICATION_JSON)
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey_say" + msg;
		
		
		return Response.status(Response.Status.OK).entity(output).build();
		
 
	}
	
	
	@GET
	@Path("/person/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Person getPerson(@PathParam("param") String msg) {
 
		Person p = new Person();
		p.setName(msg);
		
		//return Response.status(Response.Status.OK).entity(output).build();
		return p;
 
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Person createNewPerson(Person person) {
 
		Person p = new Person();
		p.setName(person.getName()+"_XXX");
		
		//return Response.status(Response.Status.OK).entity(output).build();
		return p;
 
	}
 
}