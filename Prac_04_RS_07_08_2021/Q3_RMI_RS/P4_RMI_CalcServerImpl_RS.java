//Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 07 August, 2021.
//Practical 4: Process communication

import java.rmi.*;
import java.rmi.server.*;
public calss P4_RMI_CalcServerImpl_RS extends UnicastremoteObject implements P4_RMI_CalcServerintf_RS
{
public P4_RMI_CalcServerImpl_RS() throws RemoteException{
}
public int add(int a, int b) throws RemoteException
{
    return a+b;
}
public int subtract(int a, int b) throws RemoteException
{
    return a-b;
}
public int multiply(int a, int b) throws RemoteException
{
    return a*b;
}
public int divide(int a, int b) throws RemoteException
{
    return a/b;
}  
}// class ends  

