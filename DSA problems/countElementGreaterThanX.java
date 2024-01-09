/* Given an unsorted array arr[] of size N containing non-negative integers. You will also be given an integer X, the task is to count the number of elements which are strictly greater than X. The given integer may or not be present in the array given.

Example 2:

Input:
N = 5
arr[] = {4 5 3 1 2}
X = 3
Output: 2
Explanation: Here X is 3. The elements
greater than X are 4 and 5. */

class Solution
{
    // arr[]: input array
    // n: size of the array
    // x: element for which you need to return the count
    public static int greaterThanX(int arr[], int n, int x)
    {
        // Your code here
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]>x){
                count ++;
            }
            
        }
        return count;
    }
}
