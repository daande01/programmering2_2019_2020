package swinggrafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Blandat extends JFrame {


	JButton b1 = new JButton("knapp");
	JLabel l1 = new JLabel("hej");
	JTextField f1 = new JTextField(20);

	public Blandat() {


		this.setLayout(new FlowLayout());

		this.add(l1);
		this.add(f1);
		this.add(b1);
		this.setSize(new Dimension(400,400));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		b1.addActionListener(e->{

			String input =f1.getText();

			l1.setText(input);

		});


	}


public static void main(String[] args) {

	new Blandat();

}










}
