public class EvenNumber
{
   public static void evenNum()
   {
       for(integer i=1;i<=50;i++)
       {
           if(Math.mod(i,2)==0)
           {
               system.debug('Even numbers are: '+i);
           }
       }
   }
}
