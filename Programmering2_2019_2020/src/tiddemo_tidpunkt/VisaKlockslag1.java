package tiddemo_tidpunkt;

import java.time.LocalTime;
public class VisaKlockslag1 {
  public static void main (String[] arg) {
    Tidpunkt tp = new Tidpunkt();
    LocalTime t = LocalTime.now();
    tp.sätt(t.getHour(), t.getMinute(), t.getSecond());
    System.out.println("Klockan är " + tp.toString());
  }
}