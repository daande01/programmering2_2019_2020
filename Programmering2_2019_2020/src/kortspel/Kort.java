package kortspel;

public class Kort {

	private int valör;
	private int färg;

	public static final String vv[]= {"två","tre","fyra","fem","sex","sju","åtta","nio","tio","knekt","dam","kung","ess"};
	public static final String ff[]= {"hjärter","ruter","spader","klöver"};

	public Kort(int v , int f) {

		valör=v;
		färg= f;

	}

	@Override
	public String toString() {
		return ff[färg] +" "+vv[valör];


	}
	public int getValör() {
		return valör;
	}
	public int getFärg() {

		return färg;
	}


}
