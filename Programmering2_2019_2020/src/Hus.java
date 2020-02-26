
public  class Hus {

	double längd;
	double bredd;
	int antalVåningar;
	int senasteRenovering;

	public double yta() {

		return bredd* längd*antalVåningar;
	}
}

class bostadshus extends Hus {

	boolean tilläggsIsolerat;

	public void isolera() {

		tilläggsIsolerat=true;
	}


}

class flerfamiljshus extends bostadshus{
	int antalLägenheter;
	int senasteRenovering; // avser inre renovering
	static final double hyraPerM2=1000;
	public double  beräknaHyresInkomst() {

		return yta()*hyraPerM2;
	}

}
