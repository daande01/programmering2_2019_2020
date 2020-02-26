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

		Hus h = new Hus();
		Bostadshus b= new Bostadshus();
		Flerfamiljshus f= new Flerfamiljshus();
//		h.st�rre(b);
//		h=b;
//		h=f;
//
//		//b=h;  // g�r ej fel h�ll
//		b= (Bostadshus)h;  //farligt om h inte �r ett bostadshus
//
//		if (h instanceof Bostadshus) {
//			b= (Bostadshus)h;
//		}

		//__________komma �t dolda variabler i fr�n main _______________

//		Hus hh;
//		Flerfamiljshus ff= new Flerfamiljshus();
//
//		ff.senasteRenovering=2018;
//		hh=ff;
//		hh.senasteRenovering=2020;
		//____________polymorfism dynamiskbindning_______________

		Bostadshus b1 = new Bostadshus();
		Flerfamiljshus f1 = new Flerfamiljshus();
		b1.bredd=10; b1.l�ngd=20; b1.antalV�ningar=3;
		f1.bredd=10; f1.l�ngd=20; f1.antalV�ningar=3;

		Bostadshus b2;
		b2=f1;

		System.out.println(b1.yta());
		System.out.println(f1.yta());
		System.out.println(b2.yta());

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
		this.senasteRenovering = inre;
	}
	@Override  // kompilation kommer nu att kontrollera s� att det finns en yta metod i superklassen
	 public double yta() {

		 return l�ngd * bredd * antalV�ningar * 0.95;
	}


}
