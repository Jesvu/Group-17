package data;

import javax.persistence.Column;

public class VastausVertaus implements Comparable<VastausVertaus> {
	private int ehdokas_id;
	private int vvAmount;
	private String ehdokasEtunimi;
	private String ehdokasSukunimi;
	private String ehdokasAmmatti;
	private int ehdokasIka;
	private String ehdokasKotipaikkakunta;
	private String ehdokasMiksiEduskuntaan;
	private String ehdokasMitaAsioitaHaluatEdistaa;
	private String ehdokasPuolue;
	
	public VastausVertaus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VastausVertaus(int ehdokas_id, int vvAmount, String ehdokasEtunimi, String ehdokasSukunimi, String ehdokasAmmatti, 
			int ehdokasIka, String ehdokasKotipaikkakunta,
			String ehdokasMiksiEduskuntaan,
			String ehdokasMitaAsioitaHaluatEdistaa,
			String ehdokasPuolue) {

				super();
				this.ehdokas_id = ehdokas_id;
				this.vvAmount = vvAmount;
				this.ehdokasEtunimi = ehdokasEtunimi;
				this.ehdokasSukunimi = ehdokasSukunimi;
				this.ehdokasAmmatti = ehdokasAmmatti;
				this.ehdokasIka = ehdokasIka;
				this.ehdokasKotipaikkakunta = ehdokasKotipaikkakunta;
				this.ehdokasMiksiEduskuntaan = ehdokasMiksiEduskuntaan;
				this.ehdokasMitaAsioitaHaluatEdistaa = ehdokasMitaAsioitaHaluatEdistaa;
				this.ehdokasPuolue = ehdokasPuolue;
		
	}



	public int getEhdokas_id() {
		return ehdokas_id;
	}

	public void setEhdokas_id(int ehdokas_id) {
		this.ehdokas_id = ehdokas_id;
	}

	public int getVvAmount() {
		return vvAmount;
	}

	public void setvvAmount(int vvAmount) {
		this.vvAmount = vvAmount;
	}

	public String getEhdokasEtunimi() {
		return ehdokasEtunimi;
	}

	public void setEhdokasEtunimi(String ehdokasEtunimi) {
		this.ehdokasEtunimi = ehdokasEtunimi;
	}

	public String getEhdokasSukunimi() {
		return ehdokasSukunimi;
	}

	public void setEhdokasSukunimi(String ehdokasSukunimi) {
		this.ehdokasSukunimi = ehdokasSukunimi;
	}

	public String getEhdokasAmmatti() {
		return ehdokasAmmatti;
	}

	public void setEhdokasAmmatti(String ehdokasAmmatti) {
		this.ehdokasAmmatti = ehdokasAmmatti;
	}

	public int getEhdokasIka() {
		return ehdokasIka;
	}

	public void setEhdokasIka(int ehdokasIka) {
		this.ehdokasIka = ehdokasIka;
	}

	public String getEhdokasKotipaikkakunta() {
		return ehdokasKotipaikkakunta;
	}

	public void setEhdokasKotipaikkakunta(String ehdokasKotipaikkakunta) {
		this.ehdokasKotipaikkakunta = ehdokasKotipaikkakunta;
	}

	public String getEhdokasMiksiEduskuntaan() {
		return ehdokasMiksiEduskuntaan;
	}

	public void setEhdokasMiksiEduskuntaan(String ehdokasMiksiEduskuntaan) {
		this.ehdokasMiksiEduskuntaan = ehdokasMiksiEduskuntaan;
	}

	public String getEhdokasMitaAsioitaHaluatEdistaa() {
		return ehdokasMitaAsioitaHaluatEdistaa;
	}

	public void setEhdokasMitaAsioitaHaluatEdistaa(String ehdokasMitaAsioitaHaluatEdistaa) {
		this.ehdokasMitaAsioitaHaluatEdistaa = ehdokasMitaAsioitaHaluatEdistaa;
	}

	public String getEhdokasPuolue() {
		return ehdokasPuolue;
	}

	public void setEhdokasPuolue(String ehdokasPuolue) {
		this.ehdokasPuolue = ehdokasPuolue;
	}

	public int compareTo(VastausVertaus vv) {
		
		int compare = Integer.compare(vvAmount, vv.vvAmount);
		
		return compare;
	}
	
	
}