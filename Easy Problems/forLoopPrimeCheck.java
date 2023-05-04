/* Here, we will use for loop and check if the given number n is prime or not.

Note:  A number is prime if it's divisible by itself and 1. Also, 1 is not prime.

Example 1:

Input:
1

Output:
No */

class Geeks {
    static void isPrime(int n) {
        if (n==1){
            System.out.println("No");
            return;
            
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Your code here
            if(n%i==0){
                System.out.println("No");
                return;
                
            }
        }
            
           System.out.println("Yes"); 
    }
        }
