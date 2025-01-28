class advcalc extends class2
{
    public double power()
    {
        return Math.pow(n,m);
    }
}//this is an example of single inheritance class2 -> advcalc
//class1 -> class2 -> advcalc is an example of multilevel inheritance. 
public class vid52 {
    public static void main(String[] args) {
        advcalc obj = new advcalc();
        obj.n =10;
        obj.m =2;
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
        System.out.println(obj.div());
        System.out.println(obj.power());
    }
}
