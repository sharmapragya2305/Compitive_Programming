/* Given two numbers A and B. The task is to find the GCD of  A and B.
The GCD of two numbers is the largest number that can divide both A and B perfectly */


public static int gcd(int a, int b){

        
    //code here to calculate and return gcd of a and b
    int ans = 0;
    int x = Math.min(a,b);
    for (int i=1;i<=x;i++){
        if(a%i==0 && b%i==0)
        ans = i;
    }
    
    return ans;

        
}
