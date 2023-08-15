/* Union of two arrays can be defined as the common and distinct elements in the two arrays.
Given two sorted arrays of size n and m respectively, find their union.


Example 1:

Input: 
n = 5, arr1[] = {1, 2, 3, 4, 5}  
m = 3, arr2 [] = {1, 2, 3}
Output: 1 2 3 4 5
Explanation: Distinct elements including 
both the arrays are: 1 2 3 4 5. */
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        int i=0,j=0;
        ArrayList<Integer > Union=new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(Union.size()==0 || Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
                i++;
            }
            else{
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
                j++;
            }
        }
        while(i<n){
             if (Union.get(Union.size()-1) != arr1[i])
             Union.add(arr1[i]);
             i++;
        }
        while(j<m){
            if (Union.get(Union.size()-1) != arr2[j])
            Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
}
 
