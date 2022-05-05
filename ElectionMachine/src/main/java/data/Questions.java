package data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;



@NamedQuery(name="Questions.findAll", query="SELECT q FROM Questions q")
public class Questions implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="KYSYMYS_ID")
	private int questionsId;

	private String questions;
	
	
	public Questions(int id, String questions) {
		
		setQuestionsId(id);
		
		this.questions = questions;
	}

	@OneToMany(mappedBy="questions")
	private List<Answers> answers;

	public Questions() {
	}
	
	public Questions(String question) {
		
	}

	public int sQuestionsId() {
		return this.questionsId;
	}

	public void setQuestionsId(int questionsId) {
		this.questionsId = questionsId;
	}

	public String getQuestions() {
		return this.questions;
	}

	public void setKysymys(String questions) {
		this.questions = questions;
	}

	public List<Answers> getAnswers() {
		return this.answers;
	}

	public void setVastauksets(List<Answers> answers) {
		this.answers = answers;
	}

	public Answers addAnswers(Answers answers) {
		getAnswers().add(answers);
		answers.setQuestions(this);

		return answers;
	}

	public Answers removeAnswers(Answers answers) {
		getAnswers().remove(answers);
		answers.setQuestions(null);

		return answers;
	}

}