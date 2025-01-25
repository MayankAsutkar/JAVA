public class vid37 {
    public static void main(String arg[]) {
        /*
         * STRINGS IN JAVA
         * note strings is not a primitive data type in java.
         * 'Strings' is a class under java.
         * 
         * how to define variables of string:
         * syntax:
         * String var = "value";//note as in class here we didn;t used new keyword.
         * 
         * now let's try using new keyword and treat Strings as normal class.
         * syntax:
         * String var = new String();
         * here var is the reference variable for object in String.
         * 
         * ><><>< HASHCODE IN JAVA: ><><><
         * A 'hashCode'(c is capital) in Java is a unique integer value that identifies an object. It's
         * used to store and retrieve objects efficiently in hash-based collections,
         * like HashMap, HashSet, and Hashtable.
         * How it works
         * The hashCode() method is a built-in method in Java that returns an object's
         * hashcode.
         * The hashcode is calculated based on the object's contents and memory address.
         * The hashcode is used to store and retrieve objects in hash-based collections.
         * The hashcode is used to quickly search for and retrieve objects.
         * 
         * ><><>< Some by_default methods we can use for the Strings Are:><><><
         * 1>ref_var.charAt(index);
         * ->it is used to access a char at specific index.
         * 
         * 2>ref_var.concat("string you want to concat");
         * ->it is used to concatinate two strings.
         */

        String var = "mayank";
        System.out.println(var);

        String name = new String();
        System.out.println(name);// this will print nothing

        String name1 = new String("Mayank");// we need to pass an arguement in the constructor of the
                                                           // String to print that name.
        System.out.println(name1);
        System.out.println(name1.hashCode());
        System.out.println(name1.charAt(5));
        System.out.println(name1.concat(" Asutkar"));
        System.out.println(name1);//note there is no change in orginal variable after concatination

        
    }
}
