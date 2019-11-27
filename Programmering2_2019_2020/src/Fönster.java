import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fönster extends JFrame {

	static Fönster [] f = new Fönster[30];

	static int räknare = 1;

	private JButton b = new JButton("click");
	private JLabel l  =new JLabel("välkommen");

	public Fönster() {

		this.setLayout(new FlowLayout());
		this.add(b);
		this.add(l);
		this.setSize(new Dimension(200, 200));
		l.setText(Integer.toString(räknare));
		setVisible(true);


		b.addActionListener(e->{
			räknare++;
			f[räknare]=new Fönster();
			System.out.println(Arrays.toString(f));
			for (int i = 0; i <räknare-1; i++) {

				f[i].l.setText(""+räknare);


			}




		});

	}





	public static void main(String[] args) {

		f[0]=new Fönster();
	}







}
