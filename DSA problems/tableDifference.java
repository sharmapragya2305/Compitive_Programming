/* Given two number n1 and n2, n1 > n2. Find the differences between mathematical tables of n1 and n2.

Example 1:

Input:
n1 = 9, n2 = 4
Output:
5 10 15 20 25 30 35 40 45 50 
Explanation:
9 - 4 = 5, 18 - 8 = 10 , 27 - 12 = 15,
36 - 16 = 20, 45 - 20 = 25, 54 - 24 = 30,
63 - 28 = 35, 72 - 32 = 40, 81 - 36 = 45,
90 - 40 = 50. */

public static void difference(int n1, int n2){
    
    //Write your code here
    for(int i=1;i<=10;i++){
        System.out.print(((n1*i)-(n2*i))+" ");
    }
    
}
