/* Logical operators are used when we want to check the truth value of certain statements. Logical operators help us in checking multiple statements together for their truthness.

Here we will learn logical operators like AND(&&), OR(||), NOT(!). These operators produce either a true or a false as an output.

Example 1:

Input:
true false
Output:
false true false
Explanation:
true&&false=>false
true||false=>true
!(true) && !(false)=>false */

class Geeks{
    
    static void logicOp(boolean a, boolean b){
        /*output (a&&b), (a||b), and ((!a)&&(!b))separated by spaces*/
        System.out.print(a&&b);
        System.out.print(" ");
        System.out.print(a||b);
        System.out.print(" ");
        System.out.print(!a&&!b);
        System.out.print(" ");
    }
}
