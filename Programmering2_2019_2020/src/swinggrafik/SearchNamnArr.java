package swinggrafik;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class SearchNamnArr {

	private JFrame f = new JFrame("namn");
	private JTextArea a = new JTextArea("", 10, 10);
	private JButton b = new JButton("sök i array");
	private JLabel l=new JLabel();
	private NamnArr na = new NamnArr();

	public SearchNamnArr() {

		f.setVisible(true);
		f.setSize(400, 400);
		f.setLayout(new FlowLayout());
		f.add(a);
		f.add(b);
		f.add(l);

		b.addActionListener(e -> {

			String s = a.getText();

			boolean finnsEllerEj = na.checkname(s);
			l.setText(""+finnsEllerEj);

		});

	}

	public static void main(String[] args) {

		new SearchNamnArr();

	}

}
