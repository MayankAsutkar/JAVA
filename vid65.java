class A 
{
    public void show() 
    {
        System.out.println("in A");
    }

    class B
     {
        public void show() 
        {
            System.out.println("in B");
        }
    }
    static class C
    {
        public void show() 
        {
            System.out.println("in C");
        }
    }
}

public class vid65 {
    public static void main(String[] args) {
        /*
         * INNER CLASS IN JAVA:
         * we can create a class inside a class.java allows this.
         * 
         * now how to access the inner class in main function.
         * we cannot directly make a object of inner class.
         * 
         * to makea object of inner class we following syntax:(outer class:out,inner class:inn)
         * out.inn obj = (outerclass objcet).new inn();
         * 
         * to directly access using outer class we can make the inner class static.(note static class feature can only used by inner classes)
         * syntax for making object of static inner class:
         * out.inn obj = new out.inn();
         */
        A obj1 = new A();
        obj1.show();

        A.B obj2 = obj1.new B();
        obj2.show();

        A.C obj3 = new A.C();
        obj3.show();
    }
}
