package services;

import java.io.IOException;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import model.Ehdokkaat;

@Path("/electionmachine")
public class FrontPage {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vaalikone");
	
	@Context HttpServletRequest request;
	@Context HttpServletResponse response;
	
	@GET
	@Path("/read")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void readCandidates() {
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		List<Ehdokkaat> list=em.createQuery("select e from Ehdokkaat e").getResultList();
		em.getTransaction().commit();
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/ehdokkaat.jsp");
		request.setAttribute("ehdokaslista", list);
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
	
	@GET
	@Path("/kysymykset")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void readKysymykset() {
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		List<Ehdokkaat> list=em.createQuery("select k from kysymykset k").getResultList();
		em.getTransaction().commit();
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/kysymykset.jsp");
		request.setAttribute("kysymyslista", list);
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}