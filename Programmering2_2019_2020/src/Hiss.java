import java.util.concurrent.TimeUnit;

public class Hiss {

	private int riktning; // instansvariabel modifierare datatyp variabelnamn

	private int våning; // instansvariabel modifierare datatyp variabelnamn

	public Hiss(int v) {

		this(v, 0);

	}

	public Hiss() {
		this(1, 1);
		System.out.println("hissen skapas");

	}

	public Hiss(int v, int r) {
		riktning = r;
		våning = v;
		System.out.println("riktning :" + this.riktning + " våning:" + this.våning);
	}

	public int getVåning() {

		return våning;

	}

	public void setVåning(int v) throws InterruptedException {

		while (v != våning) {

			if (våning > v) {
				våning--;
			} else {
				våning++;
			}

			System.out.println(våning);
			TimeUnit.SECONDS.sleep(1);

		}
		våning = v;

	}

	public static void main(String[] args) throws InterruptedException {

		Hiss h1 = new Hiss(); // referens variabel
		Hiss h2 = new Hiss(12, 12);
		System.out.println(h1.getVåning());

		h2.setVåning(2);

		System.out.println("nu är du framme vid våning" + h2.getVåning());

	}
}
