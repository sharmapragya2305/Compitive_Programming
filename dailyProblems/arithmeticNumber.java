/* Given three integers  'A' denoting the first term of an arithmetic sequence , 'C' denoting the common difference of an arithmetic sequence and an integer 'B'. you need to tell whether 'B' exists in the arithmetic sequence or not. Return 1 if B is present in the sequence. Otherwise, returns 0.

Example 1:

Input: A = 1, B = 3, C = 2
Output: 1
Explaination: 3 is the second term of the 
sequence starting with 1 and having a common 
difference 2. */

class Solution{
    static int inSequence(int A, int B, int C){
        // code here
        if(C==0){
        if(A==B){
            return 1;
        }else{
            return 0;
        }
    }        
    int N= (B-A)/C + 1;
    if(B== A+(N-1)*C && N>0){
        return 1;
    }else{
        return 0;
    }
}
}
