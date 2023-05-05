/*Given a number N, find the first digit of the number.

Example 1:

Input:
N = 123
Output:
1  */


public static int firstDigit(int n){
    // code here
    
    while(n>9){
       n=n/10;
      
       
    }
    return n;
    
}
