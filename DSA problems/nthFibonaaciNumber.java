import java.util.*;

public class Solution {

    static int fib(int n){

        if(n==1||n==2){

            return 1;
        }

        else{

            return fib(n-1)+fib(n-2);

        }

    }

 

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result = fib(n);
		System.out.println(result);

        

        

 

        

    }

 

}
