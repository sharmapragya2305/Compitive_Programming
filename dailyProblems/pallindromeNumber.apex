public class pallindromeNum
{
   public static void isPallindrome(Integer n)
   {
       integer r;
       integer sum=0;
       integer temp;
       temp=n;
       while(n>0)
       {
           r=Math.mod(n,10);
           sum=(sum*10)+r;
           n=n/10;
       }
       if(temp==sum){
           system.debug('Pallindrome number');
       }
       else
       {
           system.debug('Not a Pallindrome number');
       }
   }
}
