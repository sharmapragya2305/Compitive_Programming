/* Given two numbers a and b. The task is to find out their LCM. */

public static int LCM(int a, int b){

    //write your code here
    //return LCM of a and b
    
    int x = Math.max(a,b);
    int y = a*b;
    int ans=x;
    
    for (int i=x ; i<=y; i++){
        if (i%a==0 && i%b==0){
        ans = i;
        break;
        
        }
    }
    return ans;
    
    
}
