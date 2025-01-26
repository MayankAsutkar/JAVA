class human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class vid43 {
    public static void main(String[] args) {
        /*
         * //ENCAPSULATION IN JAVA
         * 
         * Encapsulation in Java refers to integrating data (variables) and code
         * (methods) into a single unit. In encapsulation, a class's variables are
         * hidden from other classes and can only be accessed by the methods of the
         * class in which they are found.
         * 
         * by making variables private we are saying they cannot be directly accessed in
         * the main function.they can still be accessed inside their class.
         * 
         * to make a variable private just add word "private" before the data type:
         * syntax:
         * private datatype var_name;//you can assign value here itself.
         * 
         * //VID44 : GETTERS AND SETTERS
         * here methods getname() and getage() are getters and methods setage() and
         * setname() are setters.in vsc we can create getters and setters directly using
         * : right click -> source action .
         * 
         */
        human sapien = new human();
        sapien.setAge(65);
        sapien.setName("mister kumar");

        System.out.println(sapien.getName() + " : " + sapien.getAge());

        
    }
}