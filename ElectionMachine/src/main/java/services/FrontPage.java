package services;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Ehdokkaat;

@Path("/frontpage")
public class FrontPage {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("election");
	
	@GET
	@Path("/readcandidates")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Candidate> readCandidates() {
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		List<Candidate> list=em.createQuery("select a from Candidate a").getResultList();
		em.getTransaction().commit();
		return list;
	}	
	
}