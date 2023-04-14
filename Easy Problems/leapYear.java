/*Given an integer y. Check whether it can represent a leap year or not.

Example 1:

Input:
y = 2020
Output:
True
Explanation:
2020 is leap year as it multilpe of 4 but
not of 100 */

public static void utility(int y){
    String isLeap = "False";

    //Your code below
    //Assign True or False to isLeap
    if(y%4==0){
        if(y%100==0){
            if(y%400==0)
            isLeap="True";
            else
            isLeap="False";
        }
        else
        isLeap="True";
    }
    else
    isLeap="False";
    
    //Your code above
    
    //The line below prints the output
    System.out.println(isLeap);
}
