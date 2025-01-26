class student {
    int id;
    static int y;
    String x;

    public void show() {
        System.out.println("id:" + id + " x:" + x + " y:" + y);
    }

    // now let's create a static method here:
    public static void show1() {
        System.out.println("Y : " + y);
    }// if we want to use no_static variables in static method in java:
     // we can do as follows:

    public static void show2(student obj) {
        System.out.println("id:" + obj.id + " x:" + obj.x + " y:" + y);
    }
}

public class vid40 {
    public static void main(String[] args) {
        /*
         * static variable:
         * it is used to make an method of a class directly accessible using class.we
         * don't need to create a reference variable in this case.
         * we just need to add static keyword while declaring that method in class.
         * 
         * //in static method we can only use static variables in it.The reason is when
         * we try to call that method in main function it don't know to use which
         * object's variable.
         */
        student mayank = new student();
        student rohan = new student();

        mayank.id = 12;
        mayank.x = "lol";
        mayank.y = 34;

        rohan.id = 13;
        rohan.x = "LMAO";
        rohan.y = 56;

        mayank.show();// here the output for y will be also 56 cause the static type is directly
                      // shared by class so basically you can't store different values in that.
        // so we will directly assign values using class as follows:
        // class_name.method();
        rohan.show();

        student.y = 45;
        mayank.show();
        rohan.show();

        // vid41(static method in java:)
        student.show1();

        student.show2(mayank);
    }
}
