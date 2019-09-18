package tiddemo_tidpunkt;
 public class Tidpunkt {
   // instansvariabler
   private int t, m, s;
   private boolean visaSek = true;

 

   // metoder
   public void s�tt (int tim, int min, int sek) {
     // kontrollera att tiden �r OK
     if (tim>=0 && tim<24 && min>=0 && min<60 && sek>=0 && sek<60) {
       t=tim; m=min; s=sek;
     }
     else 
       System.out.println("Felaktig tidpunkt");
   }

   public void s�ttVisaSek(boolean visa) {
     visaSek = visa;
   }

   public int avl�sTim () {
     return t;
   }

   public int avl�sMin () {
     return m;
   }

   public int avl�sSek () {
     return s;
   }

   public String toString () { // ger en text med formen tt:mm:ss
     String tid = t + ":" + m; // eller tt:mm
     if (visaSek)
       tid = tid  + ":" +  s; //tt:mm:ss
     return tid;
   }

   public void ticka() {        // stegar fram tiden en sekund
     s = s+1;
     if (s==60) {
       s = 0;
       m = m+1;
     }
     if (m==60) {
       m = 0;
       t = t+1;
     }
     if (t==24) 
       t=0;
   }

   public void ticka(int i) {
     while (i>0) {
       ticka();
       i = i - 1;
     }
   }

}

