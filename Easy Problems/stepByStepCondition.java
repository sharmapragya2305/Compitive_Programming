/* Sometimes, the normal if-else isn't enough. In such cases, we have what we call ladder if and else conditions.  So here we'll learn to use them.

Given a positive integer N. Your task is to check if it divisible as given below:
1. If it is divisible by 2, print "Two".
2. If it is divisible by 3, print "Three".
3. If it is divisible by 11, print "Eleven".
4. If not follow above three rules, print "-1".
Note: If N is divisible by more than one of the above given numbers, print the one which is largest.

Example 1:

Input:
3

Output:
Three */

class Geeks {
	 static void isDivisibleByPrime (int N) 
	 {
             //Your code here
             if (N%11==0){
                System.out.println("Eleven"); 
             }
            else if (N%3==0){
                 System.out.println("Three");
             }
             else if (N%2==0){
                 System.out.println("Two");
             }
             else
       System.out.println("-1");
	 }

}
