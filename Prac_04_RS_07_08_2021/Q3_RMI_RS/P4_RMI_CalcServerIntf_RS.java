//Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 07 August, 2021.
//Practical 4: Process communication

import java.rmi.*;
public interface P4_RMI_CalcServerInt_RS extends Remote
{
   int add(int a, int b) throws RemoteException;      
   int subtract(int a, int b) throws RemoteException;    
   int  multiply(int a, int b) throws RemoteException;   
   int divide(int a, int b) throws RemoteException;   
}// interface ends
