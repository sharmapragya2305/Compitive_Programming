/* Given an integer n check if n is prime or not.
A prime number is a number that is divisible by 1 and itself only.

Example 1:

Input:
n = 13
Output: 
True
Explanation:
17 is  divisible by  only 1 and 13.
So it's a prime number. */

public static boolean prime(int n){
    
    //Write your code here
    //returns a boolean value 
    if (n==1)
    return false;
    if (n==2 || n==3)
    return true;
    if(n%2==0 || n%3==0)
    return false;
    for(int i=5 ; i*i<=n; i=i+6)
    if(n%i==0|| n%(i+2)==0)
    return false;
    return true;
    
    
}
