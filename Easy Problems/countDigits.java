/* Given a natural number N. You have to find the number of digits in it.
 

Example 1:

Input:
n = 5534
Output:
4
Explanation: 5534 has 4 digits */

public static void countDigits(int n){

    //write your code here
    //print number of digits in n
    int count = 0;
    while(n>0){
        n = n/10;
        count=count+1;
    }
    System.out.print(count);

}
