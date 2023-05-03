/* Given an integer n. Write a program to find the nth Fibonacci number.
The nth Fibonacci number is given by the forumla F(n) = F(n-1) + F(n-2). The first few fibonacci numbers are:
1 1 2 3 5... and so on. */


public static int fibonacci(int n){
        
    //Write your code here to calculate
    //to calculate the nth fibonacci number
    
   int a = 0;
   int b = 1;
   int c = 0;
   
   for(int i=2; i<=n; i++){
       c=a+b;
       a=b;
       b=c;
   }
   return c;
        
}
