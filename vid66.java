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

public class vid66 
{
    public static void main(String[] args) 
    {
        /*
         * ANONYMOUS INNER CLASS:
         * this is a inner class which we can create without name in main function by adding implementations while making object
         */
        B obj = new B() 
        {
            public void show() 
            {
                System.out.println("in anonymous inner class");
            }
        };//this is an examole of anonymous inner class.
        obj.show();
    }
}
