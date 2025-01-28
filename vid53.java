import java.util.Scanner;
class A
{
    public A()
    {
        super();
        System.out.println("this is A");
    }
    public A(int x)
    {
        this();
        System.out.println("in A int");
    }
}
class B extends A
{
    public B()
    {
        super(25);
        System.out.println("this is B");
    }
    public B(int x)
    {
        this();
        System.out.println("in B int");
    }
}
public class vid53 {
    public static void main(String[] args) {
        /*
         * what is multiple inheritance ?
         * -> when we inherit from two class to a single class, this is called multiple inheritance.
         * 
         * //IN JAVA THERE IS NO FEATURE LIKE MULTIPLE INHERITANCE.
         * 
         * reason:suppose there is a method y() in both classes c1 and c2 and c3 is the class which is inheriting from c1 and c2.
         * 
         * when we try to call the method y() using c3 class in java it gets confused and therefore java does not have multilevel inheritance.
         *  
         * in cpp to solve this prblm there is a feature called virtual class. 
         * 
         * how to take a input in java?
         * 1>add "import java.util.Scanner;" at the top.//here scanner is class
         * 2>then make a object of the class scanner as follows:
         * 3>Scanner obj = new Scanner(System.in);
         * 4>then suppose if we want to take input for int a;then we write
         * a = obj.nextInt();
         * for float :- nextFloat();
         * for String :- nextLine();
         */
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a");
        a = scan.nextInt();
        System.out.println("a=" + a);


        // B obj = new B();
        //you will not when we create the object of just B both the constructors are called i.e of class A and B.it will class the constructor of both sub class and super class.
        //now let's call parameterized constructor.

        // B obj1 = new B(12);
        //you will notice that when we call this (ignoring super method and all)parameterized constructor of B then for class A the default constructor is called instead of parameterized constructor.

        // this happens becuase of super method in java.
        //super method is called by default in every constructor.
        //super method calls the constructor of upper level class .here A is the super class for B.

        //to call both parameterized constructor we will pass value in super of parameterized constructor of B.
        B obj = new B(5);

        //note:we can print things according to our needs by passing arguements in necessary super method as per requirements.

        // now what if we want to call the parameterized and defualt constructor at the same time:
        // in that case we call the method this() in parameterized constructor which will automatically call the default constructor too.
    }
}
