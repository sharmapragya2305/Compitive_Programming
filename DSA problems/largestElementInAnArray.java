/* Given an array A[] of size n. The task is to find the largest element in it.
 

Example 2:

Input:
n = 5
A[] = {1, 8, 7, 56, 90}
Output:
90
Explanation:
The largest element of given array is 90. */

class Compute {
    
    public int largest(int arr[], int n)
    {
        for(int i=0;i<n;i++){
            Arrays.sort(arr);
            return arr[n-1];
        }
        return -1;
        
    }
}
