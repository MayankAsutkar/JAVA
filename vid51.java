class class2 extends class1
{
    public int div()
    {
        return n/m;
    }
    public int mul()
    {
        return n*m;
    }
}
public class vid51
{
    public static void main(String[] args) {
        class2 obj = new class2();
        obj.n =10;
        obj.m =2;
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
        System.out.println(obj.div());
    }
}
