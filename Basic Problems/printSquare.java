/* Given an integer S, write a program to print the square of size S using * character. 

Before submitting code, verify it by running offline. Does your square visually looks like a square?

Example 2:

Input:
S = 4
Output:


Explanation:
It's a square! Each side contains S = 4 *. */

public static void square(int s){
    //Complete the code given below
    for( int i=1;i<=s;i++ ){
        for(int j =1;j<=s;j++){
            if(i==1 || i==s || j==1 ||j==s){
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
                System.out.print(" ");
                
            }
        }
        System.out.println();
       
           
    }
}
