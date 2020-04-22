package trådar;

public class boll implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {

			System.out.println("jag är en boll");


			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}



	}

}
