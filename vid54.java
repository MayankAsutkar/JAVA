import tools.AdvCalc;

class Calc
{
    public int add(int n1,int n2)
    {
        return n1 + n2;
    }
}
class AdvCalc extends Calc
{
    public int add(int n1,int n2)
    {
        return n1 + n2 + 1;
    }
}
public class vid54 {
    public static void main(String arg[])
    {
        //suppose there is a method having same name in both super class and sub class.
        //then in that case the method present in sub class is called overiding super class.
        //this is known as METHOD OVERRIDING.
        AdvCalc obj = new AdvCalc();
        int r = obj.add(1,2);
        System.out.println(r);
    }

}
