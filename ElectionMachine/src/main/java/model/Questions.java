package model;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@NamedQuery(name="Questions.findAll", query="SELECT k FROM Kysymykset k")
public class Questions implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int kysymysId;
	private String kysymys;
	
	public Questions() {
		
	}
	
	public int getKysymysId() {
		return kysymysId;
	}
	public void setKysymysId(int kysymysId) {
		this.kysymysId = kysymysId;
	}
	public String getKysymys() {
		return kysymys;
	}
	public void setKysymys(String kysymys) {
		this.kysymys = kysymys;
	}
	
	public String toString() {
		return kysymysId+" "+kysymys;
	}
	
}
