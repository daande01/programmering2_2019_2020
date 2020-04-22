package trådar;

public class Spöke implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub



		while(true) {

			System.out.println("jag är ett spöke");


			try {
			Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

}
