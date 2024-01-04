/* You are given a array arr(0-based indexing). The size of the array is given by n. You need to update an element at the given index. The arr[i] of the array is initially set to i+1.

NOTE THAT: You only have to update elements, you don't need to print or return anything. 

Example 1:

Input:
n = 5
index = 4,element = 8
Explanation: Element at 4th index updated to 8 */

class UpdateArray
{
    // Complete the function
    // arr[]: input array
    // index: input  index
    // element: element to be updated
    public static void updateArray(int arr[], int index, int element)
    {
        // Update the element at index
        arr[index] = element;
    }
}
