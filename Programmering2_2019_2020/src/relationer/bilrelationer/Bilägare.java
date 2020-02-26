package relationer.bilrelationer;

public class Bilägare extends Person {

	private Bil äger=null;

	public Bilägare(String n) {

	this.namn=n;

	}

	public void köp(Bil b) {

	äger=null;

	this.äger=b;

	b.setÄgare(this);

	}


	// get metoder




}
