//Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 25 August, 2021.
//Practical 7: Synchronization

import java.util.Random;
public class P7_Q1_Consumer_RS implements Runnable
{
   private final static Random generator = new Random();
   private final P7_Q1_Buffer_RS sharedLocation;
   public P7_Q1_Consumer_RS(P7_Q1_Buffer_RS shared)
   {
             sharedLocation = shared;
    }
public void run()
    {
               int sum =0;
               for(int count = 1;count <=0;count++)
               {
                 try {
                              Thread.sleep(generator.nextInt(3000));
                               sum += sharedLocation.get();
                 }catch(InterruptedException e) {
                                 e,printStackTrace();
                  }
              }
                System.out.printf("\n%s   %d\n%s\n","Consumer read values totaling", sum,"Terminating Consumer");
       } // run() ends
} // Consumer class ends