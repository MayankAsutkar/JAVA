public class vid63 {
    public static void main(String[] args) {
        /*
         * WRAPPER CLASS in JAVA:
         * ----------------------->
         * //note every class extends the obbject class in java.
         * for every primitive type we have a class for it:such class is known as Wrapper class.
         * 
         * for ex:
         * int -> Integer
         * char -> Character
         * double -> Double
         * 
         * assigning value from primitive type to object type is known as boxing or autoboxing.
         * 
         * assigning value from object type to primitive type is known as unboxing or auto-unboxing.
         */

         int num = 12;
         Integer obj = new Integer(12); //this is called boxing
         System.out.println(obj);
         //here java gave a warning that this a old method but it will still work.

         //new method:
         Integer obj1 = 13; // this is called auto-boxing.
         System.out.println(obj1);
         obj1 = num;
         System.out.println(obj1);
         
         int num1 = obj1.intValue(); 
         System.out.println(num1);
         //this is called unboxing //here we use a method name intValue //but this is not compulsion ,we can assign directly using object.
         int num2 = obj1;
         System.out.println(num2);//this is known as auto-unboxing.

         String str = "123";
         int num3 = Integer.parseInt(str);
         System.out.println(num3);
         
    }
}
