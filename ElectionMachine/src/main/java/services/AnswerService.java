package services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import data.*;

public class AnswerService {


	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ElectonMachine");


	public List<Ehdokkaat> getAllCandidates()
	{
		EntityManager em=emf.createEntityManager();

		@SuppressWarnings("unchecked")
		List<Ehdokkaat> list = em.createQuery("select e from Ehdokkaat e").getResultList();

		em.close();

		return list;
	}


	
	public List<Questions> getAllQuestions()
	{
		EntityManager em=emf.createEntityManager();
		@SuppressWarnings("unchecked")
		List<Questions> list = em.createQuery("select q from Questions q").getResultList();
		em.close();

		return list;
	}
	@SuppressWarnings("unchecked")
	public List<Ehdokkaat> readAllAnswers() {
		List<Ehdokkaat> list = new ArrayList<>();

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		list = em.createQuery("select e from Ehdokkaat e").getResultList();
		em.getTransaction().commit();
		em.close();

		return list;
	}
}

