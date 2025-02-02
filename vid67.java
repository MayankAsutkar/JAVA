abstract class A
{
    public abstract void show();
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
    }
}
