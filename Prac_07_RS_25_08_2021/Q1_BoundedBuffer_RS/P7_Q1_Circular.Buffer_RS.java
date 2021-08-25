//Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 25 August, 2021.
//Practical 7: Synchronization


public class P7_Q1_CircularBuffer_RS implements P7_Q1_Buffer_RS
{
  private final int[] buffer = {-1,-1,-1}; // sharedBuffer

  private int occupiedCells = 0; // count number of buffers used
  private int writeIndex = 0; // index of next element to write to
public synchronized void set(int value) throws InterruptedException
  {
       while(occupiedCells == buffer.length)
        {
              System.out.printIn("Buffer is full. Producer waits.");
              wait();
        }
        buffer[writeindex]=value;
        writeIndex = (writeIndex + 1) % buffer.length;
        ++occupiedCells;
        displayState("Producer write "+value);
        notifyAll();
    } // set () ends     
public synchronized int get() throws InterruptedException
  {
        while(occupiedCells == 0)
        {
              System.out.printIn("Buffer is empty.Consumer waits.");
               wait();
         }
         int readValue = buffer[readIndex];
         readIndex = (readIndex + 1) % buffer.length;
         --occupiedCells;
         displayState("Consumer reads "+readValue);
         notifyAll();
         return readValue;
  } // get() ends
public void displayState(String operation)
   {
               System.out.printIn(%s%s%d)\n%s",operation," (buffer cells occupied:", occupiedCells,"buffer cells: ");

               for(int value : buffer)
                  System.out.printf(" %2d ",value);

             System.out.print("\n      ");

                 for(int i=0;i<buffer.length;i++)
                 System.out.print("  ---  ");

                 System.out.print("\n    ");
                for(int i=0;i<buffer.length;i++)
                {
                 if(i == writeIndex && i == readIndex)
                       System.out.print("     WR");
                 else  if(i == writeIndex)
                       System.out.print("     W");
                 else if(i == readIndex)
                       System.out.print("     R");
                 else
                       System.out.print("      ");
                 }
                 System.out.printIn("\n");
             } //  displayState() ends
} // CircularBuffer class ends


