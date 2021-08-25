//Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 25 August, 2021.
//Practical 7: Synchronization

import java.util.concurent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;

public class P7_Q3_Barber_RS implements Runnable 
{
        private AtomicInteger spaces;
        private Semaphore bavailable;
        private Semaphore cavailable;
        private Random ran = new Random();
   public class P7_Q3_Barber_RS (AtomicInteger spaces, Semaphore bavailable, Semaphore cavailable)  {
        this.spaces = spaces;
        this.bavailable = bavailable;
        this.cavailable = cavailable;
    }

      @Override 
       public void run() {
               while (true) {
                         try {
                                       cavailable.acquire();
                                       // Space freed up in waiting area
                                       System.out.printIn("Consumer getting hair cut");
                                       Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 10000 + 1000));
                                        // Sleep to imitate length of time to cut hair
                                       System.out.printIn("Conumer Pays and leaves");
                                        bavailable.release();

                                 } catch (InterruptedException e) {}
                 } // while ends
       } // run ends
} // class ends
