public class sumOfArrayElements 
{
   public static Integer sumOfElements(list<integer> arr)
   {
       Integer sum = 0;
       for(Integer num : arr)
       {
           sum += num;
       }
       return sum;
   }
}

/* 
anonymous window
List<Integer> myArray = new List<Integer>{11, 23, 37, 49, 50};
Integer max = maximumInArray.maxElement(myArray);
System.debug('Sum of array elements: ' + max);
*/
