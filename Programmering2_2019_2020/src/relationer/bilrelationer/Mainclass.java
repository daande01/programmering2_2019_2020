package relationer.bilrelationer;

public class Mainclass {

	public static void main(String[] args) {

		Bilägare b1 = new Bilägare("daniel");
		Bilägare b2 = new Bilägare("göran");

		Bil bil1 = new Bil("123ABC");
		Bil bil2 = new Bil("456DEF");

		b1.köp(bil1);

		// köp bil


		// fråga vem som ärger bil1
		// fråga vem som äger bil2
		// vilken bil äger bilägare b1
		// vilken bil äger bilägare b2
		// köpa bil av annan person

		// fråga vem som ärger bil1
		// fråga vem som äger bil2
		// vilken bil äger bilägare b1
				// vilken bil äger bilägare b2

		System.out.println(b1.getName());
	}

}
