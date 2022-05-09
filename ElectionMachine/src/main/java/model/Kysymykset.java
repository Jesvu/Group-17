package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the kysymykset database table.
 * 
 */
@Entity
@NamedQuery(name="Kysymykset.findAll", query="SELECT k FROM Kysymykset k")
public class Kysymykset implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="KYSYMYS_ID")
	private int kysymysId;

	private String kysymys;

	//bi-directional many-to-one association to Vastaukset
	@OneToMany(mappedBy="kysymykset")
	private List<Vastaukset> vastaukset;

	public Kysymykset() {
	}

	public int getKysymysId() {
		return this.kysymysId;
	}

	public void setKysymysId(int kysymysId) {
		this.kysymysId = kysymysId;
	}

	public String getKysymys() {
		return this.kysymys;
	}

	public void setKysymys(String kysymys) {
		this.kysymys = kysymys;
	}

	public List<Vastaukset> getVastaukset() {
		return this.vastaukset;
	}

	public void setVastauksets(List<Vastaukset> vastaukset) {
		this.vastaukset = vastaukset;
	}

	public Vastaukset addVastaukset(Vastaukset vastaukset) {
		getVastaukset().add(vastaukset);
		vastaukset.setKysymykset(this);

		return vastaukset;
	}

	public Vastaukset removeVastaukset(Vastaukset vastaukset) {
		getVastaukset().remove(vastaukset);
		vastaukset.setKysymykset(null);

		return vastaukset;
	}
	
	public String toString() {
		return kysymysId+" "+kysymys;
	}

}