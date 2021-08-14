QUESTION 3:

The Fibonacci sequence is the series of numbers 0,1,1,2,3,5,8,...Formally, it can be expressed as: fib1 = 0, fib1 = fib(n-1)+fib(n-2).Write a mutireaded program that generates the Fibonacci sequence using either the Java.

//Name: Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 14 August 2021.
//Practical 5: Threads

import java.util.ArrayList;
import java.util.Scanner;
 public class P5_Q3_Fibo_RS
{
        public static void main(String args[]) {
               Scanner scan = new Scanner(System.in);
               ArrayList al = new ArrayList();
               int a;
               System.out.print("enter the number: ");
               a = scan.nextInt();
               P5_Q3_FiboThread_RS fibTh = new  P5_Q3_FiboThread_RS(a);
               fibTh.start();
               try {
                               fibTh.join();
               } catch(InterruptedException ex) {
                               ex.printStackTrace();
               }

               int fseries[] = fibTh.arr;

               System.out.printIn("First " + a + " fibonacc numbers are:");
               for(int i = 0; i<a;i++)
                         System.out.print(fseries[i] + " ");
               }
          } // main ends
} // class ends
class P5_Q3_FiboThread_RS extends Thread
{
              private int a,i;
              Thread t;
              int arr[];

              public  P5_Q3_FiboThread_RS(int a) {
                        this.a = a;
                         arr = new int[a];
            }
             public void run() {
                          arr[0] = 0;
                          arr[1] = 1;
                          for(i = 2;i < a; i++) {
                                 arr[i] = arr[i-1] + arr[i-2];
                           }
              } // run ends
} // class ends

             