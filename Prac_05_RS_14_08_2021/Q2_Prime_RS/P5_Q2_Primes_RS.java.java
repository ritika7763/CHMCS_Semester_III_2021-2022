QUESTION 2:

Write a multireaded java program that outputs prime numbers. This program should work as follows: The user will run the program and will enter a number on the command line. The program will then create a seperate thread that outputs all the  prime numbers less than or equal to the number entered by the user.

//Name: Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 14 August, 2021.
//Practical 5: Threads

import java.io.*;
import.java.util.*;
public class P5_Q2_Primes_RS {
           public static void main(String args[]) {
                try  {
                                P5_Q2_PrimesThread_RS pt = null;
                                
                                System.out.print("Enter a number > ");
                                Scanner scan= new Scanner(System.in);
                                int limit = scan.nextInt();
                                System.out.print("Enter a file name to store  the results > ");
                                String fName = scan.next();
                                if (fName.length() > 0)
                                       pt = new P5_Q2_PrimesThread_RS(limit, new FileOutputStream(fName));
                               else
                                      pt = new  P5_Q2_PrimesThread_RS(limit);
                               pt.run();
                     } catch (Exception e)  {
                                         e.printStackTrace();
                     }
                } // main ends
} // class ends







