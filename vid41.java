class mobile
{
    String brand;
    int price;
    static String name;

    static
    {  
        name="chiron";
        System.out.println("in static block");
    }///this is static block.
    
    public mobile()
    {
        brand = "buggati";
        price = 51_00_00_000;
        System.out.println("in constructor block");

    }//this is a constructor.we can assign by_default values here.

    public void show() {
        System.out.println("name:" + name + " price:" + price + " brand:" + brand);
    }
}
public class vid41 {
    public static void main(String[] args) throws ClassNotFoundException
    {
        // mobile sam = new mobile();
        // sam.show();

        //In Java, the java. lang. Class class is a built-in class that represents a class or interface at runtime.
        Class.forName("mobile");//we can simply just load your class creating a reference variable.
        //we will get output under static block.
    }
}
