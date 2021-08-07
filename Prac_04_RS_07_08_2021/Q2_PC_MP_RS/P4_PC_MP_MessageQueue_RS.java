//Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 07 August, 2021.
//Practical 4: Process communication

import java.util.Vector;
public class P4_PC_MP_MessageQueue_RS_<E> implements P4_PC_MP_Channel_RS<E>
{
     private Vector<E> queue;

     public P4_PC_MP_MessageQueue_RS(){
            queue = new Vector<E>();
}

//This implements a nonblocking send
public void send(E item){
        queue.addElement(item);
}// send() ends

//This implements a nonblocking receive
public E receive(){
       if(queue.size()==0)
             return null;
       else
            return.queue.remove(0);
     }//receive() ends
}// class ends

