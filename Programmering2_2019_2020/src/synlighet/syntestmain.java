package synlighet;

import synlighet2.synlighetsuper;

public class syntestmain extends synlighetsuper {

/*
 * sdnjkhfsdfjk sdfkjsdfsdjkf fnsdbjkfsd f
 * sdfhs fsdf
 * sdf hsdsdsdf
 */
	public void printprotectedsupervariablei () {

	System.out.println(	this.i);


	}




public static void main(String[] args) {

	syntestmain m1= new syntestmain();
	m1.printprotectedsupervariablei();
	System.out.println(m1.i);



	syntest1 t= new syntest1();

	System.out.print(t.pri);







}
}
