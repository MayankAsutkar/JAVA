import tools.AdvCalc;
public class vid56 {
    /*
     * how to make a package?
     * ->first of all make a folder of name same as that of package.
     * ->now to make a file in package:
     * we need to mention:
     * 'package package_name;' at the top of the file.
     * 
     * now we can access this file outside the package by mentioning :
     * import package_name.file_name;
     * 
     * note if we want to access a method from a class outside the package folder then we need to make it public.
     * 
     * //for example instead of writing int num; we will write public int num;
     * //there are 4 types of specifiers:
     * 1>public :
     *      can be accessed out of class and packages as well.
     * 2>private:
     *      can be accessed only in class.
     * 3>default : 
     *      can be accessed anywhere in the package.
     * 4>protected : 
     *      can be accessed in the same file outside the class.
     * 
     *                                      private     protected       public      Default
     * same class                           yes         yes             yes         yes
     * same package subclass                no          yes             yes         yes
     * same package non-subclas             no          yes             yes         yes
     * Different package sub_class          no          yes             yes         no
     * different package non_subclass       no          no              yes         no 
     * 
     */
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        obj.set(12,13);
        
        int x = obj.sum();
        int y = obj.sub();
        int t = obj.multiply();
        int z = obj.div();
        System.out.println("addition:" + x);
        System.out.println("subtraction:" + y);
        System.out.println("multiplication:" + t);
        System.out.println("division:" + z);
        System.out.println();
        
        AdvCalc obj1 = new AdvCalc();
        obj1.num1 = 16;
        obj1.num2 = 15;
        int x1 = obj1.sum();
        int y1 = obj1.sub();
        int t1 = obj1.multiply();
        int z1 = obj1.div();
        System.out.println("addition:" + x1);
        System.out.println("subtraction:" + y1);
        System.out.println("multiplication:" + t1);
        System.out.println("division:" + z1);
    }
}
