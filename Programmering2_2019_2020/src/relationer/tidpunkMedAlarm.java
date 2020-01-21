package relationer;

import java.awt.Toolkit;

public class tidpunkMedAlarm extends tidpunkt2 {
	   private int at, am, as; 
	   private boolean ring = false; 

	   public void s�ttAlarm (int tim, int min, int sek) {
	     if ( tim>=0 && tim<24 && min>=0 && min<60 && sek>=0 && sek<60) {
	       at=tim; am=min; as=sek; ring = true;
	     }
	     else 
	       System.out.println("Felaktig tidpunkt");
	   }

	   public void st�ngAlarm() {
	     ring = false; 
	   }

	   @Override
	   public void ticka() {
	     super.ticka();
	     if (ring && avl�sTim()==at && avl�sMin()==am && avl�sSek()==as) {
	       Toolkit.getDefaultToolkit().beep();
	     }
	   }
	 }