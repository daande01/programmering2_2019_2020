
public  class Hus {

	double l�ngd;
	double bredd;
	int antalV�ningar;
	int senasteRenovering;

	public double yta() {

		return bredd* l�ngd*antalV�ningar;
	}
}

class bostadshus extends Hus {

	boolean till�ggsIsolerat;

	public void isolera() {

		till�ggsIsolerat=true;
	}


}

class flerfamiljshus extends bostadshus{
	int antalL�genheter;
	int senasteRenovering; // avser inre renovering
	static final double hyraPerM2=1000;
	public double  ber�knaHyresInkomst() {

		return yta()*hyraPerM2;
	}

}
