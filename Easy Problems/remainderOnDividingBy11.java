/*
Given a big positive number x represented as string, find value of x % 11 or x mod 11. Output is expected as an integer.

Example 1:

Input: x = 1345
Output: 3
Explanation: 1345 % 11 = 3 
*/

class Solution 
{ 
    static int xmod11(String x)
	{    
	    // code here
	     int ans=0;
        
        for(int i=0;i<x.length();i++)  ans=(ans*10+(int)(x.charAt(i)-'0'))%11;
  
        return ans;
        
	
        
	}
} 
