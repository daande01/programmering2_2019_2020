
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class F�nster1 extends JFrame {

	static LinkedList<F�nster1> f = new LinkedList<F�nster1>();

	static int r�knare = 1;

	private JButton b = new JButton("click");
	private JLabel l = new JLabel("v�lkommen");

	public F�nster1() {

		this.setLayout(new FlowLayout());
		this.add(b);
		this.add(l);
		this.setSize(new Dimension(200, 200));
		l.setText(Integer.toString(r�knare));
		setVisible(true);

		b.addActionListener(e -> {
			r�knare++;

			f.add(new F�nster1());

			for (F�nster1 f�nster1 : f) {

				f�nster1.l.setText("" + r�knare);

			}

		});

	}

	public static void main(String[] args) {

		f.add(new F�nster1());

	}

}
