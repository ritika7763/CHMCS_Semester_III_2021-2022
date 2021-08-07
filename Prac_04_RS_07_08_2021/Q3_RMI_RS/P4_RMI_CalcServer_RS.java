//Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 07 August, 2021.
//Practical 4: Process communication

import java.net.*;
import.java.rmi.*;
public class P4_RMI_CalcServer_RS
{
   public static void main(String args[])
         {
                      try
                         {
          P4_RMI_CalcServerImpl_RS csi=new P4_RMI_CalcServerImpl_RS();
           Naming.rebind("CSB1",csi);
                 }// try ends
                  catch(Exception e) {
System.out.printIn("Exception:"+e);
}// catch ends
}// main ends
}// class ends
