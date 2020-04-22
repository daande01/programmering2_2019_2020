package trådar;

public class Trådstart {


	boll b1 = new boll();

	Spöke s1= new Spöke();


	Thread t1 = new Thread(b1);
	Thread t2 = new Thread(s1);


	public Trådstart() {


		t1.start();
		t2.start();


	}

public static void main(String[] args) {
	new Trådstart();
}

}
