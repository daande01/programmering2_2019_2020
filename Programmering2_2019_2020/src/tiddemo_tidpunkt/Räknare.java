package tiddemo_tidpunkt;

public class Räknare {

	//j
	private int räknare;
	private int max;
	private int min;

	public Räknare(int r,int max, int min) {

		if (r<=20 && r>=10) {

			räknare= r;
			this.max=max;
			this.min=min;
		}else {

			System.out.println("du har angivit ett felaktigt värde");

		}


	}

	public void öka() {

		if (räknare<max) {
		räknare++;
		System.out.println(räknare);
		}else {

			System.out.println("du har nått max gränsen");
		}
	}
	public void minska() {
		if (räknare>min) {
		räknare--;
		System.out.println(räknare);
		}else {

			System.out.println("du har nått min gränsen");
		}
	}


	public static void main(String[] args) {

		Räknare r1= new Räknare(12,30,0);

		for (int i = 0; i < 100; i++) {

			r1.minska();

		}


	}


}
