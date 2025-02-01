class A
{
    void  show1()
    {
        System.out.println("in A");
    }
}
class B extends A
{
    void  show2()
    {
        System.out.println("in B");
    }
}

public class vid62 {
    public static void main(String[] args) {
        System.out.println("hello");
        /*
         * upcasting and downcasting in java(togrther called TypeCasting)
         * 
         * Typecasting is one of the most important concepts which basically deals with
         * the conversion of one data type to another datatype implicitly or explicitly.
         * In this article, the concept of typecasting for objects is discussed.
         * Just like the data types, the objects can also be typecasted. However, in
         * objects, there are only two types of objects, i.e. parent object and child
         * object. Therefore, typecasting of objects basically means that one type of
         * object (i.e.) child or parent to another. There are two types of typecasting.
         * They are:
         * 1>UpCasting
         * 2>DownCasting
         * 
         * Upcasting:
         * Upcasting: Upcasting is the typecasting of a child object to a parent object. Upcasting can be done implicitly. Upcasting gives us the flexibility to access the parent class members but it is not possible to access all the child class members using this feature. Instead of all the members, we can access some specified members of the child class. For instance, we can access the overridden methods
         * 
         * DownCasting:
         * Downcasting: Similarly, downcasting means the typecasting of a parent object to a child object. Downcasting cannot be implicit.
         * 
         * 
         */
        A obj = new B();
        obj.show1();
        // obj.show2()//this will give an error.

        B obj2 = (B)obj; // this is called downCasting.
        obj2.show2();
        obj2.show1();
    }
}
