package tr�dar;

public class Tr�dstart {


	boll b1 = new boll();

	Sp�ke s1= new Sp�ke();


	Thread t1 = new Thread(b1);
	Thread t2 = new Thread(s1);


	public Tr�dstart() {


		t1.start();
		t2.start();


	}

public static void main(String[] args) {
	new Tr�dstart();
}

}
