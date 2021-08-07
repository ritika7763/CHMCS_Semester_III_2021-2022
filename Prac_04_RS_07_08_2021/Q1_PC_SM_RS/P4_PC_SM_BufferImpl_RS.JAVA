Write a java program for producer-consumer problem using shared memory.

//Name: Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 07 August, 2021.
//Practical 4: Process communication

public clas P4_PC_SM_BufferImpl_RS implements P4_PC_SM_Buffer_RS
{
     private static final int BUFFER_SIZE = 5;
     private String[] elemnts;
     private int in, out, count;
public P4_PC_SM_BufferImpl_RS()         //  constructor initializing the variables to initial value
{
     count=0;
     in=0;
     out=0;
     elements=new String[BUFFER_SIZE];
} //  constructor ends
// Producer call this method
public void insert(String item)
{
           while(count==BUFFER_SIZE)
                  ;//do nothing as there is no free space
           // add an item to the buffer
           elements[in]=item;
           in=(in+1)% BUFFER_SIZE;
           ++COUNT;
           System.out.printIn("Item Produced:"+item+"at position"+in+"having total items"+count);
}//insert() ends
// Consumers call this method
public String remove()
{
            String item;
            while(count==0)
                    ;// do nothing as there is nothing to consume
             // remove an item from the buffer
             item= elements[out];
             out=(out+1)% BUFFER_SIZE;
             --count;
             System.out.printIn("Item Consumed:"+item+"from position"+out+"remaining total items"+count);
             return item;
             }// remove() ends
}// class ends
