package hus;

public  class Hus {

	double längd;
	double bredd;
	int antalVåningar;
	int senasteRenovering;

	public double yta() {

		return bredd* längd*antalVåningar;
	}
	public boolean större(Hus annat) {
		return yta() >annat.yta();
	}

	public static void main(String[] args) {





	}

}

class Bostadshus extends Hus {

	boolean tilläggsIsolerat;

	public void isolera() {

		tilläggsIsolerat=true;
	}

}

class Flerfamiljshus extends Bostadshus{
	int antalLägenheter;
	int senasteRenovering; // avser inre renovering
	static final double hyraPerM2=1000;
	public double  beräknaHyresInkomst() {

		return yta()*hyraPerM2;
	}
	public void renovera (int yttre , int inre) {
		// dolda instancvariabler använd super för att komma åt förälders dolda instansvariabel
		super.senasteRenovering =yttre;
		senasteRenovering = inre;
	}
	@Override  // kompilation kommer nu att kontrollera så att det finns en yta metod i superklassen
	 public double yta() {

		 return längd * bredd * antalVåningar * 0.95;
	}


}
