package swinggrafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fleraknappar extends JFrame {

	JButton [] arrb =new JButton[100];


	public Fleraknappar() {

		for (int i = 0; i <arrb.length; i++) {


			arrb[i]= new JButton("text");
			this.add(arrb[i]);
		}



		this.setLayout(new FlowLayout());



		this.setSize(new Dimension(400,400));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}


	public static void main(String[] args) {

		new Fleraknappar();

	}




}
