/* Given a number N find the prime factorization of the number.

Example 1:

Input:
N = 100
Output:
2 2 5 5
Explanation:
100 = 2 * 2 * 5 * 5 */

public static void printPrimeFactorization(int n){
    // code here
    int i=2;
    while(n>1)
    {
        if(n%i==0)
        {
            n=n/i;
            System.out.print(i+" ");
        }
        else
            i++;
    }      
    
    
}
