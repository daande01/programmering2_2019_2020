package relationer.bilrelationer;

public class Bil�gare extends Person {

	private Bil �ger=null;

	public Bil�gare(String n) {

	this.namn=n;

	}

	public void k�p(Bil b) {

	�ger=null;

	this.�ger=b;

	b.set�gare(this);

	}


	// get metoder




}
