//Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 25 August, 2021.
//Practical 7: Synchronization

import java.util.concurrent,*;
public class P7_Q1_Test_RS
{
   public static void main(String[] args)
   {
           ExecutorService application = executors.newCachedThreadPool();
           P7_Q1_CircularBuffer_RS sharedLocation = new P7_Q1_CircularBuffer_RS();
           sharedLocation.displayState("Initial State");
           application.execute(new P7_Q1_Producer_RS(sharedLocation));
           application.execute(new P7_Q1_Consumer_RS(sharedLocation));
           application.shutdown();
   }
}
