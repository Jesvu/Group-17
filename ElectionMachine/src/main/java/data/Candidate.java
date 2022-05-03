package data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidate {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private int id;
	private String sukunimi;
	private String etunimi;
	private String puolue;
	private String koti;
	private int ika;
	private String miksi;
	private String edistaa;
	private String ammatti;
	
	public Candidate() {
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSukunimi() {
		return sukunimi;
	}
	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}
	public String getEtunimi() {
		return etunimi;
	}
	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}
	public String getPuolue() {
		return puolue;
	}
	public void setPuolue(String puolue) {
		this.puolue = puolue;
	}
	public String getKoti() {
		return koti;
	}
	public void setKoti(String koti) {
		this.koti = koti;
	}
	public int getIka() {
		return ika;
	}
	public void setIka(int ika) {
		this.ika = ika;
	}
	public String getMiksi() {
		return miksi;
	}
	public void setMiksi(String miksi) {
		this.miksi = miksi;
	}
	public String getEdistaa() {
		return edistaa;
	}
	public void setEdistaa(String edistaa) {
		this.edistaa = edistaa;
	}
	public String getAmmatti() {
		return ammatti;
	}
	public void setAmmatti(String ammatti) {
		this.ammatti = ammatti;
	}
	
	

}
