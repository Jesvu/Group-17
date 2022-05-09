package rest;



	import java.io.IOException;


	import java.util.ArrayList;
	import java.util.List;


	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import javax.ws.rs.GET;

	import javax.ws.rs.Path;

	import javax.ws.rs.Produces;

	import javax.ws.rs.core.Context;
	import javax.ws.rs.core.MediaType;

	import model.*;
    import services.AnswerService;

	@Path("/restquest")
	public class RestQuest {
		@Context HttpServletRequest request;
		@Context HttpServletResponse response;
		
		@GET
		@Path("/getallquestions")
		@Produces(MediaType.APPLICATION_JSON)
		

		public void getAllQuestions() //throws ServletException, IOException
		{
			List<Kysymykset> questionlist = new ArrayList<Kysymykset>();
			AnswerService answerservice = new AnswerService();

			questionlist = answerservice.getAllQuestions();
			
			
			request.setAttribute("questionlist", questionlist);
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/data.jsp"); 
			try {
				rd.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		@GET
		@Path("/readallanswers")
		@Produces(MediaType.APPLICATION_JSON)
		
			public void readAllAnswers() {
				List<Ehdokkaat> answerlist = new ArrayList<Ehdokkaat>();
				AnswerService answerservice = new AnswerService();

				answerlist = answerservice.readAllAnswers();
				
				
				request.setAttribute("answerlist", answerlist);
				RequestDispatcher rd = request.getRequestDispatcher("/jsp/EhdokasVastaus.jsp"); 
				try {
					rd.forward(request, response);
				} catch (ServletException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
				
			
		}}
		

	
	
	
	