package relationer;

public class Person {

	private String namn, adress;
	private Person makeMaka;

	public Person(String n) {

		namn = n;

	}

	public String avl�sNamn() {

		return namn;

	}

	public void s�ttAdress(String adr) {

		adress = adr;
	}

	public String avl�sAdress() {

		return adress;
	}

	public void br�llop(Person p) {
		makeMaka = p;
		p.makeMaka = this;
	}

	public void skillsm�ssa() {

		makeMaka.makeMaka = null;
		makeMaka = null;
	}

	public Person giftMed() {

		return makeMaka;
	}

	public static void main(String[] arg) {

		Person p1 = new Person("evert");
		Person p2 = new Person("ninni");

		p1.br�llop(p2);

		System.out.print(p2.giftMed().avl�sNamn());

	}
}
