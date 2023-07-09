/* You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.

Example 1:

Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing 
number is 6. */
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        HashSet<Integer> h=new HashSet<>();
        int max=-1;
        for(int i=0;i<size;i++){
            if(arr[i]>max)
            max=arr[i];
            h.add(arr[i]);
        }
        if(max<0)
        return 1;
        
        for(int i=1;i<=max+1;i++){
            if(h.contains(i)==false){
                return i;
            }
        }
        return 1;
    }
}
