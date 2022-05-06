package data;

public class VastausVertaus implements Comparable<VastausVertaus> {
	private int ehdokas_id;
	private int vvAmount;
	private String ehdokasEtunimi;
	private String ehdokasSukunimi;
	
	public VastausVertaus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public VastausVertaus(int ehdokas_id, int vvAmount, String ehdokasEtunimi, String ehdokasSukunimi) {
		super();
		this.ehdokas_id = ehdokas_id;
		this.vvAmount = vvAmount;
		this.ehdokasEtunimi = ehdokasEtunimi;
		this.ehdokasSukunimi = ehdokasSukunimi;
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
	

	public int compareTo(VastausVertaus vv) {
		
		int compare = Integer.compare(vvAmount, vv.vvAmount);
		
		return compare;
	}
	
	
}