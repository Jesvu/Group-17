package services;

import java.util.ArrayList;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.*;

public class AnswerService {


	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vaalikone");


	public List<Ehdokkaat> getAllCandidates()
	{
		EntityManager em=emf.createEntityManager();

		@SuppressWarnings("unchecked")
		List<Ehdokkaat> list = em.createQuery("select e from Ehdokkaat e").getResultList();

		em.close();

		return list;
	}


	
	public List<Kysymykset> getAllQuestions()
	{
		EntityManager em=emf.createEntityManager();
		@SuppressWarnings("unchecked")
		List<Kysymykset> list = em.createQuery("select k from Kysymykset k").getResultList();
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
	
	
	public Ehdokkaat getCandidateById(int id)
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Ehdokkaat ehdokas = em.find(Ehdokkaat.class, id);
		em.getTransaction().commit();

		em.close();
		return ehdokas;
	
}
	
	public Kysymykset getQuestionById(int id)
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Kysymykset kysymys = em.find(Kysymykset.class, id);
		em.getTransaction().commit();

		em.close();
		return kysymys;

	}
}
