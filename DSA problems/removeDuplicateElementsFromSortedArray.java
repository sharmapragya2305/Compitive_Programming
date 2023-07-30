/* Given a sorted array A[] of size N, delete all the duplicated elements from A[]. Modify the array such that if there are X distinct elements in it then the first X positions of the array should be filled with them in increasing order and return the number of distinct elements in the array.

Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the number of distinct elements(X) in the array, the driver code will print all the elements of the modified array from index 0 to X-1 as output of your code.

Example 1:

Input:
N = 5
Array = {2, 2, 2, 2, 2}
Output: 2
Explanation: After removing all the duplicates only one instance of 2 will remain i.e. {2} so modify array will contains 2 at first position and you should return 1 after modify the array. */

class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        int i=0;
        for(int j=0;j<N;j++){
            if(A[i]!=A[j]){
                A[++i]=A[j];
            }
        }
        return i+1;
    }
}
