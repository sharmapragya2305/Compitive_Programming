/* Given an integer N. Write a program to return the factorial of N.
Note: 0 factorial is equal to 1.

Example 2:

Input:
N = 10
Output: 
3628800
Explanation:
1*2*3*4*5*6*7*8*9*10 = 3628800 . */

public static int nFactorial(int n){
    int ans = 1;
    
    //Write your code here
    while (n>0){
        ans = ans * n;
        n--;
    }
    
    return ans;
}
