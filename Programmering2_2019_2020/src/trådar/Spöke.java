package tr�dar;

public class Sp�ke implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub



		while(true) {

			System.out.println("jag �r ett sp�ke");


			try {
			Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

}
