/* Given an array arr[] of size N and two elements x and y, use counter variables to find which element appears most in the array. If both elements have the same frequency, then return the smaller element.
Note:  We need to return the element, not its count.

 

Example 1:

Input:
N = 11
arr[] = {1,1,2,2,3,3,4,4,4,4,5}
x = 4, y = 5
Output: 4
Explanation: 
frequency of 4 is 4.
frequency of 5 is 1. */

class Solution {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
        // code here
         int cx = 0;
        int cy = 0;
        for(int i =0 ; i<n;i++){
            if(arr[i] == x){
                cx++;
            }else if(arr[i] == y){
                cy++;
            }
        }
        if(cx > cy){
            return x;
        }else if(cx < cy){
            return y;
        
            
        
        
    }
     return x>y?y:x;
    
}
}
