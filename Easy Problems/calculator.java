/*Given two numbers a and b; you need to perform basic mathematical operation on them. You will be provided an integer named as operator. 

If operator equals to 1 add a and b, then print the result.

If operator equals to 2 subtract b from a, then print the result.

If operator equals to 3 multiply a and b, then print the result.

If operator equals to any another number, print "Invalid Input"(without quotes).

Note : You don't have to print any new lines after printing the output.


Example 1:

Input:
a = 4
b = 5
operator = 3
Output: 
2
Explanation: 4 * 5 = 20 */


public static void utility(int a, int b, int operator){

    //write your code here
    if (operator == 1){
        System.out.print(a+b);
    }
    else if(operator==2){
        System.out.print(a-b);
    }
    else if(operator==3){
        System.out.print(a*b);
    }
    else{
        System.out.println("Invalid Input");
    }
    
}
