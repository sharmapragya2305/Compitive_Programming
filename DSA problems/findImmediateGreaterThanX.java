/* Given an array arr[] of size N containing positive integers and an integer X. You need to find the value in the array which is greater than X and closest to it. ( if no such value exists the answer should be -1)

Example 1:

Input:
N = 5
arr[] = {4 67 13 12 15}
X = 16
Output: 67
Explanation: For a given value 16, there
is only one value 67 that greater than
it and so it is the answer. */

class Solution
{
    // Complete the function
    public static int immediateGreater(int arr[], int n, int x)
    {
        // Your code here
        Arrays.sort(arr);
            for(int i=0;i<n;i++){
                if(arr[i]>x)
                return arr[i];
                
            }
            return -1;
        
        
    }
}
