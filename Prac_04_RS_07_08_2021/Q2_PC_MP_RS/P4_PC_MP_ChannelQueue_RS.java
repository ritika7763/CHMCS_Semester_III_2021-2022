Write  a java program for producer - consumer problem using message passing.

//Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 07 August, 2021.
//Practical 4: Process communication

public interface P4_PC_MP_Channel_RS<E>
{ 
            // Send a message to the channel
            public void send(E item);

            //Receive a message from the channel
           public E receive();
}// interface ends
