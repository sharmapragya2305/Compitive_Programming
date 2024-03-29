/* You are given an array arr(0-based indexing). The size of the array is given by n. You need to delete an element at given index and print the modified array. The arr[i] of array is initially set to i+1.
Deletion means you need to shift all the elements after that index to the left by 1 position and set the last element as zero.

Example 2:

Input:
n = 5
index = 0
Output: 2 3 4 5 0 */

class Solution
{
    // Complete the function
    public static void deleteFromArray(int arr[], int n, int index)
    {
        // Your code here
        for(int i=index; i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = 0;
    }
}
