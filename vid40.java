class student{
    int id;
    static int y;
    String x;

    public void show()
    {
        System.out.println("id:"+id+" x:"+x+" y:"+y);
    }
}
public class vid40 {
    public static void main(String[] args) {
        /*
         * static variable:
         * it is used to make an method of a class directly accessible using class.we don't need to create a reference variable in this case.
         * we just need to add static keyword while declaring that method in class.  
         */
        student mayank = new student();
        student rohan = new student();

        mayank.id = 12;
        mayank.x = "lol";
        mayank.y = 34;
        
        rohan.id = 13;
        rohan.x = "LMAO";
        rohan.y = 56;
        
        mayank.show();//here the output for y will be also 56 cause the static type is directly shared by class so basically you can't store different values in that.
        //so we will directly assign values using class as follows:
        //class_name.method();
        rohan.show();

        student.y = 45;
        mayank.show();
        rohan.show();
    }
}
