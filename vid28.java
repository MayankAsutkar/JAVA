class sum
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public double add(double a,int b)
    {
        return a+b;
    }
}
public class vid28 {
    public static void main(String arg[])
    {
        /*
         * Method overloading is a programming technique that allows a class to have multiple methods with the same name but different parameters. This feature is used to improve code readability, reusability, and maintainability. 
         * 
         */
        sum obj = new sum();
        double res1=obj.add(1,3);
        System.out.println(res1);
        double res2=obj.add(1,3,5);
        System.out.println(res2);
        double res3=obj.add(1.5,3);
        System.out.println(res3);
    }
}
