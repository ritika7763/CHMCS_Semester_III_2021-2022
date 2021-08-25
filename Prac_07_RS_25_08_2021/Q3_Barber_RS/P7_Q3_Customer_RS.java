//Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 25 August, 2021.
//Practical 7: Synchronization

import java.util.concurent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;

public class P7_Q3_Customer_RS implements Runnable 
{
        private AtomicInteger spaces;
        private Semaphore bavailable;
        private Semaphore cavailable;
        private Random ran = new Random();
   public class P7_Q3_Customer_RS (AtomicInteger spaces, Semaphore bavailable, Semaphore cavailable)  {
        this.spaces = spaces;
        this.bavailable = bavailable;
        this.cavailable = cavailable;
    }

      @Override 
       public void run() {
               try {
                               cavailable.release();
                               if(bavailable.hasQueuedThreads()) {
                                          spaces.decrementAndGet();
                                          System.out.printIn("Customer in waiting area");
                                          bavailable.acquire();
                                          spaces.incrementAndGet();
                                }
                                 else
                                 {
                                          bavailable.acquire();
                                  }
                       } catch (InterruptedException e) {}
              } // run() ends
} // P7_Q3_Customer_RS class