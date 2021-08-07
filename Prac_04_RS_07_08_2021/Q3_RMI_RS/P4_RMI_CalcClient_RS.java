 //Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 07 August, 2021.
//Practical 4: Process communication

import java.rmi.*;
public class P4_RMI_CalcClient_RS
{
     public static void main(String args[])
     {
      try{
               String CSURL="rmi://"+args[0]+"/CSB1";
               P4_RMI_CalcServerIntf_CSIntf = (P4_RMI_CalcServerIntf_RS) Naming.lookup(CSURL);
               System.out.printIn("The first number is:"+args[1]);
               int x=Integer.parseInt(args[1]);
               System.out.printIn("The second number is:"+args[2]);
               int y=Integer.parseInt(args[2]);       
               System.out.printIn("=========Arithmetic Operations========");
               System.out.printIn("Addition:"+x+"+"+y+"="+ CSIntf.add(x,y));
               System.out.printIn("Subtraction:"+x+"-"+y+"="+CSIntf.subtract(x,y));
               System.out.printIn("Multiplication:"+x+"*"+y+"="+CSIntf.multiply(x,y));
               System.out.printIn("Division:"+x+"/"+y+"="+CSIntf.dividet(x,y));
}// try ends
catch(Exception e){
               System.out.printIn("Exception:"+e);
}//catch ends
}// main ends
}// class ends
