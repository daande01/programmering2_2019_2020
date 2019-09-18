import java.util.concurrent.TimeUnit;

public class Hiss {

	private int riktning; // instansvariabel modifierare datatyp variabelnamn

	private int v�ning; // instansvariabel modifierare datatyp variabelnamn

	public Hiss(int v) {

		this(v, 0);

	}

	public Hiss() {
		this(1, 1);
		System.out.println("hissen skapas");

	}

	public Hiss(int v, int r) {
		riktning = r;
		v�ning = v;
		System.out.println("riktning :" + this.riktning + " v�ning:" + this.v�ning);
	}

	public int getV�ning() {

		return v�ning;

	}

	public void setV�ning(int v) throws InterruptedException {

		while (v != v�ning) {

			if (v�ning > v) {
				v�ning--;
			} else {
				v�ning++;
			}

			System.out.println(v�ning);
			TimeUnit.SECONDS.sleep(1);

		}
		v�ning = v;

	}

	public static void main(String[] args) throws InterruptedException {

		Hiss h1 = new Hiss(); // referens variabel
		Hiss h2 = new Hiss(12, 12);
		System.out.println(h1.getV�ning());

		h2.setV�ning(2);

		System.out.println("nu �r du framme vid v�ning" + h2.getV�ning());

	}
}
