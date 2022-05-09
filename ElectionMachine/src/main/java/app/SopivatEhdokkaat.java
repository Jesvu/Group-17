package app;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.VastausVertaus;
import services.AnswerService;
import model.*;


@WebServlet(name = "SopivatEhdokkaat", urlPatterns = { "/sopivatehdokkaat" })
public class SopivatEhdokkaat extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init() {

	}

	public SopivatEhdokkaat() {
		super();
	}

	@SuppressWarnings("unused")
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		AnswerService answerservice = new AnswerService();
		List<Kysymykset> questionlist = null;
		questionlist = answerservice.getAllQuestions();

		List<Ehdokkaat> candidatelist = answerservice.getAllCandidates();
		

		ArrayList<Integer> useranswerlist = new ArrayList<>();
		String answer_string = null;
		int answer = 0;

		for (int i = 0; i < questionlist.size(); i++) {
			answer_string = request.getParameter("" + (i + 1));
			if (answer_string != null) {

				answer = Integer.valueOf(answer_string);
				useranswerlist.add(answer);

	
			} else {
				answer = 0;
				useranswerlist.add(answer);
			}

		}

		int difference = 0;
		int differenceSum = 0;
		Vastaukset candidateAnswer = null;
		List<Vastaukset> candidatesAnswers = null; {

		ArrayList<VastausVertaus> VVehdokkaat = new ArrayList<>();


		for (int i = 0; i < candidatelist.size(); i++) {
			VastausVertaus vastausvertaus = new VastausVertaus();
			differenceSum = 0;

			Ehdokkaat e = candidatelist.get(i);
			candidatesAnswers = answerservice.getCandidateById(e.getEhdokasId()).getVastaukset();

			
			
//			if (candidatesAnswers.size() != 0) {
//
//				
//				
//				for (int h = 0; h < questionlist.size(); h++) {
//					
//					if (useranswerlist.get(h) != 0 && candidatesAnswers.get(h).getVastaus() != 0)  	{
//						
//						candidateAnswer = candidatesAnswers.get(h);
//						difference = useranswerlist.get(h) - candidateAnswer.getVastaus();
//						differenceSum = differenceSum + Math.abs(difference);
//
//						System.out.println("ID: " + candidatelist.get(i).getEhdokasId() + ", vastaus: "
//								+ candidatesAnswers.get(h).getVastaus());
//						
//					}}}
			{
					
				vastausvertaus.setEhdokas_id(candidatelist.get(i).getEhdokasId());
				vastausvertaus.setvvAmount(differenceSum);
				vastausvertaus.setEhdokasEtunimi(candidatelist.get(i).getEtunimi());
				vastausvertaus.setEhdokasSukunimi(candidatelist.get(i).getSukunimi());
				VVehdokkaat.add(vastausvertaus);
				System.out.println("ID: " + vastausvertaus.getEhdokas_id() + ", points: " + vastausvertaus.getVvAmount());
			}}
//				
		Collections.sort(VVehdokkaat);

	
		VVehdokkaat.subList(10, VVehdokkaat.size()).clear();

		request.setAttribute("useranswers", useranswerlist);
		request.setAttribute("VVehdokkaat", VVehdokkaat);

		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/VVehdokkaat.jsp");

		try {
			dispatcher.forward(request, response);
		} catch (ServletException | IOException t) {
			// TODO Auto-generated catcht block
			t.printStackTrace();
	}
	
		}
	}}

