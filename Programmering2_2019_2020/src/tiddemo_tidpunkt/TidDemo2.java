package tiddemo_tidpunkt;


 public class TidDemo2 {
   public static void main(String[] arg) {
     tidpunkt2 t1 = new tidpunkt2(17,8,20);  // skapa ett Tidpunkts-objekt
     tidpunkt2 t2 = new tidpunkt2(23,12);  // skapa ett Tidpunkts-objekt
     
     
     t1.ticka();                    // öka t1 med en sekund
    // t2.ticka();                    // öka t2 med en sekund
     t2.ticka();                    // öka t2 med en sekund till
     String s1 = t1.toString();     // s1 får värdet "17:8:21"
     String s2 = t2.toString();     // s2 får värdet "0:0:1"
     System.out.println(s1);        // skriv ut s1
     System.out.println(s2);        // skriv ut s2
   System.out.println(t2.avläsMin()); 
    
   
   
   
   }   
 }

