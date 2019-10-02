package kortspel;

import java.util.Collections;
import java.util.LinkedList;

public class Kortlek {

	private LinkedList<Kort> lek = new LinkedList<Kort>(); // skapar lista som lagrar kort

	public Kortlek() {

		for (int i = 0; i < Kort.ff.length; i++) { // h�mtar klassvariabeln ff fr�n kort och tar reda p� l�ngden

			for (int j = 0; j < Kort.vv.length; j++) {

				lek.add(new Kort(j, i)); // l�gger till alla kort i ording i kortleks listan

			}

		}
	}

	@Override
	public String toString() {

		int i =0;
		for (Kort kort : lek) {

			System.out.println(i+""+kort.toString());
			i++;
		}

		return null;

	}

	public void blanda() {

		Collections.shuffle(lek);
	}
	public void blanda2() {
for (int j = 0; j < 100000; j++) {


		for (int i = 0; i < 52; i++) {

			Kort temp=lek.get(i);
			int pos= (int)( Math.random()*52);

			lek.set(i, lek.get(pos)); //tar kort f�n slumpad pos l�gger detta kort p� plats i
			lek.set(pos, temp);

		}
}
	}


	public static void main(String[] args) {
		Kortlek k1 = new Kortlek();
		k1.blanda2();
		k1.toString();

	}
}
