package tiddemo_tidpunkt;
import javax.swing.*;



 public class TidDemo {
   public static void main(String[] arg) {
     Tidpunkt t1 = new Tidpunkt();  // skapa ett Tidpunkts-objekt
    Tidpunkt t2 = new Tidpunkt();  // skapa ett Tidpunkts-objekt
     int a=17, b=8, c=20;
     t1.s�tt(a, b, c);              // l�gg tiden 17:08:20 i t1
     t2.s�tt(23, 59, 59);           // l�gg tiden 23:59:59 i t2
     t1.ticka();                    // �ka t1 med en sekund
     t2.ticka();                    // �ka t2 med en sekund
     t2.ticka(5);                 // �ka t2 med en sekund till
     String s1 = t1.toString();     // s1 f�r v�rdet "17:8:21"
     String s2 = t2.toString();     // s2 f�r v�rdet "0:0:1"
     System.out.println(s1);        // skriv ut s1
     System.out.println(s2);        // skriv ut s2
   System.out.println(t2.avl�sMin()); 
    
   
   
   
   }   
 }

