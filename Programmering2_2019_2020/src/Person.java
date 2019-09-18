

public class Person {

private String namn, adress;
private int ålder;





public static void main(String[] args) {


	Person p1= new Person("daniel","adressen är",37);


	p1.fyllår();

	p1.getName();

	System.out.println(p1.personToString());

	p1.changeName();


	p1.överfemtio()

	p1.dö();


}


}
