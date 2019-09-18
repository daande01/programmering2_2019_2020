package tiddemo_tidpunkt;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class VisaKlocka2 {
  public static void main (String[] arg) {
    KlockVisare v = new KlockVisare(); // skapa en KlockVisare
  }
}
class KlockVisare extends JFrame implements ActionListener {
  private Tidpunkt tp = new Tidpunkt();
  private JLabel l;
  public KlockVisare() { // Konstruktor, anropas automatiskt
    javax.swing.Timer tim = new javax.swing.Timer(1000, this);
    tim.start();        // starta timern
    LocalTime t = LocalTime.now();
    tp.sätt(t.getHour(), t.getMinute(), t.getSecond());
    l = new JLabel(tp.toString(), JLabel.CENTER);
    add(l); // se kommentar på sidan 39 om äldre Javaversioner
    l.setOpaque(true);        // ogenomskinlig bakgrund
    l.setBackground(Color.black);
    l.setForeground(Color.white);
    l.setFont(new Font("SansSerif", Font.BOLD, 24));
    setSize(200,75);          // fönstrets storlek
    setVisible(true);         // gör fönstret synligt
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

}