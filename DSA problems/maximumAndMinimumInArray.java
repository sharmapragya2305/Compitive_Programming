/* Given an array arr of size n, find maximum and minimum elements in the array.

Example 1:

Input:
N = 4
arr[] = {5 4 2 1}
Output: 5 1 */

class Get
{
    public static int maximumElement(int arr[],int n)
    {
        // Your code here
        Arrays.sort(arr);
        return arr[n-1];
        
    
    }
    
    public static int minimumElement(int arr[],int n)
    {
        // YOUR code here
        Arrays.sort(arr);
        return arr[0];
    }
}
