package rest;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.FormParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.GET;
import data.UserCandidate;

@Path("/restlogin")
public class RestLogin {
	@Context HttpServletRequest request;
	@Context HttpServletResponse response;
	String userUsername;
	String userPassword;
	String MD5Password;
	
	
	@POST
	@Path("/login")
	@Consumes("application/x-www-form-urlencoded")
	public void login(@FormParam("username") String username, @FormParam("password") String password) throws ServletException, IOException{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vaalikone");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		List<UserCandidate> list=em.createQuery("SELECT u FROM User u").getResultList();
		em.getTransaction().commit();		
		for (UserCandidate user : list) {
			   userUsername = user.getUsername();
			   userPassword = user.getPassword();
	         }		
		try {
			MD5Password = data.Login.crypt(userPassword);
			password = data.Login.crypt(password);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}		
		request.setAttribute("userProvidedUsername", username);
		request.setAttribute("password", password); 
		request.setAttribute("username", userUsername);
		request.setAttribute("MD5Password", MD5Password);
	    RequestDispatcher rd = request.getRequestDispatcher("/jsp/login.jsp");
		rd.forward(request, response); 
	}
	
	@GET
	@Path("/loginpage")
	public void goToLoginPage() throws ServletException, IOException {
		 RequestDispatcher rd = request.getRequestDispatcher("/jsp/login.jsp");
		 rd.forward(request, response); 
	}
	
}
