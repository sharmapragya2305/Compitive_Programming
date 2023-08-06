/* Given an array arr[] of size N containing positive integers and an integer X, find the element in the array which is smaller than X and closest to it.

 

Example 1:

Input:
N = 5
arr[] = {4 67 13 12 15}
X = 16
Output: 15
Explanation: For a given value 16, there
are four values which are smaller than
it. But 15 is the number which is smaller
and closest to it with minimum difference
of 1.
  */

class Solution
{
    // Complete the function
    public static int immediateSmaller(int arr[], int n, int x)
    {
        // Your code here
       int res = -1;
       for(int i=0;i<n;i++){
           if(res<arr[i] && arr[i]<x){
               res=arr[i];
           }
       }
       return res;
    }
}
