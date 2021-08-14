//Name: Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 14 August 2021.
//Practical 5: Threads

import java.io.*;
 class P5_Q2_PrimeThread_RS extends Thread {
       private PrintStream pOut = null;
       private int limit = 0;
   
      // default constructor. does nothing
      public P5_Q2_PrimeThread_RS() {
     }
// constructor to set the number below which to generate primes
// no output stream is specified, so it outputs to the System.out
public P5_Q2_PrimeThread_RS(int l) {
      limit = l;
      try {
               p.Out = System.out;
      } catch(Exception e) {
                e.printStackTrace();
      }
}
// contructor that set both the number, as above, and specifies an output stream
// if the specified stream is null, uses System.out
public P5_Q2_PrimeThread_RS(int l, OutputStream outS) {
      limit = l;
       try {
           if(outS != null) {
                             pOut = new PrintStream(outS);
                     }else {
                             pout = System.out;
                     }
               } catch(Exception e) {
                           e.printStackTrace();
               }
}
// method that performs the work of the thread,
// in this case the generation of prime numbers.
public void run() {
    // compute prime via the seive
      boolean numbers[] = new boolean(limit+1);
       numbers[0] = false;
       numbers[1] = false;
       for(int i=2; i< numbers.length; i++) {
             numbers[i] = true;
       }
      for(int i=2; i<numbers.length; i++)  {
         if(numbers[i])  {
            for(int j=(2*i); j<numbers.length; j +=i) {
                       numbers[j] = false;
              } // inner for ends
           } // if ends
        } // outer for ends
         for(int i=0; i<numbers.length;i++) {
                 if(numbers[i])
                        p.Out.printIn(i);
          } // for ends
       } // run ends
} // class ends    

