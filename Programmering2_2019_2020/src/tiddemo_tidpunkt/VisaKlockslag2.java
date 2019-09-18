package tiddemo_tidpunkt;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VisaKlockslag2 {
  public static void main (String[] arg) {
    TidVisare v = new TidVisare(); // skapa ett TidVisare-objekt
  }
}
class TidVisare extends JFrame {
  public TidVisare() { // Konstruktor, anropas automatiskt
    Tidpunkt tp = new Tidpunkt();
    LocalTime t = LocalTime.now();
    tp.sätt(t.getHour(), t.getMinute(), t.getSecond());
    JLabel l = new JLabel(tp.toString(), JLabel.CENTER);
    add(l);  // se kommentar på sidan 39 om äldre Javaversioner
    l.setOpaque(true);        // ogenomskinlig bakgrund
    l.setBackground(Color.black);
    l.setForeground(Color.white);
    l.setFont(new Font("SansSerif", Font.BOLD, 24));
    setSize(200,75);          // fönstrets storlek
    setVisible(true);         // gör fönstret synligt
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    TimerTask repeatedTask = new TimerTask() {
        @Override
		public void run() {
            tp.ticka();
            l.setText(tp.toString());
        }
    };
    Timer timer = new Timer("Timer");

    long delay = 1000L;
    long period = 1000L ;
    timer.scheduleAtFixedRate(repeatedTask, delay, period);





  }
}