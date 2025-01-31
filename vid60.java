import java.util.Scanner;
final class calc
{
    public void show()
    {
        System.out.println("in calc");
    }
}
// class AdvCalc extends calc//this will give an error
// {

// }

class A
{
    public final void show()
    {
        System.out.println("super class");
    }

}
class B extends A
{
    // public void show()       //this will give error since we are trying to override a final method.
    // {
    //     System.out.println("sub class");
    // }
}

public class vid60 {
    public static void main(String[] args) {
        /*
         * final keyword in java:
         * this can be used for variable method and class.
         * 
         * //for variables final keyword states that once a value of a variable is
         * defind it cannot be changed later .It's like const in CPP.
         * Syntax:
         * final data_type var_name = value;
         * 
         * //using fianl keyword in class states that no one can inherit your class.
         * for ex if we made a class name calc and a class named AdvCalc and AdvCalc is inheriting the calc and using it.But we don't want it to inherit calc data in such case we can use 'final' keyword in java.
         * 
         * syntax:
         * final Class class_name
         * {
         *   //operations.
         * }
         * 
         * //using final keywords with methods.//suppose we allowed a class to inherit our data and methods.
         * //but the sub class is trying to override a method which we don't want to happen.
         * //In such case we can use final keyword for methods.
         * syntax:
         * public final return_type method_name()
         * {
         *      //operations
         * }
         */
        final int x = 10;
        System.out.println("x="+x);

        // x = 10;//this will give error.

        Scanner scan = new Scanner(System.in);

        final int y;
        System.out.println("enter the value for y");
        y = scan.nextInt();
        System.out.println("y="+y);
    }
}