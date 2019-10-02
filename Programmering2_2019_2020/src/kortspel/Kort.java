package kortspel;

public class Kort {

	private int val�r;
	private int f�rg;

	public static final String vv[]= {"tv�","tre","fyra","fem","sex","sju","�tta","nio","tio","knekt","dam","kung","ess"};
	public static final String ff[]= {"hj�rter","ruter","spader","kl�ver"};

	public Kort(int v , int f) {

		val�r=v;
		f�rg= f;

	}

	@Override
	public String toString() {
		return ff[f�rg] +" "+vv[val�r];


	}
	public int getVal�r() {
		return val�r;
	}
	public int getF�rg() {

		return f�rg;
	}


}
