/* Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left. */
class Solution {
    public boolean isPalindrome(int x) {
       int n, sum = 0, temp; 
        
        temp = x;
        while (x>0){
            n = x%10;
            sum = (sum*10)+n;
            x=x/10;

        }
        if(temp==sum)
           return true;
        
        else
            return false;
        
    }
    
