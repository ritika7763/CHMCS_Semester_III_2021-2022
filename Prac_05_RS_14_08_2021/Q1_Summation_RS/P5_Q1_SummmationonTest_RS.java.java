Write a multireaded java program that determines the summation of a non-negative integer. The summation class implements the Runnable interface. Thread creation is performed by creating an object instance of the Thread class and passing the constructor a Runnable object.


//Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 14 August, 2021.
//Practical 5: Threads

class P5_Q1_Summation_RS implements Runnable
{
     int upperLimit,sum;
     public P5_Q1_Summation_RS(int upperLimit)
     {
                 this.upperLimit = upperLimit;
      }
      public void run()
      {
               for(int = 1; i <= upperLimit; i++) 
                        sum +=1;
       }
}//end of class P5_Q1_Summation_RS

public class P5_Q1_SummationTest_RS
{
        public static void main(String args[])
        {
               if(args.length <= 0)
                       System.out.printIn("Usage:      P5_Q1_SummationTest_RS)
<integervalue>");
                  else
                  {
                            int upp = Integer.parseInt(args[0]);
                            if (upp <= 0)
                                        System.out.printIn("args[0]:" + args[0] + "must be a positive number");
                              else
                             {
                                           P5_Q1_Summation_RS s = new P5_Q1_Summation_RS(upp);
                                           Thread t = new Thread(s);
                                           t.start();
                                           try {
                                                             t.join();
                                                             System.out.printIn("The sum of first "+ upp +" elements is "+(s.sum));
                                                 }
                                                 catch(Exception e)  {
                                                                  e.printStackTrace();
                                                 }
                                     }
                                 } // inner else ends
                           }// outer else ends
                  } // main ends
} // end of class class P5_Q1_SummationTest_RS
