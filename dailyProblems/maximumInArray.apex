public class maximumInArray 
{
   public static Integer maxElement(list<integer> mylist)
   {
       
       
           integer max = mylist[0];
           for(integer i=0;i<mylist.size();i++)
       {
           if(mylist[i]>max)
           {
               max=mylist[i];
           }

            
       }
       return max;
   }
}

/*
anonymous window
List<Integer> myArray = new List<Integer>{11, 23, 37, 49, 50};
Integer max = maximumInArray.maxElement(myArray);
System.debug('Sum of array elements: ' + max);
*/
