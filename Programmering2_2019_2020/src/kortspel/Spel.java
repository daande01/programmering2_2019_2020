package kortspel;

public class Spel {

	public static void main(String[] args) {

		Kort kortlek[] = new Kort[52];

		for (int i = 0; i < kortlek.length; i++) {

			int v = ((int) (Math.random() * 13));
			int f = ((int) (Math.random() * 4));

			kortlek[i] = new Kort(v, f);

		}

		for (int i = 0; i < kortlek.length; i++) {

			System.out.println("" + i + "" + kortlek[i].toString());
		}

	}

}
