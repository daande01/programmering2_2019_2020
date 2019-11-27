
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fönster1 extends JFrame {

	static LinkedList<Fönster1> f = new LinkedList<Fönster1>();

	static int räknare = 1;

	private JButton b = new JButton("click");
	private JLabel l = new JLabel("välkommen");

	public Fönster1() {

		this.setLayout(new FlowLayout());
		this.add(b);
		this.add(l);
		this.setSize(new Dimension(200, 200));
		l.setText(Integer.toString(räknare));
		setVisible(true);

		b.addActionListener(e -> {
			räknare++;

			f.add(new Fönster1());

			for (Fönster1 fönster1 : f) {

				fönster1.l.setText("" + räknare);

			}

		});

	}

	public static void main(String[] args) {

		f.add(new Fönster1());

	}

}
