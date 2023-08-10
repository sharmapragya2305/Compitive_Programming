/* Given an integer array arr of size n, you need to sum the elements of arr.

Example 1:

Input:
n = 3
arr[] = {3 2 1}
Output: 6 */

class Get
{
    public static int sumElement(int arr[], int n)
    {
        // Your code here
        int count =0;
        for(int i=0;i<n;i++){
            count+=arr[i];
            
            
        }
        return count;
    }
}
