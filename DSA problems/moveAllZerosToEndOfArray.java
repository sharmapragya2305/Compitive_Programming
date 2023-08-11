/* Given an array arr[] of N positive integers. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements.


Example 1:

Input:
N = 5
Arr[] = {3, 5, 0, 0, 4}
Output: 3 5 4 0 0
Explanation: The non-zero elements
preserve their order while the 0
elements are moved to the right. */

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
    }
    
}
