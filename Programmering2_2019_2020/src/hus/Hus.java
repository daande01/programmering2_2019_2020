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

		Hus h = new Hus();
		Bostadshus b= new Bostadshus();
		Flerfamiljshus f= new Flerfamiljshus();
//		h.större(b);
//		h=b;
//		h=f;
//
//		//b=h;  // går ej fel håll
//		b= (Bostadshus)h;  //farligt om h inte är ett bostadshus
//
//		if (h instanceof Bostadshus) {
//			b= (Bostadshus)h;
//		}

		//__________komma åt dolda variabler i från main _______________

//		Hus hh;
//		Flerfamiljshus ff= new Flerfamiljshus();
//
//		ff.senasteRenovering=2018;
//		hh=ff;
//		hh.senasteRenovering=2020;
		//____________polymorfism dynamiskbindning_______________

		Bostadshus b1 = new Bostadshus();
		Flerfamiljshus f1 = new Flerfamiljshus();
		b1.bredd=10; b1.längd=20; b1.antalVåningar=3;
		f1.bredd=10; f1.längd=20; f1.antalVåningar=3;

		Bostadshus b2;
		b2=f1;

		System.out.println(b1.yta());
		System.out.println(f1.yta());
		System.out.println(b2.yta());

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
		this.senasteRenovering = inre;
	}
	@Override  // kompilation kommer nu att kontrollera så att det finns en yta metod i superklassen
	 public double yta() {

		 return längd * bredd * antalVåningar * 0.95;
	}


}
