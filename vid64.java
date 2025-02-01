abstract class car
{
    public abstract void drive();
    public abstract void fly();
    public void play_music()
    {
        System.out.println("play_music");
    }
}
abstract class wagonr extends car
{
    public void drive()
    {
        System.out.println("Driving");
    }
}
class Advwagonr extends wagonr
{
    public void fly()
    {
        System.out.println("flying");
    }
}

public class vid64 {
    public static void main(String[] args) {
        /*
         * ABSTRACT KEYWORD IN JAVA:
         * In Java, abstract is a non-access modifier in java applicable for classes, and methods but not variables. It is used to achieve abstraction which is one of the pillars of Object Oriented Programming(OOP). Following are different contexts where abstract can be used in Java.
         * 
         * Abstraction in Java is a fundamental concept in Object-Oriented Programming (OOP) that hides complex details and shows only the essential features of an object. It's used to simplify complex systems and reduce programming effort. 
         * 
         * suppose if we want to just declare a method in java and define it later in other class.in that case we use a keyword named "abstact".
         * 
         * syntax: public abstract void method_name();
         * 
         * if we made a abstract method in a class then that class needs to be a abstract class:
         * 
         * syntax: abstract class class_name{
         *         
         * }
         * 
         * note:we are not allowed to make a object of a abstract class.
         * 
         * we can define a abstract method in a class which is the sub-class of the abstract class containing that abstract method.
         * note:if we created a subclass of a abstract class then it is compulsory to define all the abstract methods of the super class in the sub class.
         * 
         * 
         */
        Advwagonr obj = new Advwagonr();
        obj.drive();
        obj.fly();
        obj.play_music();
    }
}
