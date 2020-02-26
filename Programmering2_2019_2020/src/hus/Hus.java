package hus;

public  class Hus {

	double l�ngd;
	double bredd;
	int antalV�ningar;
	int senasteRenovering;

	public double yta() {

		return bredd* l�ngd*antalV�ningar;
	}
	public boolean st�rre(Hus annat) {
		return yta() >annat.yta();
	}

	public static void main(String[] args) {





	}

}

class Bostadshus extends Hus {

	boolean till�ggsIsolerat;

	public void isolera() {

		till�ggsIsolerat=true;
	}

}

class Flerfamiljshus extends Bostadshus{
	int antalL�genheter;
	int senasteRenovering; // avser inre renovering
	static final double hyraPerM2=1000;
	public double  ber�knaHyresInkomst() {

		return yta()*hyraPerM2;
	}
	public void renovera (int yttre , int inre) {
		// dolda instancvariabler anv�nd super f�r att komma �t f�r�lders dolda instansvariabel
		super.senasteRenovering =yttre;
		senasteRenovering = inre;
	}
	@Override  // kompilation kommer nu att kontrollera s� att det finns en yta metod i superklassen
	 public double yta() {

		 return l�ngd * bredd * antalV�ningar * 0.95;
	}


}
