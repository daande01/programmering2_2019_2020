import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class F�nster extends JFrame {

	static F�nster [] f = new F�nster[30];

	static int r�knare = 1;

	private JButton b = new JButton("click");
	private JLabel l  =new JLabel("v�lkommen");

	public F�nster() {

		this.setLayout(new FlowLayout());
		this.add(b);
		this.add(l);
		this.setSize(new Dimension(200, 200));
		l.setText(Integer.toString(r�knare));
		setVisible(true);


		b.addActionListener(e->{
			r�knare++;
			f[r�knare]=new F�nster();
			System.out.println(Arrays.toString(f));
			for (int i = 0; i <r�knare-1; i++) {

				f[i].l.setText(""+r�knare);


			}




		});

	}





	public static void main(String[] args) {

		f[0]=new F�nster();
	}







}
