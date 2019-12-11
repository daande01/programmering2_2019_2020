package swinggrafik;

import java.util.Arrays;

public class NamnArr {


	private String [] namn=new String[10];


	public NamnArr() {


	namn[0]="daniel";
	namn[1]="göran";
	namn[2]="bertil";

	}

	public boolean checkname(String n) {

			System.out.println(n);
			System.out.println(Arrays.toString(namn));

		for (int i = 0; i < 2; i++) {

			if (namn[i].equals(n)) {
				System.out.println("hej");
			 return true;

			}

		}

		return false;
	}





}
