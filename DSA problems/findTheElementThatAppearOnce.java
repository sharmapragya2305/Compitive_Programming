/* Given a sorted array A[] of N positive integers having all the numbers occurring exactly twice, except for one number which will occur only once. Find the number occurring only once.

Example 2:

Input:
N = 5
A = {1, 1, 2, 5, 5}
Output: 2
Explanation: 
Since 2 occurs once, while
other numbers occur twice, 
2 is the answer. */

class Sol
{
    public static int search(int A[], int N)
    {
        // your code here
        int XOR = 0;
        for(int i=0;i<N;i++){
            XOR = XOR ^ A[i];
        }
        return XOR;
    }
}
