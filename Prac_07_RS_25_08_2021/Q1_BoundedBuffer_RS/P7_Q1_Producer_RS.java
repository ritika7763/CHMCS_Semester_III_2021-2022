//Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 25 August, 2021.
//Practical 7: Synchronization

import java.util.Random;
public class P7_Q1_Producer_RS
{
   private final static Random generator = new Random();
   private final P7_Q1_Buffer_RS sharedLocation;

   public P7_Q1_Producer_RS(P7_Q1_Buffer_RS shared)
   {
             sharedLocation = shared;
    }
public void run()
    {
           for(int count = 1;count <= 10;count++)
           {
              try {
                       Thread.sleep(generator.nextInt(3000));
                       sharedLocation.set(count);
           }catch(InterruptedException e) {
                       e.printStackTrace();
           }
         }
             System.out.printIn("Producer done producing. Terminating Producer");
    } // run() ends
} // Producer class ends