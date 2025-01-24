class calculator {
    int a; // this is called variable or attribute under class.

    // this is called method under class (note : this is similar as functions in
    // cpp.methods are just another name in OOP)
    public int add(int n1, int n2) {
        System.out.println("in add");
        int r = n1 + n2;
        return r;
    }
}

public class vid21 {
    public static void main(String arg[]) {
        System.out.println("hello");
        /*
         * when we create a class in a object it is passed to byte code class and the
         * object is created at JVM.
         * 
         * how to call the method from the above class:
         * first of all we need to create an object:
         * syntax:
         * class_name object_name = new class_name();
         * here new is the keyword.
         * 
         * What's JDK,JRE and JVM?
         * JDK -> Java development kit
         * JVM -> Java virtual machine
         * JRE -> Java runtime environment.
         * 
         * so basically JDK includes JRE inside it and JRE includes JVM inside it.
         * the code file which we want to run first gets converted into bytecode inside
         * a class and then runned inside JVM and JRE provides all the necessary files
         * and libraries.
         * when we download JDK both JRE and JVM gets with it.
         * 
         * Note:java is a hybrid Object oriented programming language that uses both
         * compiler and interpreter.
         * 
         * what is Javac?
         * ->"javac" is a compiler. It is the primary Java compiler included in the Java
         * Development Kit (JDK), which means it translates Java source code into
         * bytecode that can be executed by the Java Virtual Machine (JVM).
         * 
         * Java virtual machine, or JVM, loads, verifies, and runs Java bytecode. It is
         * known as the interpreter or the core of the Java programming language because
         * it runs Java program.
         * 
         */
        int num1 = 4;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);

        calculator calc = new calculator();
        calc.add(num1, num2);

        int res = calc.add(num1, num2);
        System.out.println(res);
    }
}
