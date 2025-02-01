class Laptop {
    int price;
    String model;

    // public String toString()
    // {
    //     // System.out.println("hey");
    //     return "hey";
    // }

    public boolean equals(Laptop obj)
    {
        return this.model == obj.model && this.price == obj.price;
    }
}

public class vid61 {
    public static void main(String[] args) {
        /*
         * VID 61:(OBJECT CLASS EQUAL TOSTRING HASHCODE IN JAVA)
         * 
         * Why use the toString method in Java?
         * It contains the toString method. The toString method is used to return a
         * string representation of an object. If any object is printed, the toString()
         * method is internally invoked by the java compiler.
         * 
         * 
         */
        Laptop obj = new Laptop();
        obj.model = "Lenovo yoga";
        obj.price = 20000;
        System.out.println(obj);
        System.out.println(obj.toString());

        //here toString is the method from a super class 
        //we can override that method by creating an another method.
        //if we didn't override the toString() it will give an output as class_name + some hexadecimal value with '@' between them.

        //now let's say we create an another object of laptop and we compare them:
        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo yoga";
        obj2.price = 20000;
        System.out.println(obj2);

        boolean result = obj == obj2;
        System.out.println(result);//this will give false!but why so?cause both the object have there data similar.
        //this happened cause here the compiler has commpared the hashcode value of both the objects.

        result = obj.equals(obj2);//this is a in-build method which compare two data.
        System.out.println(result);

        //to solve this problem we can make our own method named equals which will override original one.

        System.out.println(obj.equals(obj2));
    }
}
