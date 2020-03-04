package hus;

public class testtostring {

	int i=10;


	@Override
	public String toString() {

		return ""+i;
	}





	public static void main(String[] args) {

		testtostring t1 = new testtostring();

				t1.toString();

		Object o1;

		o1=t1;
		o1.toString();

	}


}
