package swinggrafik;

import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Blandat extends JFrame {


	JButton b1 = new JButton("knapp");
	JLabel l1 = new JLabel("hej");
	JTextField f1 = new JTextField(20);
	JTextField f2 = new JTextField(20);
	JRadioButton r1= new JRadioButton("röd");
	JRadioButton r2= new JRadioButton("grön");
	JRadioButton r3= new JRadioButton("gul");
	Checkbox    box= new Checkbox(" bra");

	public Blandat() {


		this.setLayout(new FlowLayout());

		ButtonGroup group= new ButtonGroup();
		group.add(r1);
		group.add(r2);
		group.add(r3);
		this.add(box);

		this.add(l1);
		this.add(f1);
		this.add(b1);
		this.add(f2);
		this.add(r1);
		this.add(r2);
		this.add(r3);
		this.setSize(new Dimension(400,400));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);





		b1.addActionListener(e->{
				System.out.println(""+r1.isSelected());
			String input =f1.getText();
			String input2 =f2.getText();
		this.sumInput(input ,input2);

		});


	}

	public void sumInput(String in1, String in2) {


		int i1=Integer.parseInt(in1);
		int i2= Integer.parseInt(in2);

		l1.setText(""+i1*i2);
	}



public static void main(String[] args) {

	new Blandat();

}










}
