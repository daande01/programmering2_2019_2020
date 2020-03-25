package databas;

import java.awt.FlowLayout;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Personinfo extends JFrame {



	JTextField fnamn= new JTextField(20);
	JButton b1 = new JButton("send form");
	databasconn c;



	public Personinfo() {


		setLayout(new FlowLayout());
		setVisible(true);
		add(fnamn);
		add(b1);
		setSize(400,400);

		b1.addActionListener(e->{

			try {
				storetodb();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}



		});





	}

	private void storetodb() throws SQLException  {

		try {
			 c= new databasconn();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		String n =fnamn.getText();

		c.insert(n);



	}

	public static void main(String[] args) {


		new Personinfo();
	}



}
