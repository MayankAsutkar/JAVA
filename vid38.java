public class vid38 {
    public static void main(String[] args) {
        /*
         * ><>< MUTABLE VS IMMUTABLE STRINGS IN JAVA ><><
         * 
         * let's talk about the code written below:
         * first we create an reference variable 'name' for object.
         * now when we concatinate other string with name (in this case 'Asutkar') we are not updating existing data in the existing object.For this a new object will be created in the heap.
         * 
         * now let's talk about s1 and s2 inbelow code.note both the ref_var have same data in it.
         * in such case there will be no creation of xtra object in heap.both the ref_var will share the same obj(since both have same data).
         * 
         * ><>< immutable String ><><
         * which cannot be changed
         * 
         * ><>< mutable string ><><
         * which can be changed ><><
         * 
         * ///// VID 39 ////
         * mutable string are of tw0 types:
         * a>StringBuffer 
         * b>StringBuilder
         * 
         * StringBuffer:
         * ->syntax:
         * StringBuffer var_name = new StringBuffer("data");
         * 
         * capacity method in StringBuffer:
         * ->The capacity () method is a part of the StringBuffer class. It basically denotes the amount of space available to store new characters. The method returns the current capacity of the string buffer. By default, an empty StringBuffer contains 16 character capacity. So when new characters are added the output is the length of characters+16 is returned. 
         * 
         * append method in java:
         * ->In Java, append refers to adding content to the end of an existing object, typically a string or a list.
         * 
         * tostring method in java:
         * ->this allows us to convert stringbuffer data to string format. 
         * 
         * deleteCharAt method:
         * ->this allows us to delete a char at a specific index.
         * 
         * insert method in java:
         * ->this allows us to add string at a specific index of an another string.
         */
        String name = "Mayank";
        name = name + " Asutkar";
        System.out.println(name);

        String s1="navin";
        String s2="navin";

        //StringBuffer in java:

        //capacity()
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer("lol");
        System.out.println(sb1.capacity());

        //append()
        sb1.append(" LMAO");
        System.out.println(sb1);

        //toString method

        // String str = sb;//this will give error
        String str = sb.toString();
        System.out.println(str);

        //deleteCharAt method:
        System.out.println(sb1.deleteCharAt(2));

        //insert method
        System.out.println(sb1.insert( 0,"hi "));

    }
}
