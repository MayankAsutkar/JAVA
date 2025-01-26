class human {
    private int age;
    private String name;

    // public void setage(int age) {
    // age = age;
    // }

    // public int getage() {
    // return age;
    // }

    // public void setName(String name) {
    // name = name;
    // }

    // public String getName() {
    // return name;
    // }

    // here we can create obj inside class :
    public int getAge() {
        return age;
    }

    public void setAge(int age,human obj) {
        human obj1=obj;
        obj1.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name,human obj) {
        human obj1 = obj;
        obj1.name = name;
    }

    // to avoid creating obj inside the method there is a this keyword :
    // instead of passing obj inside the method we can use this instead of obj1.

    public int getage() {
        return age;
    }

    public void setage(int age,human obj) {
        human obj1=obj;
        obj1.age = age;
    }

    public String getname() {
        return name;
    }

    public void setname(String name,human obj) {
        human obj1 = obj;
        obj1.name = name;
    }
}

public class vid45 {
    public static void main(String[] args) {
        // human obj = new human();
        // obj.setage(42);
        // obj.setName("johny");
        // System.out.println(obj.getage() + " : " + obj.getName());//these will give zero null cause we did age = age and name = name

        human obj = new human();
        obj.setAge(42,obj);
        obj.setName("johny",obj);
        System.out.println(obj.getAge() + " : " + obj.getName());


        
        human obj1 = new human();
        obj1.setage(46,obj);
        obj1.setname("monny",obj);
        System.out.println(obj.getage() + " : " + obj.getname());
    }
}
