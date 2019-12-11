package swinggrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Fleraknappar extends JFrame {

	JButton [] arrb =new JButton[100];



	public Fleraknappar() {
		this.setLayout(new FlowLayout());
		for (int i = 0; i <arrb.length; i++) {


			arrb[i]= new JButton("text");
			this.add(arrb[i]);

			arrb[i].addActionListener((e)->{



				//((JComponent) e.getSource()).setVisible(false);
				((JComponent) e.getSource()).setOpaque(true);
				((JComponent) e.getSource()).setBackground(Color.BLUE);



			});





		}







		this.setSize(new Dimension(500,550));
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}


	public static void main(String[] args) {

		new Fleraknappar();

	}




}
