public class ArmstrongNumber 
{
   public static boolean isArmstrongNum(Integer p)
   {
       integer temp;
       integer digits=0;
       integer sum=0;
       integer last =0;
       temp=p;
       while(temp>0){
           temp=temp/10;
           digits++;
       }
       temp=p;
       while(temp>0)
       {
           last=Math.mod(temp,10);
           sum += (Math.pow(last,digits));
           temp = temp/10;
       }
       if(p==sum)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
}
