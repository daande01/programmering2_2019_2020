package relationer.bilrelationer;

public class Bil {

	private String reg;

	private Bilägare ägare;

	public Bil(String r) {

	reg=r;

	}

	public void setÄgare(Bilägare  bä) {

		this.ägare=bä;

	}




}
