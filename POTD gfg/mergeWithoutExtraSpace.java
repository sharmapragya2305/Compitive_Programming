/* Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order without using any extra space. Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.

Example 1:

Input: 
n = 4, arr1[] = [1 3 5 7] 
m = 5, arr2[] = [0 2 6 8 9]
Output: 
arr1[] = [0 1 2 3]
arr2[] = [5 6 7 8 9]
Explanation:
After merging the two 
non-decreasing arrays, we get, 
0 1 2 3 5 6 7 8 9. */

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
    
        int i = n - 1; // Index of last element in arr1
        int j = 0;     // Index of first element in arr2
        
        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                // Swap arr1[i] and arr2[j]
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--; // Move one step back in arr1
                j++; // Move one step forward in arr2
            } else {
                break; // arr1[i] is already smaller than or equal to arr2[j]
            }
        }
        
        // Sort both modified arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
