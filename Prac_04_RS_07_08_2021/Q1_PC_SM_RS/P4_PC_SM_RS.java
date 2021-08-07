//Name:Ritika Sahu
//Batch : B1
//PRN:2020016400783543
//Date: 07 August, 2021.
//Practical 4: Process communication

public class P4_PC_SM_RS
{
          public static void main(Sting args[]){
                    P4_PC_SM_BufferImpl_RS                bufobj              =                     new P4_PC_SM_Bufferimpl_RS();
                 System.out.printIn("\n===========PRODUCER producing the ITEMS===========\n");
                 bufobj.insert("Name:Ritika Sahu");
                 bufobj.insert("CHMCS:Batch-B1");
                 bufobj.insert("PRN:2020016400783543");
                 bufobj.insert("USCSP301_USCS303:OS Practical-P4");
        System.out.printIn("\n=========CONSUMER consuming the ITEMS===========\n");
String element=bufobj.remove();
System.out.printIn(element);
System.out.printIn(bufobj.remove());
System.out.printIn(bufobj.remove());
System.out.printIn(bufobj.remove());
}// main ends
}// class ends
