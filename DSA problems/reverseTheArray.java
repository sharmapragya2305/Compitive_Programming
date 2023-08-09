/* Given an array arr of size n. You need to reverse the array.

Example 1:

Input:
n = 5
arr[] = {1 1 2 2 3}
Output: 3 2 2 1 1 */

class Get {
    public static void reverseArray(int arr[], int n) {
        // Your code here
        int low=0;
        int high=n-1;
        
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            
            low++;
            high--;
        }
    }
}
