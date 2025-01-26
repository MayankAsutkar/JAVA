class Human
{
    int age;
    String name;
    Human()
    {
        System.out.println("object created");
    }
    public void show()
    {
        System.out.println("hi");
    }
}
public class vid49 {
    public static void main(String[] args) {
        /*
         * when we write the following code:
         * Human obj = new Human();
         * 
         * here obj is just a reference variable.actual object is created by new Human().
         * 
         * Anonymous object:
         * using new class_name to call methods.here new class_name is anonymous object.
         * 
         * 
         */
        new Human().show();
        new Human().show();
        //the constructor will get called twice cause the object is created twice in heap in case of anonoymous object in java.
    }
}
