package relationer.bilrelationer;

public class Mainclass {

	public static void main(String[] args) {

		Bil�gare b1 = new Bil�gare("daniel");
		Bil�gare b2 = new Bil�gare("g�ran");

		Bil bil1 = new Bil("123ABC");
		Bil bil2 = new Bil("456DEF");

		b1.k�p(bil1);

		System.out.println(b1.getName());
	}

}
