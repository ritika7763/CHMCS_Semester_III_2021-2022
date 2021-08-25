//Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 25 August, 2021.
//Practical 7: Synchronization

public interface P7_Q1_Buffer_RS
{
                 public void set(int value) throws InterruptedException;

                 public int get() throws InterruptedException;
}