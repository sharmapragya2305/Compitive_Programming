/*Given an integer N find the sum of the first N natural number.

Example 1:

Input:
N = 10
Output: 
55
Explanation:
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55.*/



public static int nSum(int n){
    int p = 0;

    //Write your code here to calculate and return sum of n number.
    for(int i=1 ; i<=n; i++){
        p = p+i;
    }
    
    
    
    return p;
}
