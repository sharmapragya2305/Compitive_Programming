/*Given two strings S1 and S2 consisting of only lowercase characters whose anagrams are almost equal. The task is to count the number of characters which needs to be edited(delete) to make S1 equal to S2.

Example 1:

Input:
madame
madam

Output:
1

Explanation:
String S1 = madame, string S2 = madam. character 'e' in 
first string is need to be deleted to make S1 equal to S2. */

class Geeks{
    
    static int coutChars(String s1, String s2)
    {
        
       //Your code here
     int[] a = new int[26];
      int[] b = new int[26];
       
       for(int i=0;i<s1.length();i++)
       {
           char c = s1.charAt(i);
           a[c - 'a']++;
       }
       
       for(int i=0;i<s2.length();i++)
       {
           char c = s2.charAt(i);
           b[c - 'a']++;
       }
       
       int cnt = 0;
       for(int i=0;i<26;i++)
       {
           cnt += Math.abs(a[i] - b[i]);
       }
       return cnt;
    }
}
