/*  Given a natural number N. You have to find the number of digits in it.

Note: New line will be added by the driver code

Example 2:

Input:
n = 5534
Output:
4
Explanation: 5534 has 4 digits  */

public static void countDigits(int n){

    //write your code here
    //print number of digits in n
    int count = 0;
    int temp = n;
    while(temp!=0){
        temp= temp/10;
        count++;
    }
    System.out.print(count);

}
