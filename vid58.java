class A
{
    public void show()
    {
        System.out.println("in A");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("in B");
    }
}
class C extends B
{
    public void show()
    {
        System.out.println("in c");
    }
}
class D
{
    public void show()
    {
        System.out.println("in D");
    }
}
public class vid58 {
    public static void main(String[] args) {
        // POLYMORPHISM IN JAVA
        /*
         * The word ‘polymorphism’ means ‘having many forms’. In Java, polymorphism
         * refers to the ability of a message to be displayed in more than one form.
         * This concept is a key feature of Object-Oriented Programming and it allows
         * objects to behave differently based on their specific class type.
         * 
         * Real-life Illustration of Polymorphism in Java: A person can have different
         * characteristics at the same time. Like a man at the same time is a father, a
         * husband, and an employee. So the same person possesses different behaviors in
         * different situations. This is called polymorphism.
         * 
         * poly->many,morphism->behaviour
         * two types:
         * a>Run-Time polymorphism
         * b>Compile-Time polymorphism
         * 
         * method overloading -> ex of compile time polymorphism
         * method overriding -> ex of run time polymorphism
         * 
         * //vid59(DYNAMIC METHOD DISPATCH IN JAVA)
         * Method overriding is one of the ways in which Java supports Runtime
         * Polymorphism. Dynamic method dispatch is the mechanism by which a call to an
         * overridden method is resolved at run time, rather than compile time.
         * 
         * When an overridden method is called through a superclass reference, Java
         * determines which version(superclass/subclasses) of that method is to be
         * executed based upon the type of the object being referred to at the time the
         * call occurs. Thus, this determination is made at run time.
         * 
         * At run-time, it depends on the type of the object being referred to (not the
         * type of the reference variable) that determines which version of an
         * overridden method will be executed
         * 
         * A superclass reference variable can refer to a subclass object. This is also
         * known as upcasting. Java uses this fact to resolve calls to overridden
         * methods at run time.
         */

         A obj = new A();
         obj.show();
         
         B obj1 = new B();
         obj1.show();

         C obj2 = new C();
         obj2.show();
         System.out.println();

         A obj3 = new B();//this is allowed.Here we are making a reference variable to type A and assigning object of B
         obj3.show();
         
         obj3 = new A();
         obj3.show();
         
         obj3 = new C();
         obj3.show();
         System.out.println();

         B obj4 = new C();
         obj4.show();
         
         obj4 = new B();
         obj4.show();

         //we can assign a different object only if the assigned object are from the subclasses or the class itself.
         //for example if the reference variable is of the type B  we can only assign object of B or C (not A(the superclass)).
         
  
    }
}
