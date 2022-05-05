package data;

import java.io.Serializable;
import javax.persistence.*;


public class Answers implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name="EHDOKAS_ID", insertable=false, updatable=false)
	private int ehdokasId;

	@Column(name="KYSYMYS_ID", insertable=false, updatable=false)


	private int questionsId;

	public Answers() {
	}
	public int getEhdokasId() {
		return this.ehdokasId;
	}
	public void setEhdokasId(int ehdokasId) {
		this.ehdokasId = ehdokasId;
	}
	
	public void setEhdokasId(String ehdokasId) {
		this.ehdokasId = Integer.valueOf(ehdokasId);
	}
	
	public int getQuestionsId() {
		return this.questionsId;
	}
	public void setQuestionsId(int questionsId) {
		this.questionsId = questionsId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Answers)) {
			return false;
		}
		Answers castOther = (Answers)other;
		return 
			(this.ehdokasId == castOther.ehdokasId)
			&& (this.questionsId == castOther.questionsId);
	}

	public int equals() {
		final int prime = 31;
		int equals = 17;
		equals = equals * prime + this.ehdokasId;
		equals = equals * prime + this.questionsId;
		
		return equals;
	}
	public void setQuestions(Questions questions) {
		// TODO Auto-generated method stub
		
	}
}