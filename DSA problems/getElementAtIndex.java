/* You are given an array arr(0-based indexing). The size of the array is given by n. You need to get the element at index i and return it. If no element exists at i then return -1.

Example 1:

Input:
n = =6
arr[] = {1 2 3 4 5 6}
index = 0
Output: 1
Explanation: The array is {1 2 3 4 5 6}.
The index given is 0. so element at 0th
index is 1. */

class Get
{
    public static int getByIndex(int arr[], int n, int i)
    {
        // Your code here
        if(i<arr.length){
            return arr[i];
        }
        else{
            return -1;
        }
    }
}
