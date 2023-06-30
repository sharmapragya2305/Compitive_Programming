/* Bitwise operators are useful when we want to work with bits. Here, we'll take a look at them.

Given three positive integers a, b and c. Your task is to perform some bitwise operations on them as given below:
1. d = a ^ a
2. e = c ^ b
3. f = a & b
4. g = c | (a ^ a)
5. h = ~e
Note: ^ is for xor.

Example 1:

Input:
4 8 2

Output:
0
10
0
2
-11 */

class Geeks {
    static void bitWiseOp(int a, int b, int c) {
        System.out.println(a^a);
        System.out.println(c^b);
        System.out.println(a&b);
        System.out.println(c|(a^a));
        System.out.println(~(c^b));
       

        
    }
}
