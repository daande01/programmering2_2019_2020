package tiddemo_tidpunkt;

public class R�knare {

	//j
	private int r�knare;
	private int max;
	private int min;

	public R�knare(int r,int max, int min) {

		if (r<=20 && r>=10) {

			r�knare= r;
			this.max=max;
			this.min=min;
		}else {

			System.out.println("du har angivit ett felaktigt v�rde");

		}


	}

	public void �ka() {

		if (r�knare<max) {
		r�knare++;
		System.out.println(r�knare);
		}else {

			System.out.println("du har n�tt max gr�nsen");
		}
	}
	public void minska() {
		if (r�knare>min) {
		r�knare--;
		System.out.println(r�knare);
		}else {

			System.out.println("du har n�tt min gr�nsen");
		}
	}


	public static void main(String[] args) {

		R�knare r1= new R�knare(12,30,0);

		for (int i = 0; i < 100; i++) {

			r1.minska();

		}


	}


}
