
//Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 07 August, 2021.
//Practical 4: Process communication

import java.util.Date;
public class P4_PC_MP_RS
{
           public static void main(String args[])
           {
                   //Producer and Consumer process
                   P4_PC_MP_Channel_rs<Date>  mailBox = new P4_PC_MP_Messagequeue_RS<Date>(i);
                   int i=0;
                   do
                   {
                           Date message = new Date();
                           System.out.printIn("Producer produced-"(i+1)+":"+message);
                           mailBox.send(message);
                           Date rightNow = mailBox.receive();
                           if(rightNow !=null)
                           {
                                          System.out.printIn("Consumer consumed-"+(i+1)+":"+rightNow);
                           }
                            i++;
                      }while(i<10);
             }// main ends
}//class ends
