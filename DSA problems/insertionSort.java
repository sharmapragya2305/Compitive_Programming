/* The task is to complete the insert() function which is used to implement Insertion Sort.


Example 1:

Input:
N = 5
arr[] = { 4, 1, 3, 9, 7}
Output:
1 3 4 7 9 */

class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
       
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=0;i<n;i++){
          int key = arr[i];
          int j=i-1;
          while(j>=0 && arr[j]>key){
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=key;
      }
  }
}
