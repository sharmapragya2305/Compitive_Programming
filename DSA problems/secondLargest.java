/* Given an array Arr of size N, print second largest distinct element from an array.

Example 1:

Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the 
array is 35 and the second largest element
is 34. */

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int largest = arr[0];
        int secondlargest = -1;
        for (int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
                
            }
            else if(arr[i]!=largest && arr[i]>secondlargest){
            secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
}
