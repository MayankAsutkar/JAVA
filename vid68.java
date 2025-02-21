interface A 
{
    int age = 12;    
    String area = "afghan";
    
    void show();
    void config();
}
class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
}
public class vid68 {
    public static void main(String[] args) {
        /*
         * INTERFACE IN JAVA:
         * An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class.
         * 
         * instead of creating a abstract class we can create a interface in java.
         * syntax:
         * interface name
         * {
         *      //operations
         * }
         * remember:
         * ->in an interface a method is by default abstract and public so we don't need to mention it:
         * ->if we create a variable in an interface it is by default static and final.
         * 
         * how to inherit from interface:(we use implements instead of extends)
         * syntax:
         * class B implements A
         * {
         *      //operations
         * }
         */
        B obj = new B();
        obj.show();
        obj.config();

        System.out.println(B.age);
        System.out.println(B.area);

        System.out.println(A.age);//since the variables are static by default we can diretly access them using the interface.
        System.out.println(A.area);

        
    }
}
