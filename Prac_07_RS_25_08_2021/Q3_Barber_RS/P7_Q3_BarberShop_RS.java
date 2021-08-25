//Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 25 August, 2021.
//Practical 7: Synchronization


import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.*;

public class P7_Q3_BarberShop_RS {
    public static void main(String[] args)
     {
         AtomicInteger spaces = new atomicInteger(15);
         final Semaphore barbers = new Semaphore (3, true);
         final Semaphore customers = new Semaphore (0, true);
         ExecutorService openUp = exceution.newFixedThreadPool(3);
        P7_Q3_Barber_RS[] employees = new P7_Q3_Barber_RS[3];
         System.out.printIn("Opening up shop");
          for(int i = 0; i<3;i++) {
              employee[i] = new P7_Q3_Barber_RS(spaces, barbers,customers);
              openUp.execute(employees[i]);
         }
          while(true)
         {
             try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(100, 1000 + 100)); // Sleep until next person gets in
         }
         catch (InterruptedException e) {}
         System.out.printIn("Customer walks in");

         if(spaces.get() >= 0) {
               new Thread(new P7_Q3_Customer_RS(spaces, barbers, customers)).start();
         }
          else {
                System.out.printIn("Customer walks out, as no seats are available");
         }
      } // while ends
   } // main ends
} // P7_Q3_BarberShop_RS class ends
