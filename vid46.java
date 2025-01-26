class human
{
    int age;
    String name;
    public human()//default constructor
    {
        name = "maya";
        age = 65;

        System.out.println("this is a default constructor: age:"+age+"name:"+name);
    }

    public human(int age,String name)//PARAMETERIZED CONSTRUCTOR IN JAVA
    {
        this.age = age;
        this.name = name;

        System.out.println("this is a parameterized constructor: age:"+age+"name:"+name);
    }
    public void get_age_name()
    {
        System.out.println("age:"+age + " name:"+name);
    }
}
public class vid46 {
    public static void main(String[] args) {
        /*
         * constructors in java:
         * constructors are the methods in the class which gets automatically called when we create a object.
         * they can be used to set the by-default values for variables in class.
         * 
         * syntax:
         * public class_name()
         * {
         *      operations...
         * }
         * 
         * //vid47 : DEFAULT AND PARAMATERIZED CONSTRUCTORS IN JAVA:
         *  default constructor is provided by java itself and by default syntax is:
         * public class_name()
         * {
         *    
         * }
         * 
         * parameterized constructor;
         * constructor which takes parameter.
         * 
         * ><>< vid48:NAMING CONVENTION IN JAVA ><><
         * there are two types:
         * 
         * 1>Camel casing:
         * 
         * ->for class we use first letter of class name as capital letter ex:(also for interface)
         * class Human
         * {
         * 
         * }
         * ->for variables and methdos of class we use 1 st letter small:
         * ex:name ,age ,getAge() 
         * 
         * ->constructor ex: Human();
         * 
         * -> constant : we use all letters as capital.ex: PIE ,BRAND
         * 
         * ->we differentiaite words by using uppercase before every new word:
         * ex: getName(),setName()
         * 
         * snake casing rule:
         * ->we differentiaite words by using underscore(_) before every new word:
         * ex: get_name(),set_name()
         */
        human obj = new human();
        human obj1 = new human(32,"johny");
        obj.get_age_name();
        obj1.get_age_name();
    }
}
