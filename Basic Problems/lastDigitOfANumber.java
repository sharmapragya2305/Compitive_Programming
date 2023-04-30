/*Given an integer N. Write a program to find last digit of the num.

Example 1:

Input:
N = 11
Output: 
1 */

public static void utility(int n){

    //just complete below statement
    int ans;
    if(n>0){
        ans = n%10;
    }
    else{
        ans = (n%10)*-1;
    }

    //below statement print the result
    System.out.println(ans);
}
