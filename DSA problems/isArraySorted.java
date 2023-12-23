/* Given an array a[ ] of size N. The task is to check if array is sorted or not. A sorted array can either be increasingly sorted or decreasingly sorted. Also consider duplicate elements to be sorted.

Example 3:

Input:
N = 5
a[] = {1 1 2 2 3}
Output: 1 */

class Solution
{
    //Complete the function
    public static int isSorted(int arr[], int n)
    {
       int end=arr[n-1];
       int start=arr[0];
       if(start<=end){
           for(int i=1;i<n;i++){
               if(arr[i]<arr[i-1]){
                   return 0;
               }
           }
       }
       else{
           for(int i=1;i<n;i++){
               if(arr[i]>arr[i-1]){
                   return 0;
               }
           }
       }
       return 1;
    }
}
