abstract class A
{
    public abstract void show();
    public void F()
    {
        System.out.println("fff");
    }
}
class B
{
    public void G()
    {
        System.out.println("ggg");
    }
    static class C
    {
        public void X()
    {
        System.out.println("xxx");
    }
    }
}
public class vid67 {
    public static void main(String[] args) {
        /*
         * VID67:ABSTRACT AND ANONYMOUS INNER CLASS.
         * we can use them both together as follows:
         * 
         */
        A obj = new A()
        {
            public void show()
            {
                System.out.println("hurray");
            }
        };
        obj.show();
        obj.F();
        B.C obj1 = new B.C();
        obj1.X();
    }
}
