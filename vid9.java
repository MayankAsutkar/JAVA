                                    //TYPE CONVERSIONS AND TYPE CASTING
public class vid9 {
    public static void main(String a[])
    {
        System.out.println("hello");
        /*
         * we can assign byte value to int directly but cannot assign value of int value to byte.
         * for ex:
         * byte b = 12;
         * int a = 13;
         * 
         * a = b; is correct.  //example of type conversion.
         * 
         * b = a; is wrong.
         * 
         * type conversion:
         * when we assign lower data type to higher data type it is called type conversion.
         * 
         * type casting:
         * when we assign higher data type to lower data type it is called type casting.
         * 
         * syntax (byte and int):
         * byte b = valb;
         * int a = vala;
         * b = byte(a);
         * 
         * note if value of a is out of range that of b,then we assigne value equal to a%256 (-128 to 127)
         * for ex:
         * byte b= 13;
         * int a =260;
         * b = byte(a);
         * here b will have vale then = 4
         * 
         * considering float and int:
         * float a =valf;
         * int t = val2;
         * 
         * t = int(a);
         * 
         * TYPE PROMOTION:
         * byte a=num1;
         * byte b=num2;
         * 
         * in case if a*b is out of byte range,then we can store the value in int .the res will get promoted automatically.
         * 
         * int res = a*b;
         * 
         */
    }
}
