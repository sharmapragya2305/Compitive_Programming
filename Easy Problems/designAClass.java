/* Design a class as described below.

class name : MyClass
function: 1
          function name - display()
          parameters - none
          return type - void
          access modifier - public
          function body - should print
                          "Hello World"  */

class MyClass{
    public void display()
    {
        System.out.println("Hello World");
    }
    public static void main(String args[]){
        MyClass sc=new MyClass();
        sc.display();
    }
}
