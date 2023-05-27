/* Given a matrix(2D array) M of size N*N consisting of 0s and 1s only. The task is to find the column with maximum number of 0s.

Example 1:

Input:
3
1 1 0
1 1 0
1 1 0

Output:
2
*/

class Geeks{
    
    static int columnWithMaxZero(int a[][],int n){
        
        // Your code here
         int count;
       int maxCount = 0;
       int index = 0;
       
       for(int i = 0; i < n; i++){
           count = 0;
           for(int j = 0; j < n; j++){
               if(a[j][i] == 0){
                   count++;
               }
           }
           if(count > maxCount){
              maxCount = count;
               index = i;                
           }
       }
       return index;
        
        
    }
}
