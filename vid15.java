                                            //TERNARY OPERATORS:
public class vid15{
    public static void  main(String arg[])
    {
        System.out.println("hello");
        /*
         * ternary operators:
         * in if else conditions we can use ternary operators:
         * 
         * ex :
         * int a=5;
         * if(a%2==0)
         * System.out.println("10");
         * else
         * System.out.println("20");
         *
         * we can write the above code in short form using ternary operator:
         * int = a%2==0 ? 10 : 20;
         * System.out.println(result); 
         */
        int a=5;  
        int result = a%2==0 ? 10 : 20;
        System.out.println(result); 
    }
}